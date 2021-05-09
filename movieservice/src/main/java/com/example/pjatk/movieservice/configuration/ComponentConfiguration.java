package com.example.pjatk.movieservice.configuration;

import com.example.pjatk.movieservice.service.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentConfiguration {
    @Bean(name = "movie")
    public Movie movie(){
        return new Movie();
    }
}
