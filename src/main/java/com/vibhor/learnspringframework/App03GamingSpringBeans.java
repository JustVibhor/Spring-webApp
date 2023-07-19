package com.vibhor.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vibhor.learnspringframework.game.GameRunner;
import com.vibhor.learnspringframework.game.GamingConsole;
//import com.vibhor.learnspringframework.game.MarioGame;
import com.vibhor.learnspringframework.game.PacMan;

public class App03GamingSpringBeans {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {

			context.getBean(GameRunner.class).run();
		}

	}

}
