package com.movieapplicationbackend.dto;

public class TrendingResultDTO {
    private String original_title;
    private String original_name;
    private String poster_path;
    private int id;
    private String overview;
    private String media_type;
    private String release_date;

    public TrendingResultDTO() {
    }

    public TrendingResultDTO(String original_title, String original_name, String poster_path, int id, String overview, String media_type, String release_date) {
        this.original_title = original_title;
        this.original_name = original_name;
        this.poster_path = poster_path;
        this.id = id;
        this.overview = overview;
        this.media_type = media_type;
        this.release_date = release_date;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getOriginal_name() {
        return original_name;
    }

    public void setOriginal_name(String original_name) {
        this.original_name = original_name;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getMedia_type() {
        return media_type;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    @Override
    public String toString() {
        return "TrendingResultDTO{" +
                "original_title='" + original_title + '\'' +
                ", original_name='" + original_name + '\'' +
                ", poster_path='" + poster_path + '\'' +
                ", id=" + id +
                ", overview='" + overview + '\'' +
                ", media_type='" + media_type + '\'' +
                ", release_date='" + release_date + '\'' +
                '}';
    }
}
