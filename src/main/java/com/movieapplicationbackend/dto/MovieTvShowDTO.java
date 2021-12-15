package com.movieapplicationbackend.dto;

import com.movieapplicationbackend.dto.constant.ShowType;

public class MovieTvShowDTO {
    private int id;
    private String title;
    private double popularity;
    private ShowType show_type;

    public MovieTvShowDTO() {

    }

    public MovieTvShowDTO(int id, String title, double popularity, ShowType show_type) {
        this.id = id;
        this.title = title;
        this.popularity = popularity;
        this.show_type = show_type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public ShowType getShow_type() {
        return show_type;
    }

    public void setShow_type(ShowType show_type) {
        this.show_type = show_type;
    }

    public void printObject(){
        System.out.println(getId() + " : " + getTitle() + " : " + getPopularity());
    }
}
