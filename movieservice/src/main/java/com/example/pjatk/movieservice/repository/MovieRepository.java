package com.example.pjatk.movieservice.repository;

import com.example.pjatk.movieservice.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
    public interface MovieRepository extends JpaRepository<Movie, Long> {

    Optional<Movie> findMovieByid(Long id);
    Optional<Movie> streamAllByid(Long id);


}
