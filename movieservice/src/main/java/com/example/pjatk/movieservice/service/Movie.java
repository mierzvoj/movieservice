package com.example.pjatk.movieservice.service;


public class Movie {
    private Long movieId;
    private String movieTitle;
    private EnumCat category;

    public Movie(Long movieId, String movieTitle, EnumCat movieCategory) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
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


}
