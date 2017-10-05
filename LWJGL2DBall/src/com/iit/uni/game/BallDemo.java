package com.iit.uni.game;

import com.iit.uni.engine.GameEngine;
import com.iit.uni.engine.IGameLogic;

/**
 * Simple tutorial for 2D texture loading and rendering
 * 
 * @author Mileff Peter
 *
 */
public class BallDemo {

	public static void main(String[] args) {
		try {
			boolean vSync = true;
			IGameLogic gameLogic = new DummyGame();
			GameEngine gameEng = new GameEngine("2D Texture Coloring Demo!!!!", 1000, 700, vSync, gameLogic);
			gameEng.start();
		} catch (Exception excp) {
			excp.printStackTrace();
			System.exit(-1);
		}
	}
}