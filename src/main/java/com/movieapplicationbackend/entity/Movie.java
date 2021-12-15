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
    private String title;

    @Column(name = "movie_popularity")
    private double popularity;

    @Column(name = "movie_isVideo")
    private boolean video;


    public Movie(){

    }

    public Movie(boolean adult, int id, String title, double popularity, boolean video){
        this.adult = adult;
        this.id = id;
        this.title = title;
        this.popularity = popularity;
        this.video = video;
    }

    public boolean isAdult() {
        return adult;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public void printObject(){
        System.out.println("--- "+isAdult() +" : "+ getId() + " : "+ getTitle() + " : "+ getPopularity() + " : " + isVideo());
    }

}
