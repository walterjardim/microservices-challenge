package com.ms.challenge.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("user-service")
public interface UserClient {

	@GetMapping("/{id}")
	public Object getUserById(@PathVariable int id);
}
