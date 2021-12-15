package com.movieapplicationbackend.service.tmdb.tvshow;

import com.movieapplicationbackend.dto.TvShowDTO;
import com.movieapplicationbackend.entity.TvShow;
import com.movieapplicationbackend.repository.TvShowRepository;
import com.movieapplicationbackend.repository.api.TvShowAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TvShowService {

    @Autowired
    TvShowRepository tvShowrepository;

    @Autowired
    TvShowAPI tvShowAPI;
    public List<TvShow> getAllTvShowsByName(String name){
        return tvShowrepository.findByNameContaining(name);
    }

    public TvShowDTO getTvShowDetailsById(int id){
        return tvShowAPI.getTvShowDetails(id);
    }
}
