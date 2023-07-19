package com.vibhor.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.vibhor.learnspringframework.game.GameRunner;
import com.vibhor.learnspringframework.game.GamingConsole;
import com.vibhor.learnspringframework.game.MarioGame;
import com.vibhor.learnspringframework.game.PacMan;
import com.vibhor.learnspringframework.game.SuperContraGame;

@Configuration
public class GamingConfiguration {

	@Bean(name = "pacManGame")
	@Primary
	public GamingConsole pacMan() {
		var game = new PacMan();
		return game;
	}
	
	@Bean
	@Qualifier("marioGame")
	public GamingConsole marioGame() {
		return new MarioGame();
	}
	
	@Bean
	@Qualifier("superContraGame")
	public GamingConsole superContraGame() {
		return new SuperContraGame();
	}


	@Bean
	public GameRunner playGame(GamingConsole gamer) {

		return new GameRunner(gamer);
	}

}
