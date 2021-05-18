package com.example.pjatk.movieservice.controller;

import com.example.pjatk.movieservice.model.Movie;
import com.example.pjatk.movieservice.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/exception")
    public ResponseEntity<String> exceptionExample() {
        throw new RuntimeException("Exception for test purpose only");
    }

    @GetMapping("")
    public ResponseEntity<List<Movie>> findAll() {
        return ResponseEntity.ok(movieService.getMovieList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> findById(@PathVariable Long id) {
        return ResponseEntity.ok(movieService.getMovieById(id));
    }

    @PostMapping("")
    public ResponseEntity <Movie> addMovie(@RequestBody Movie movie) {
        return ResponseEntity.ok(movieService.saveMovie(movie));
    }

    @PutMapping("/{id}")
    public ResponseEntity <Optional<Movie>> updateMovie(@PathVariable Long id, @RequestBody Movie movie) {
        return ResponseEntity.ok(movieService.updateMovie(id, movie));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
        return ResponseEntity.ok().build();
    }

}
