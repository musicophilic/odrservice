package com.oscardeathrace.transformers;

import org.springframework.stereotype.Component;

import com.oscardeathrace.constants.LoginConstants;
import com.oscardeathrace.entities.User;
import com.oscardeathrace.rest.entities.GoogleUserData;


@Component
public class GoogleUserDataToUserTransformer implements Transformer<GoogleUserData, User> {

	@Override
	public User transform(GoogleUserData googleUserData) {
		
		User user = new User();
		
		user.setUserId(googleUserData.getEmailId());
		user.setFirstName(googleUserData.getFirstName());
		user.setLastName(googleUserData.getLastName());
		user.setPhotoUrl(googleUserData.getPhotoURL());
		user.setThirdPartyAccountId(googleUserData.getAccountId());
		user.setThirdPartyServiceName(LoginConstants.GOOGLE_SERVICE_NAME);
		
		return user;
	}

}
