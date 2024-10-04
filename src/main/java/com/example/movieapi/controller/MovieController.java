package com.example.movieapi.controller;

import com.example.movieapi.entity.Movie;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {

    // Simple GET endpoint to test if the server is running
    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome to the Movie API!";
    }

    // POST request to add movies using the Movie entity
    @PostMapping("/movies")
    public String createMovie(@RequestBody Movie movie) {
        // Mock behavior: Simply print the movie object and return a success message
        System.out.println("Movie received: " + movie.toString());
        return "Movie added successfully!";
    }
}