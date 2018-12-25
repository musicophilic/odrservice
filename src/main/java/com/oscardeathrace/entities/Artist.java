package com.oscardeathrace.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Artist {
	
	@Id
	int artistId;
	
	String name;
	
	String imdbTag;
	
	String artistImageUrl;
	
}
