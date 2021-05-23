package com.example.pjatk.movieservice.repository;

import com.example.pjatk.movieservice.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface MovieRepository extends JpaRepository<Movie, Long> {
}
