package com.bootcamp.cicddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CiCdDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiCdDemoApplication.class, args);
	}

	@GetMapping("/")
	public String homepage() {
		return "<h1>My new homepage!</h1>";
	}

}
