package com.javatechie.cicd_github_actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdGithubActionsApplication {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to SpringBoot Framework!";
	}

	public static void main(String[] args) {
		SpringApplication.run(CicdGithubActionsApplication.class, args);
	}

}
