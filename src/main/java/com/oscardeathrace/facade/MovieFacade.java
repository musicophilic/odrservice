package com.oscardeathrace.facade;

import org.springframework.stereotype.Component;

import com.oscardeathrace.entities.Movie;

@Component
public class MovieFacade {
	
	public void addMovie(Movie movie) {
		System.out.println(movie);
	}

}
