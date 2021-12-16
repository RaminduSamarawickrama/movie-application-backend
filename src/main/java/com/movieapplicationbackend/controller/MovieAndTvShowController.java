package com.movieapplicationbackend.controller;
import com.movieapplicationbackend.dto.MovieDTO;
import com.movieapplicationbackend.dto.MovieTvShowDTO;
import com.movieapplicationbackend.dto.TrendingShowsDTO;
import com.movieapplicationbackend.dto.TvShowDTO;
import com.movieapplicationbackend.service.ShowService;
import com.movieapplicationbackend.service.tmdb.dailyexport.TMDBDailyDumpService;
import com.movieapplicationbackend.service.tmdb.movie.MovieService;
import com.movieapplicationbackend.service.tmdb.tvshow.TvShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class MovieAndTvShowController {

    @Autowired
    ShowService showService;

    @Autowired
    TMDBDailyDumpService tmdbDailyDumpService;

    @Autowired
    MovieService movieService;

    @Autowired
    TvShowService tvShowService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getshowsbyname")
    public List<MovieTvShowDTO> searchMovieAndTvShowByName(@RequestParam(value = "name", required = true) String name){
        return showService.getAllShowsByName(name);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getmoviedetails")
    public MovieDTO getMovieDetails(@RequestParam(value = "id", required = true) int id){
        return movieService.getMovieDetails(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/gettvshowdetails")
    public TvShowDTO getTvShowDetails(@RequestParam(value = "id", required = true) int id){
        return tvShowService.getTvShowDetailsById(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/topten")
    public TrendingShowsDTO getTopTenShows(){
        return showService.getTrendingMoviesAndTvShows();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/dailydumptv")
    public void dailyDumpTv(){
        tmdbDailyDumpService.tvShowDump();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/dailydumpmovie")
    public void dailyDumpMovie(){
        tmdbDailyDumpService.movieDump();
    }
}

// localhost:8080/api/getshowsbyname?name=bro
// localhost:8080/api/getshowsbyname?name=bro