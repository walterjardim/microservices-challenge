package com.ms.challenge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ms.challenge.entity.Department;

@RestController
public class DepartmentController {

	@GetMapping(value = "/{id}", produces = "application/json")
	public Department getDepartmentById(@PathVariable int id) {
		return new Department(1, "TI");
	}
}
