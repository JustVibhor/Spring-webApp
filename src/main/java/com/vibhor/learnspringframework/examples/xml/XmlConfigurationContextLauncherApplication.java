package com.vibhor.learnspringframework.examples.xml;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vibhor.learnspringframework.game.GameRunner;

/*

	Annotation
		Very easy to use
		Short and concise
		Not clean POJOs
		Easier to maintain
		Mostly used

		vs

	XMl Configuration
		Do get complex
		not really short and concise
		Clean POJOs
		Not so easy to maintain
		Rarely used
 */



public class XmlConfigurationContextLauncherApplication {

	public static void main(String[] args) {

		try (var context = new ClassPathXmlApplicationContext("ContextConfiguration.xml")) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean("name"));
			context.getBean(GameRunner.class).run();
		}

	}

}
