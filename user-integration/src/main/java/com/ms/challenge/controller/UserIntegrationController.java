package com.ms.challenge.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ms.challenge.client.UserClient;

@RestController
public class UserIntegrationController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserIntegrationController.class);

	@Autowired
	private UserClient client;
	
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public ResponseEntity<?> getUserById(@PathVariable int id) {
		LOGGER.info("Getting user from Integration");
		return ResponseEntity.ok(client.getUserById(id));
	}
}
