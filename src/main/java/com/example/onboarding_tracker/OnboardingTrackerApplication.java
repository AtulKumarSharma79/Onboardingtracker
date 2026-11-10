package com.example.onboarding_tracker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OnboardingTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnboardingTrackerApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(EmployeeRepository repository) {
		return args -> {
			// clear all db every time the app restarts
			repository.deleteAll();
		};
	}

}
