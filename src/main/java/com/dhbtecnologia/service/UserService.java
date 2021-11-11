package com.dhbtecnologia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhbtecnologia.domain.User;
import com.dhbtecnologia.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository; 
	
	public List<User> findAll(){
		
		return repository.findAll();
	}
	

}
