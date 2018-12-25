package com.oscardeathrace.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Movie {
	
	@Id
	int movieId;
	
	int movieYear;
	
	String movieName;
	
	String imdbTag;
	
	String posterUrl;

}
