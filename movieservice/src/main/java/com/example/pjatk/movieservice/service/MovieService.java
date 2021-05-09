package com.example.pjatk.movieservice.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    Movie movie;
    List<Movie> movies = new ArrayList<>();

    public MovieService(Movie movie) {
        this.movies = movies;
    }


}
