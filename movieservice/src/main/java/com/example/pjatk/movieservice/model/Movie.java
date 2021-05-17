package com.example.pjatk.movieservice.model;


public class Movie {
    private Long id;
    private String movieTitle;
    private EnumCat movieCategory;

    public Movie(Long id, String movieTitle, EnumCat movieCategory) {
        this.id = id;
        this.movieTitle = movieTitle;
        this.movieCategory = movieCategory;
    }

    public Movie() {
    }

    public Long getMovieId() {
        return id;
    }

    public void setMovieId(Long id) {
        this.id = id;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public EnumCat getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(EnumCat movieCategory) {
        this.movieCategory = movieCategory;
    }
}
