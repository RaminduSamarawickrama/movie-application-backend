package com.movieapplicationbackend.service;

import com.movieapplicationbackend.dto.MovieTvShowDTO;
import com.movieapplicationbackend.dto.TrendingResultDTO;
import com.movieapplicationbackend.dto.TrendingShowsDTO;
import com.movieapplicationbackend.dto.constant.ShowType;
import com.movieapplicationbackend.entity.Movie;
import com.movieapplicationbackend.entity.TvShow;
import com.movieapplicationbackend.repository.api.TrendingAPI;
import com.movieapplicationbackend.service.tmdb.movie.MovieService;
import com.movieapplicationbackend.service.tmdb.tvshow.TvShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowService {

    @Autowired
    MovieService movieService;

    @Autowired
    TvShowService tvShowService;

    @Autowired
    TrendingAPI trendingAPI;

    public ArrayList<MovieTvShowDTO> getAllShowsByName(String name){
        List<Movie> allMoviesByName = movieService.getAllMoviesByName(name);
        List<TvShow> allTvShowsByName = tvShowService.getAllTvShowsByName(name);
        ArrayList<MovieTvShowDTO> allShowsByName = new ArrayList<>();

        for (Movie movie : allMoviesByName) {
                allShowsByName.add(new MovieTvShowDTO(movie.getId(), movie.getTitle(), movie.getPopularity(), ShowType.MOVIE));
        }
        for(TvShow shows : allTvShowsByName){
                allShowsByName.add(new MovieTvShowDTO(shows.getId(), shows.getName(), shows.getPopularity(), ShowType.TVSHOW));
        }
        return allShowsByName;
    }

    public TrendingShowsDTO getTrendingMoviesAndTvShows(){
        TrendingShowsDTO trendingShows = trendingAPI.getTrendingShows();
        TrendingShowsDTO filteredTrendingShows = new TrendingShowsDTO();
        ArrayList<TrendingResultDTO> results = trendingShows.getResult();
        ArrayList<TrendingResultDTO> filteredResults = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            TrendingResultDTO trendingResultDTO = results.get(i);
            if(trendingResultDTO.getMedia_type().equals("movie")){
                trendingResultDTO.setOriginal_name(trendingResultDTO.getOriginal_title());
            } else if (trendingResultDTO.getMedia_type().equals("tv")){
                trendingResultDTO.setOriginal_title(trendingResultDTO.getOriginal_name());
            }
            filteredResults.add(trendingResultDTO);
        }
        trendingShows.setResult(filteredResults);
        return trendingShows;
    }
}
