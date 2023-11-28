package com.gqt.QuizGame;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Question1 {
	private String questionText;
	private String[] options;
	private int correctOption;

	public Question1(String questionText, String[] options, int correctOption) {
		this.questionText = questionText;
		this.options = options;
		this.correctOption = correctOption;
	}

	public boolean isCorrect(int userAnswer) {
		return userAnswer == correctOption;
	}

	public void displayQuestion() {
		System.out.println(questionText);
		for (String option : options) {
			System.out.println(option);
		}
	}
}

class Quiz1 {
	private List<Question1> questions;
	private int score;
	private int currentQuestionIndex;

	public Quiz1() {
		questions = new ArrayList<>();
		score = 0;
		currentQuestionIndex = 0;

		questions.add(new Question1("What is the capital of France?", new String[]{"1. London", "2. Berlin", "3. Paris", "4. Madrid"}, 3));
		questions.add(new Question1("Which planet is known as the Red Planet?", new String[]{"1. Venus", "2. Earth", "3. Mars", "4. Jupiter"}, 3));
	}

	public boolean hasNextQuestion() {
		return currentQuestionIndex < questions.size();
	}

	public Question1 getNextQuestion() {
		return questions.get(currentQuestionIndex++);
	}

	public void play() {
		Scanner scanner = new Scanner(System.in);

		while (hasNextQuestion()) {
			Question1 question = getNextQuestion();
			question.displayQuestion();

			// Get the user's answer.
			int userAnswer = scanner.nextInt();

			if (question.isCorrect(userAnswer)) {
				System.out.println("Correct!");
				score++;
			} else {
				System.out.println("Incorrect.");
			}
		}

		// Display the final score.
		System.out.println("Your score: " + score);
	}
}

public class Quizz {
	public static void main(String[] args) {
		Quiz1 quiz = new Quiz1();

		// Create a player.
		Player player = new Player("John");

		// Start the game.
		quiz.play();

		// Display the player's score.
		System.out.println(player.getName() + "'s score: " + player.getScore());
	}
}

