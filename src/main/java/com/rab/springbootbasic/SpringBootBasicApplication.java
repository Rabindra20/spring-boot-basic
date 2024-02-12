package com.rab.springbootbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicApplication.class, args);
	}
	@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("Hello from Spring Boot!");
        };
    }
    @RestController
    public class HealthController {
        @GetMapping("/")
        public String health() {
            return "Hello, World!";
        }
    }
}