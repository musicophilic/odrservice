package com.oscardeathrace.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Category {
	
	@Id
	int categoryId;
	
	String categoryName;
	
	@OneToMany
	List<Nominee> nomineeList;

}
