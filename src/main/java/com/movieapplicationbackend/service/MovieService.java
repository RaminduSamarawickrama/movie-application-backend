package com.movieapplicationbackend.service;

import kong.unirest.Unirest;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.movieapplicationbackend.repository.MovieRepository;

import java.io.File;
import java.io.IOException;
import java.net.URL;

@Service
public class MovieService {

    @Autowired
    private MovieRepository service;

    public File getMovieDump(){
//        try {
//            FileUtils.copyURLToFile(
//                    new URL("http://files.tmdb.org/p/exports/movie_ids_11_11_2021.json.gz"),
//                    new File(".../repository/data/file.json"),
//                    10000,
//                    10000);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        File result = Unirest.get("http://files.tmdb.org/p/exports/movie_ids_11_11_2021.json.gz")
                .asFile("../repository/data/file.json.gz")
                .getBody();
        return result;
    }

}
