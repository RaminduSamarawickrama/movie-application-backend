package com.movieapplicationbackend.repository.api;

import com.movieapplicationbackend.dto.MovieDTO;
import com.movieapplicationbackend.dto.TvShowDTO;
import kong.unirest.Unirest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TvShowAPI {

    String token;
    String url;

    public TvShowAPI(@Qualifier("token") String token, @Qualifier("tvShowAPIURL") String url) {
        this.token = token;
        this.url = url;
    }

    public TvShowDTO getTvShowDetails(int id){
        return Unirest.get(url+id+token)
                .asObject(TvShowDTO.class)
                .getBody();
    }
}
