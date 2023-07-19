package com.vibhor.learnspringframework.helloworld;

//import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldString {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
//		System.out.println(context.getBean("name"));
//		
//		System.out.println(context.getBean("age"));
//		
//		System.out.println(context.getBean("person"));
		
//		System.out.println(context.getBean("person"));
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		System.out.println(context.getBean("person2"));
		
		
		

	}

}
