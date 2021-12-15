package com.movieapplicationbackend.dto;

import java.util.ArrayList;

public class TrendingShowsDTO {
    ArrayList<TrendingResultDTO> results = new ArrayList<TrendingResultDTO>();

    public TrendingShowsDTO(ArrayList<TrendingResultDTO> result) {
        this.results = result;
    }

    public TrendingShowsDTO() {
    }

    public ArrayList<TrendingResultDTO> getResult() {
        return results;
    }

    public void setResult(ArrayList<TrendingResultDTO> result) {
        this.results = result;
    }
}
