package com.example.demo.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Movie;

@RestController
public class MoviesController {
    @RequestMapping(path = "/movies", method = RequestMethod.GET)
    public List<Movie> listLambdaLanguages() {
        return Arrays.asList(
        		new Movie("Harry Potter"), 
        		new Movie("Twilight"), 
        		new Movie("X-Men"));
    }
}
