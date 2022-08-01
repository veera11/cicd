package com.cicd.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class CICDController {
	@GetMapping
	public String wishing() {
		return "Hello! Welcome GIT Jenkins Docker Kubernetes Integration Example";
	}
}
