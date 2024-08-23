package com.stacksimplify.restservices.springboot_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello World1";
	}
	
	@GetMapping("/helloword-user")
	public UserDetails helloWorldBean() {
		return new UserDetails("Berchin", "John", 1982);
	}
}
