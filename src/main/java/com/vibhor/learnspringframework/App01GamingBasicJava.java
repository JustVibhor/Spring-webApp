package com.vibhor.learnspringframework;

import com.vibhor.learnspringframework.game.GameRunner;
//import com.vibhor.learnspringframework.game.MarioGame;
import com.vibhor.learnspringframework.game.PacMan;
//import com.vibhor.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		var game = new PacMan();
		
//		var game = new SuperContraGame();
//		object creation + wiring of dependencies 
//		below "game" is a dependency of GameRunner
//		Right now we are managing the creation of objects which can be automated by spring framework 
		var gameRunner = new GameRunner(game);
		gameRunner.run();

	}

}
