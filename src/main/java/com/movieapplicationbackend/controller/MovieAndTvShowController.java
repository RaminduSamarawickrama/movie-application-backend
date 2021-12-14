package com.movieapplicationbackend.controller;

import com.movieapplicationbackend.service.MovieService;
import com.movieapplicationbackend.service.tmdb.TMDBDailyDumpService;
import kong.unirest.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class MovieAndTvShowController {

    @Autowired
    TMDBDailyDumpService movieService;

    @GetMapping("/searchByName")
    public Object searchMovieAndTvShowByName(@RequestParam(value = "name", required = true) String name){
        System.out.println("------- "+name);
//        movieService.movieDump();
        movieService.tvShowDump();
        return null;

    }
}
