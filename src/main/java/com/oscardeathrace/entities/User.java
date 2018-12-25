package com.oscardeathrace.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

	@Id
	private String userId;
	
	private String firstName;
	
	private String lastName;
	
	private String photoUrl;
	
	private String thirdPartyAccountId;
	
	private String thirdPartyServiceName;
	
}
