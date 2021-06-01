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
        return movieRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public Movie saveMovie(Movie movie) {
        movieRepository.save(movie);
        return movie;
    }


    public Optional<Movie> updateMovie(Long id, Movie movieToUpdate) {
        Optional<Movie> movie = movieRepository.findAll().stream().filter(m -> m.getMovieId().equals(id)).findFirst();
        if (movie.isPresent()) {
            movie.get().setMovieCategory(movieToUpdate.getMovieCategory());
            movie.get().setMovieTitle(movieToUpdate.getMovieTitle());
            return movie;
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND);
    }

    public Optional<Movie> avalUpdateMovie(Long id) {
        Optional<Movie> movie = movieRepository.findAll().stream().filter(m -> m.getMovieId().equals(id)).findFirst();
        if (movie.isPresent()) {
            movie.get().setAvaliable(true);
            return movie;
        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND);
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }
}
