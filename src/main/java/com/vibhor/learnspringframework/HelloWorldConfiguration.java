package com.vibhor.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Vibhor";
	}
	
	@Bean
	public int age() {
		return 9;
	}
}
