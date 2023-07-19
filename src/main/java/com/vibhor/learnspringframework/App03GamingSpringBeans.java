package com.vibhor.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vibhor.learnspringframework.game.GameRunner;

@Configuration
@ComponentScan("com.vibhor.learnspringframework.game")
public class App03GamingSpringBeans {


	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(App03GamingSpringBeans.class)) {

			context.getBean(GameRunner.class).run();
		}

	}

}
