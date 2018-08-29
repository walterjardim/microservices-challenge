package com.ms.challenge.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ms.challenge.client.DepartmentClient;
import com.ms.challenge.client.UserClient;
import com.ms.challenge.entity.User;

@RestController
public class UserIntegrationController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserIntegrationController.class);

	@Autowired
	private UserClient userClient;
	
	@Autowired
	private DepartmentClient departmentClient;
	
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public ResponseEntity<?> getUserById(@PathVariable int id) {
		LOGGER.info("Getting user from Integration");
		return ResponseEntity.ok(userClient.getUserById(id));
	}
	
	@GetMapping(value = "/{id}/with-department")
	public User getUserByIdWithDepartment(@PathVariable int id) {
		LOGGER.info("Getting user with departments from Integration");
		User user = userClient.getUserById(id);
		user.setDepartment(departmentClient.getDepartmentById(1));
		return user;
	}
}
