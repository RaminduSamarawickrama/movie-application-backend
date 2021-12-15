package com.movieapplicationbackend.dto;


public class MovieDTO {

    private int id;
    private String imdb_id;
    private String overview;
    private String original_title;
    private double popularity;
    private String poster_path;
    private String release_date;
    private String status;
    private double vote_average;
    private String original_language;

    public MovieDTO() {
    }

    public MovieDTO(int id, String imdb_id, String overview, String original_title, double popularity, String poster_path, String release_date, String status, double vote_average, String original_language) {
        this.id = id;
        this.imdb_id = imdb_id;
        this.overview = overview;
        this.original_title = original_title;
        this.popularity = popularity;
        this.poster_path = poster_path;
        this.release_date = release_date;
        this.status = status;
        this.vote_average = vote_average;
        this.original_language = original_language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImdb_id() {
        return imdb_id;
    }

    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getVote_average() {
        return vote_average;
    }

    public void setVote_average(double vote_average) {
        this.vote_average = vote_average;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "id=" + id +
                ", imdb_id='" + imdb_id + '\'' +
                ", overview='" + overview + '\'' +
                ", original_title='" + original_title + '\'' +
                ", popularity=" + popularity +
                ", poster_path='" + poster_path + '\'' +
                ", release_date='" + release_date + '\'' +
                ", status='" + status + '\'' +
                ", vote_average=" + vote_average +
                ", original_language='" + original_language + '\'' +
                '}';
    }
}
