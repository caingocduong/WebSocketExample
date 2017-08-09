package com.example.SimpleChatApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.example"})
public class SimpleChatAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleChatAppApplication.class, args);
	}
}
