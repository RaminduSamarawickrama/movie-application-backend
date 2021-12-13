package com.movieapplicationbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Movie")
public class Movie {

    @Column(name = "movie_isAdult")
    private boolean adult;

    @Id
    @Column(name = "movie_id")
    private int id;

    @Column(name = "movie_title")
    private String original_title;

    @Column(name = "movie_popularity")
    private double popularity;

    @Column(name = "movie_isVideo")
    private boolean video;


    public Movie(){

    }

    public Movie(boolean adult, int id, String original_title, double popularity, boolean video){
        this.adult = adult;
        this.original_title = original_title;
        this.popularity = popularity;
        this.video = video;
    }

    public boolean isAdult() {
        return adult;
    }

    public int getId() {
        return id;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public double getPopularity() {
        return popularity;
    }

    public boolean isVideo() {
        return video;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }
}
