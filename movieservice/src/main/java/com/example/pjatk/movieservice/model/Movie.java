package com.example.pjatk.movieservice.model;

import javax.persistence.*;

@Entity
@Table(name="movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String movieTitle;
    @Enumerated(EnumType.STRING)
    private EnumCat movieCategory;

    public Movie(String movieTitle, EnumCat movieCategory) {
        this.movieTitle = movieTitle;
        this.movieCategory = movieCategory;
    }

    public Movie() {
    }

    public Long getMovieId() {
        return id;
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
