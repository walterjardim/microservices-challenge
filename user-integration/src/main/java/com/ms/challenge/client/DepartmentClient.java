package com.ms.challenge.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ms.challenge.entity.Department;

@FeignClient("department-service")
public interface DepartmentClient {
	
	@GetMapping(value = "/{id}")
	public Department getDepartmentById(@PathVariable int id);

}
