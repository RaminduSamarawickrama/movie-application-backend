package com.movieapplicationbackend.repository.api;

import com.movieapplicationbackend.dto.TrendingResultDTO;
import com.movieapplicationbackend.dto.TrendingShowsDTO;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TrendingAPI {

    String token;
    String url;

    public TrendingAPI(@Qualifier("token") String token, @Qualifier("trendingAPIURL") String url) {
        this.token = token;
        this.url = url;
    }

    public TrendingShowsDTO getTrendingShows(){
        return Unirest.get(url+token)
                .asObject(TrendingShowsDTO.class)
                .getBody();
    }
}
