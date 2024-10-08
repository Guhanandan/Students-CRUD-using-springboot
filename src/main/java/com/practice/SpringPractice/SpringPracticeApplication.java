package com.practice.SpringPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringPracticeApplication {

    // http://localhost:8080/
    @GetMapping("/")
    public String root() {
        return "This is from the Spring Boot backend server";
    }

    // http://localhost:8080/home
    @GetMapping("/home")
    public String home(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s", name);
    }

	// @GetMapping("/students")
	// public 
    public static void main(String[] args) {
        SpringApplication.run(SpringPracticeApplication.class, args);
    }
}
