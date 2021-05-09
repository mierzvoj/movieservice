package com.example.pjatk.movieservice.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    Movie movie;

    public List<Movie> movies = new ArrayList<>();

    public MovieService(Movie movie, List<Movie> movies) {
        this.movie = movie;
        this.movies = movies;
    }

    public List<Movie> listMovies() {
        return movies;
    }


}
