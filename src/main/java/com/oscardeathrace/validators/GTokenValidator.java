package com.oscardeathrace.validators;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;

import org.springframework.stereotype.Component;

import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdToken.Payload;
import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.oscardeathrace.exceptions.InvalidUserDataException;
import com.oscardeathrace.exceptions.ValidationException;

@Component
public class GTokenValidator {

	public void validate(String idToken) {
		
		GoogleIdTokenVerifier verifier = new GoogleIdTokenVerifier
				.Builder(new NetHttpTransport(), JacksonFactory.getDefaultInstance())
				.setAudience(Collections.singleton("498183209473-gfnofldofbhgarcdbt8ldgdpm8li8tl8.apps.googleusercontent.com"))
				.build();
		
		try {
			GoogleIdToken verifiedToken  = verifier.verify(idToken);
			if(verifiedToken != null) {
				Payload payload = verifiedToken.getPayload();
				String userId = payload.getSubject();
				System.out.println("User ID: " + userId);
				String email = payload.getEmail();
				System.out.println("Email: " + email);
			} else {
				throw new InvalidUserDataException();
			}
		} catch (GeneralSecurityException|IOException e) {
			throw new ValidationException();
		}
		
	}

}
