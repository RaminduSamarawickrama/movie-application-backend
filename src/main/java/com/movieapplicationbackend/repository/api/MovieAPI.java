package com.movieapplicationbackend.repository.api;

import com.movieapplicationbackend.dto.MovieDTO;
import kong.unirest.Unirest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MovieAPI {

    String token;
    String url;

    public MovieAPI(@Qualifier("token") String token, @Qualifier("movieAPIURL") String url) {
        this.token = token;
        this.url = url;
    }

    public MovieDTO getMovieDetails(int id){
        MovieDTO movieDTO =  Unirest.get(url+id+token)
                .asObject(MovieDTO.class)
                .getBody();
        return movieDTO;
    }
}
