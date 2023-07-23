package com.vibhor.learnspringframework.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
	private SomeDependecy someDependency;

	public SomeClass(SomeDependecy someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependencies are ready");

	}

	@PostConstruct
	public void initialize() {
		someDependency.getRead();
	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("Clean UP");
	}
}

@Component
class SomeDependecy {

	public void getRead() {
		// TODO Auto-generated method stub
		System.out.println("Do some task");
		
	}

}

@Configuration
@ComponentScan()
public class PrePostAnnotationsContextLauncher {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncher.class)) {
//			Arrays.stream(context.getBeanDefinitionNames())
//			.forEach(System.out::println);

			System.out.println(context.getBean(SomeClass.class));
		}

	}

}
