package com.example.pjatk.movieservice.controller;

import com.example.pjatk.movieservice.service.Movie;
import com.example.pjatk.movieservice.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("")
    public ResponseEntity<List<Movie>> findAll() {
        return ResponseEntity.ok(movieService.listMovies());
    }


}
