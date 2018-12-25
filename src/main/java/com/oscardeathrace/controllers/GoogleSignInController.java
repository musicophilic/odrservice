package com.oscardeathrace.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oscardeathrace.entities.User;
import com.oscardeathrace.exceptions.InvalidUserDataException;
import com.oscardeathrace.facade.UserFacade;
import com.oscardeathrace.rest.entities.GoogleUserData;
import com.oscardeathrace.transformers.GoogleUserDataToUserTransformer;
import com.oscardeathrace.validators.GTokenValidator;

@RestController
public class GoogleSignInController {

	
	@Autowired
	GoogleUserDataToUserTransformer googleDataToUserTransformer;
	
	@Autowired
	UserFacade userFacade;
	
	@Autowired
	GTokenValidator gTokenValidator;
	
	@RequestMapping(method=RequestMethod.POST, value="/googleSignIn")
	public void googleSignIn(@RequestBody GoogleUserData data) {
		
		/*
		 *  This api should
		 *  1. Validate the data first
		 *  	a. validate email address
		 *  	b. validate firstName length
		 *  	c. validate lastName length
		 *  	d. validate photoURL format and length
		 *  	e. validate accoundId length
		 *  	f. validate idToken length/format
		 *  2. Once everything is validated, it should convert this model into a User model
		 *  3. Pass the User model down for further processing to UserFacade
		 */
		try {
			// Put validators here
		
			// Convert model to User model
			User user = googleDataToUserTransformer.transform(data);
			
			// Validate Id token - Not working right now!!
			gTokenValidator.validate(data.getIdToken());
			
			// Process user
			userFacade.processUser(user);
			
		} catch(InvalidUserDataException e) {
			throw e;
		}
		
	}
}
