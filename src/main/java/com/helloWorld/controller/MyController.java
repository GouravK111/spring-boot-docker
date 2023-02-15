package com.helloWorld.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/echo-hello")
	public String echoHello() {
		return "Hello-world";
	}
	
	@GetMapping("/echo-hello-with-date")
	public String echoHelloDate() {
		
		return "Hello-world" + new Date();
	}

}
