package com.vibhor.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// does the job of getter, setter, toString and more methods we create when creating a class	
record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};

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
	
	@Bean
	public Person person() {
		return new Person("Vibhor", 24, new Address("Dilemantiar", "Aproxima-B"));
	}
	
	@Bean(name = "dusra")
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Address address() {
		return new Address("Sita", "Delhi");
	}
}
