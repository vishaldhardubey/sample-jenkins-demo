package com.bridgeit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleJenkinsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleJenkinsDemoApplication.class, args);
	}
	
	@GetMapping("/")
	public String display() {
		return "Hello World";
	}
}
