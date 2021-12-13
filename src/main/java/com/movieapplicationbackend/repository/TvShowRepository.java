package com.movieapplicationbackend.repository;

import com.movieapplicationbackend.entity.TvShow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TvShowRepository extends JpaRepository<TvShow,Integer> {
}
