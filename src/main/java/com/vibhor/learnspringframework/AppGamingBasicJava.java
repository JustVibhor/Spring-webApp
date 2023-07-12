package com.vibhor.learnspringframework;

import com.vibhor.learnspringframework.game.GameRunner;
import com.vibhor.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();

	}

}
