package com.example.pjatk.movieservice.service;

import com.example.pjatk.movieservice.model.EnumCat;
import com.example.pjatk.movieservice.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MovieService {

    //List<Movie> movieList = Arrays.asList(new Movie(1L, "mv1", EnumCat.comedy), new Movie(2L, "mv2", EnumCat.war));

     List <Movie> movieList = new ArrayList<>();

    public List<Movie> getMovieList() {
        return movieList;
    }


    public Movie getMovieById(Long id) {
        return movieList.stream().filter(a -> a.getMovieId() == id).collect(Collectors.toList()).get(0);
    }

    public Movie saveMovie(Movie movie) {
        movieList.add(movie);
        return movie;
    }

    public Movie updateMovie(Movie movie){
        movieList.add(movie);
        return movie;
    }

    public void deleteMovie(Long id){
        movieList.removeIf(e -> e.getMovieId().equals(id));;
    }
}
