package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@SpringBootApplication
@RestController
public class SpringBootGradleApplication {

	@GetMapping("/hello")
	public ResponseEntity<Map> hello(@RequestParam(required = false) String name) {
		return ResponseEntity.ok(Collections.singletonMap("message", name == null || name.isEmpty() ? "Hello world!" : String.format("Hello %s!", name)));
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGradleApplication.class, args);
	}
}