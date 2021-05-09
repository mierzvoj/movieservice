package com.example.pjatk.movieservice.service;


public class Movie {
    private Long movieId;
    private String movieTitle;
    private String movieCategory;

    public Movie(Long movieId, String movieTitle, String movieCategory) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.movieCategory = movieCategory;
    }

    public Movie() {
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(String movieCategory) {
        this.movieCategory = movieCategory;
    }
}
