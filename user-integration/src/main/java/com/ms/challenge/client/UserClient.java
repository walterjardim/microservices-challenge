package com.ms.challenge.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ms.challenge.entity.User;

@FeignClient("user-service")
public interface UserClient {

	@GetMapping("/{id}")
	public User getUserById(@PathVariable int id);
}
