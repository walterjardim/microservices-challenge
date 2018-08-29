package com.ms.challenge.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ms.challenge.entity.User;

@RestController
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@GetMapping(value = "/user/{id}", produces = "application/json")
	public User getUser(@PathVariable int id) {
		LOGGER.info("User Service: getUser: " + 1);
		return new User(id, "Teste");
	}
}
