package com.example.pjatk.movieservice.service;

import com.example.pjatk.movieservice.model.EnumCat;
import com.example.pjatk.movieservice.model.Movie;
import com.example.pjatk.movieservice.repository.MovieRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(Long id) {
        return movieRepository.findMovieByid(id);
    }

    public Movie saveMovie(Movie movie) {
        movieRepository.save(movie);
        return movie;
    }

    public Movie updateMovie(Long id, Movie movie) {
        Movie movieToUpdate = movieRepository.findMovieByid(id);
        if (movie.getMovieTitle() != null) {
            movieToUpdate.setMovieTitle(movie.getMovieTitle());
        }
        if (movie.getMovieCategory() != null) {
            movieToUpdate.setMovieCategory(movie.getMovieCategory());
        }
        return saveMovie(movieToUpdate);
    }

    public Movie avalUpdateMovie(Long id) {
        Movie movie = movieRepository.findMovieByid(id);
        if (movie.getMovieId() != null) {
            movie.setAvaliable();
        }
        return saveMovie(movie);
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }
}
