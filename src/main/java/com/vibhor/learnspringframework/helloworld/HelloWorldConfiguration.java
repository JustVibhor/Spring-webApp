package com.vibhor.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
	
	@Bean(name = "person2")
	@Primary
	public Person person2Parameters(String name, int age, @Qualifier("address3Qualifier") Address address) {
		return new Person(name , age, address);
	}
	
	@Bean(name = "dusra")
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean(name = "address")
	@Primary
	public Address address() {
		return new Address("Sita", "Delhi");
	}
	
	@Bean(name = "address3")
	@Qualifier("address3Qualifier")
	public Address address3() {
		return new Address("Bhalu Marg", "Cholustan");
	}
}
