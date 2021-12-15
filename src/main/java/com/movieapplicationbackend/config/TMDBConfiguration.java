package com.movieapplicationbackend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TMDBConfiguration {

    @Bean(name = "token")
    public String token(){
        return "?api_key=" + "aa1582d022719c5230e51acb74ab99c3";
    }
    @Bean(name = "trendingAPIURL")
    public String trendingAPIURL(){
        return "https://api.themoviedb.org/3/trending/all/day";
    }
    @Bean(name = "movieAPIURL")
    public String movieAPIURL(){
        return "https://api.themoviedb.org/3/movie/";
    }
    @Bean(name = "tvShowAPIURL")
    public String tvShowAPIURL(){
        return "https://api.themoviedb.org/3/tv/";
    }
}
