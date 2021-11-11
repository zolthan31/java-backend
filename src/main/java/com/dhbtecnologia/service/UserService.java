package com.dhbtecnologia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dhbtecnologia.domain.User;
import com.dhbtecnologia.repository.UserRepository;

public class UserService {
	
	@Autowired
	private UserRepository repository; 
	
	public List<User> findAllList(){
		return repository.findAll();
	}
	

}
