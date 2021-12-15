package com.movieapplicationbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TvShow")

public class TvShow {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "original_name")
    private String name;

    @Column(name = "popularity")
    private double popularity;

    public TvShow() {

    }

    public TvShow(int id, String name, double popularity) {
        this.id = id;
        this.name = name;
        this.popularity = popularity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPopularity() {
        return popularity;
    }
}
