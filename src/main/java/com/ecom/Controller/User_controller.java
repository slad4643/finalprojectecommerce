package com.ecom.Controller;

import java.util.concurrent.ExecutorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")

public class User_controller {
	
	@Autowired
	ExecutorService userService;
	
	@PostMapping("/register")
	public ResponseEntity<?> addUser(@RequestBody @Valid User user)
	{
		return ((User_controller) userService).addUser(user);
	}



}
