package com.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/echo-hello")
	public String echoHello() {
		return "Hello-world";
	}

}
