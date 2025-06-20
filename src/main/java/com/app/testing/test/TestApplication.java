package com.app.testing.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestApplication {
	@GetMapping
	public String welcome(){
		return "welcome";
	}

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
