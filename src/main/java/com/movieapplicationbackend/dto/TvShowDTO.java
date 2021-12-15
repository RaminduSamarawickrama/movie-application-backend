package com.movieapplicationbackend.dto;

public class TvShowDTO {
    private String first_air_date;
    private int id;
    private boolean in_production;
    private String last_air_date;
    private String original_name;
    private int number_of_episodes;
    private int number_of_seasons;
    private String original_language;
    private String overview;
    private String poster_path;
    private int popularity;
    private String status;
    private double vote_average;

    public TvShowDTO() {
    }

    public TvShowDTO(String first_air_date, int id, boolean in_production, String last_air_date, String original_name, int number_of_episodes, int number_of_seasons, String original_language, String overview, String poster_path, int popularity, String status, double vote_average) {
        this.first_air_date = first_air_date;
        this.id = id;
        this.in_production = in_production;
        this.last_air_date = last_air_date;
        this.original_name = original_name;
        this.number_of_episodes = number_of_episodes;
        this.number_of_seasons = number_of_seasons;
        this.original_language = original_language;
        this.overview = overview;
        this.poster_path = poster_path;
        this.popularity = popularity;
        this.status = status;
        this.vote_average = vote_average;
    }

    public String getFirst_air_date() {
        return first_air_date;
    }

    public void setFirst_air_date(String first_air_date) {
        this.first_air_date = first_air_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIn_production() {
        return in_production;
    }

    public void setIn_production(boolean in_production) {
        this.in_production = in_production;
    }

    public String getLast_air_date() {
        return last_air_date;
    }

    public void setLast_air_date(String last_air_date) {
        this.last_air_date = last_air_date;
    }

    public String getOriginal_name() {
        return original_name;
    }

    public void setOriginal_name(String original_name) {
        this.original_name = original_name;
    }

    public int getNumber_of_episodes() {
        return number_of_episodes;
    }

    public void setNumber_of_episodes(int number_of_episodes) {
        this.number_of_episodes = number_of_episodes;
    }

    public int getNumber_of_seasons() {
        return number_of_seasons;
    }

    public void setNumber_of_seasons(int number_of_seasons) {
        this.number_of_seasons = number_of_seasons;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
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

    @Override
    public String toString() {
        return "TvShowDTO{" +
                "first_air_date='" + first_air_date + '\'' +
                ", id=" + id +
                ", in_production=" + in_production +
                ", last_air_date='" + last_air_date + '\'' +
                ", original_name='" + original_name + '\'' +
                ", number_of_episodes=" + number_of_episodes +
                ", number_of_seasons=" + number_of_seasons +
                ", original_language='" + original_language + '\'' +
                ", overview='" + overview + '\'' +
                ", poster_path='" + poster_path + '\'' +
                ", popularity=" + popularity +
                ", status='" + status + '\'' +
                ", vote_average=" + vote_average +
                '}';
    }
}
