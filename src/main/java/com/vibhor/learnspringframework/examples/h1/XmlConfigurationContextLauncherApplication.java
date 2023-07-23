package com.vibhor.learnspringframework.examples.h1;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlConfigurationContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = new ClassPathXmlApplicationContext("ContextConfiguration.xml")) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
		}

	}

}
