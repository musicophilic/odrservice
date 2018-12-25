package com.oscardeathrace.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oscardeathrace.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
