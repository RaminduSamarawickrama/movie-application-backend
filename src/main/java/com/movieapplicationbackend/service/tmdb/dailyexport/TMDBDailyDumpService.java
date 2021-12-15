package com.movieapplicationbackend.service.tmdb.dailyexport;

import com.movieapplicationbackend.entity.Movie;
import com.movieapplicationbackend.entity.TvShow;
import com.movieapplicationbackend.repository.MovieRepository;
import com.movieapplicationbackend.repository.TvShowRepository;
import kong.unirest.Unirest;
import org.json.JSONObject;
import org.rauschig.jarchivelib.Compressor;
import org.rauschig.jarchivelib.CompressorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class TMDBDailyDumpService {

    @Autowired
    private MovieRepository movieService;

    @Autowired
    private TvShowRepository tvShowService;

    ArrayList<Movie> movies = new ArrayList<>();

    ArrayList<TvShow> tvShows = new ArrayList<>();

    String decompressedLocation = "src/main/resources/data/json";


    public void movieDump(){
        String url = "https://files.tmdb.org/p/exports/movie_ids_11_12_2021.json.gz";
        String location = "src/main/resources/data/movie.json.gz";

        downloadAndDecompressFile(url, location, decompressedLocation);
        Path path = Paths.get("src/main/resources/data/json/movie.json");

        BufferedReader reader = null;
        try {
            reader = Files.newBufferedReader(path);
            while(reader.readLine() != null) {
                String line = reader.readLine();
                JSONObject jsonObj = new JSONObject(line);
                movies.add(new Movie(jsonObj.getBoolean("adult"),
                        jsonObj.getInt("id"),
                        jsonObj.getString("original_title"),
                        jsonObj.getDouble("popularity"),
                        jsonObj.getBoolean("video")
                ));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        persistMoviesToDatabase();
    }
    public void tvShowDump(){
        String url = "https://files.tmdb.org/p/exports/tv_series_ids_11_12_2021.json.gz";
        String location = "src/main/resources/data/tvShow.json.gz";

        downloadAndDecompressFile(url,location,decompressedLocation);

        Path path = Paths.get("src/main/resources/data/json/tvShow.json");

        BufferedReader reader = null;
        try {
            reader = Files.newBufferedReader(path);
            while(reader.readLine() != null) {
                String line = reader.readLine();
                if(null!=line){
                    JSONObject jsonObj = new JSONObject(line);
                    tvShows.add(new TvShow(
                            jsonObj.getInt("id"),
                            jsonObj.getString("original_name"),
                            jsonObj.getDouble("popularity")
                    ));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        persistTvShowsToDatabase();
    }

    public void downloadAndDecompressFile(String url,String location, String newLocation){
        File result = Unirest.get(url)
                .asFile(location)
                .getBody();
        Compressor compressor = CompressorFactory.createCompressor(new File(location));
        try {
            compressor.decompress(new File(location),new File(newLocation));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void persistMoviesToDatabase(){
        for (int i = 0; i < movies.size(); i = i + 50) {
            if (i + 50 > movies.size()) {
                List<Movie> remMovies = movies.subList(i, movies.size() - 1);
                movieService.saveAll(remMovies);
                movieService.flush();
                break;
            }
            List<Movie> initMovies = movies.subList(i, i + 50);
            movieService.saveAll(initMovies);
            movieService.flush();
        }
    }

    public void persistTvShowsToDatabase(){
        for (int i = 0; i < tvShows.size(); i = i + 50) {
            if (i + 50 > tvShows.size()) {
                List<TvShow> remTvShows = tvShows.subList(i, tvShows.size() - 1);
                tvShowService.saveAll(remTvShows);
                tvShowService.flush();
                break;
            }
            List<TvShow> initTvShows = tvShows.subList(i, i + 50);
            tvShowService.saveAll(initTvShows);
            tvShowService.flush();
        }
    }
}
