package com.example.pjatk.movieservice.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MovieService {

    List<Movie> movieList = Arrays.asList(new Movie(1L, "mv1", EnumCat.komedia), new Movie(2L, "mv2", EnumCat.wojenny));

    public List<Movie> listMovies() {
        return movieList;
    }


}
