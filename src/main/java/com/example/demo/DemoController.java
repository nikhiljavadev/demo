package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	// temp change
	
	@GetMapping("message")
	public String getMessage() {
		return "Hello world";
	}
}

