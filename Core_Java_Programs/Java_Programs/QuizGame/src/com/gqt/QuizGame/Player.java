package com.gqt.QuizGame;

public class Player {

	private String name;
	private int score;

	public Player(String name) {
		this.name = name;
		this.score = 0;
	}

	public void increaseScore(int points) {
		score += points;
	}

	public int getScore() {
		return score;
	}
	public String getName() {
		return name;
	}
}

