package com.vibhor.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class GameRunner {
	
	GamingConsole game;
	
	public GameRunner(@Qualifier("pacMan") GamingConsole game) {
		this.game = game;
	}

	@Bean
	public void run() {
		 
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
