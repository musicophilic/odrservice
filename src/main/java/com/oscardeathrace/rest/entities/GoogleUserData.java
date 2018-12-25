package com.oscardeathrace.rest.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GoogleUserData {

	private String emailId;
	
	private String firstName;
	
	private String lastName;
	
	private String accountId;
	
	private String idToken;
	
	private String photoURL;
	
}
