package com.ms.challenge.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ms.challenge.entity.Department;

@RestController
public class DepartmentController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

	@GetMapping(value = "/{id}", produces = "application/json")
	public Department getDepartmentById(@PathVariable int id) {
		LOGGER.info("Department Controller: getDepartmentById" + id);
		return new Department(1, "TI");
	}
}
