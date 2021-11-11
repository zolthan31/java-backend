package com.dhbtecnologia.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhbtecnologia.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserRest {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		
		User u = new User(1L, "Marial", "maria@gmail.com", "99999999", "12345");
		return ResponseEntity.ok().body(u);
	}

}
