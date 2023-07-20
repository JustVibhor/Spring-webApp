package com.vibhor.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pacMan")
public class PacMan implements GamingConsole{
	public void up() {
		System.out.println("UP");
	}
	
	public void down() {
		System.out.println("DOWN");
	}
	
	public void left() {
		System.out.println("LEFT");
	}
	
	public void right() {
		System.out.println("RIGHT!!!");
	}
}
