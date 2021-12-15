package com.movieapplicationbackend.repository;

import com.movieapplicationbackend.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

    List<Movie> findByTitleContaining(String name);

}
