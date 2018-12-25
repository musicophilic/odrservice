package com.oscardeathrace.facade;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.oscardeathrace.entities.User;
import com.oscardeathrace.repositories.UserRepository;

@Component
public class UserFacade {
	
	@Autowired
	UserRepository userRepository;
	
	public void processUser(User user) {
		
		Optional<User> dbUser = userRepository.findById(user.getUserId());
		if(!dbUser.isPresent()) {
			userRepository.save(user);
		}
	}

}
