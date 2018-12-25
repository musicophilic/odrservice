package com.oscardeathrace.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oscardeathrace.entities.Movie;
import com.oscardeathrace.facade.MovieFacade;

@RestController
public class MovieController {
	
	@Autowired
	MovieFacade movieFacade;
	
	@RequestMapping(method=RequestMethod.POST, value="/addMovie")
	public void addMovie(@RequestBody Movie movie) {
		movieFacade.addMovie(movie);
	}

}
