package com.movieapplicationbackend.service.tmdb.movie;
import com.movieapplicationbackend.dto.MovieDTO;
import com.movieapplicationbackend.entity.Movie;
import com.movieapplicationbackend.repository.MovieRepository;
import com.movieapplicationbackend.repository.api.MovieAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    MovieAPI movieAPI;

    public List<Movie> getAllMoviesByName(String name){

        List<Movie> moviesByName = movieRepository.findByTitleContaining(name);

        for(Movie movie : moviesByName){
            movie.printObject();
        }
        return moviesByName;
    }

    public MovieDTO getMovieDetails(int id){
        return movieAPI.getMovieDetails(id);
    }
}
