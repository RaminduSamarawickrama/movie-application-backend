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

    @GetMapping("/getshowsbyname")
    public List<MovieTvShowDTO> searchMovieAndTvShowByName(@RequestParam(value = "name", required = true) String name){
        return showService.getAllShowsByName(name);
    }

    @GetMapping("/getmoviedetails")
    public MovieDTO getMovieDetails(@RequestParam(value = "id", required = true) int id){
        return movieService.getMovieDetails(id);
    }

    @GetMapping("/gettvshowdetails")
    public TvShowDTO getTvShowDetails(@RequestParam(value = "id", required = true) int id){
        return tvShowService.getTvShowDetailsById(id);
    }

    @GetMapping("/topten")
    public TrendingShowsDTO getTopTenShows(){
        return showService.getTrendingMoviesAndTvShows();
    }
}
