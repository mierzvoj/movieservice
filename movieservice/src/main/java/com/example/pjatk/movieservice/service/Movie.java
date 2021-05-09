package com.example.pjatk.movieservice.service;


public class Movie {
    private Long id;
    private String movieTitle;
    private EnumCat category;

    public Movie(Long movieId, String movieTitle, EnumCat movieCategory) {
        this.id = movieId;
        this.movieTitle = movieTitle;
           }

    public Movie() {
    }

    public Long getMovieId() {
        return id;
    }

    public void setMovieId(Long movieId) {
        this.id = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

}
