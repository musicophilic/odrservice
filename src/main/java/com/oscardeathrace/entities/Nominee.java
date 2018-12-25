package com.oscardeathrace.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Nominee {
	
	@Id
	int nomineeId;
	
	int nominationYear;
	
	int nominationNumberWithinCategory;
	
	@OneToOne
	Movie movie;
	
	@ManyToOne
	Category category;
	
	String nomineeHeader;
	
	String nomineeSubtext;
	
	@OneToMany
	List<Artist> artistList;

}
