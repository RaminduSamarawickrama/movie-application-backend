package com.movieapplicationbackend.repository;

import com.movieapplicationbackend.entity.TvShow;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TvShowRepository extends JpaRepository<TvShow,Integer> {

    List<TvShow> findByNameContaining(String name);
}
