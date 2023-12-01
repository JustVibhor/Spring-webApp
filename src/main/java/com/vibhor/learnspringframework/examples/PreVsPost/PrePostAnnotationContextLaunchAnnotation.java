package com.vibhor.learnspringframework.examples.PreVsPost;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependencies are ready");
	}

	// This method will be called after dependency injection had been invoked
	// Like in our case when constructor has been called
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}

	// called before a bean is removed from application context
	@PreDestroy
	public void cleanUp() {
		System.out.println("Tie with a heavy stone and throw inside a deep river");
	}
}


@Component
class SomeDependency {
	public void getReady() {
		System.out.println("Some logic using SomeDependency");
	}
}


@Configuration
@ComponentScan
public class PrePostAnnotationContextLaunchAnnotation {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextLaunchAnnotation.class)) {
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		}

	}

}
