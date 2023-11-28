package com.gqt.QuizGame2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import com.gqt.QuizGame2.QuizGame1;
import com.gt.QuizGame1.QuizGame;

public class Quiz1 {

	private List<Question> questions;
	private int score; 
	private int currentQuestionIndex;
	private String userName;
	public Quiz1() {
		questions = new ArrayList<>();
		score = 0;
		currentQuestionIndex = 0;
		questions.add(new Question("1.What is Python?", new String[]{"1. High level language","2. Interpreted","3. General-purpose language","4. All of the above"}, 4));
		questions.add(new Question("2.In which language is Python writtern?", new String[]{"1. c++", "2. c", "3. Java", "4. None of the above"}, 2));
		questions.add(new Question("3.In which year python was introduced?", new String[]{"1. 1992","2. 1995","3. 1991","4. 1962"}, 3));
		questions.add(new Question("4.Which of the following concepts is not a part of Python?", new String[]{"1. Pointers","2.Loops","3. Dynamic Typing","4. All of the above"}, 1));
		questions.add(new Question("5.Which of the following are valid escape sequences in Python?", new String[]{"1. \n","2. \t","3. \\","4. All of the above"}, 4));
		questions.add(new Question("6.What is the maximum length of a Python identifier?", new String[]{"1. 129","2. 8","3. 121","4. None of the above"}, 1));
		questions.add(new Question("7.How is a code block indicated in Python?", new String[]{"1. Brackets","2. Indentation","3. Key","4. None of the above"}, 2));
		questions.add(new Question("8.Which of the following types of loops are not supported in Python?", new String[]{"1. for","2. while","3. do-while","4. None of the above"}, 3));
		questions.add(new Question("9.Which of the following blocks will always be executed whether an exception is encountered or not in a program?", new String[]{"1. try","2. except","3. finally","4. None of the above"}, 3));
		questions.add(new Question("10.What keyword is used in python to raise exceptions?", new String[]{"1. raise","2. try","3. goto","4. except"}, 1));

	}

	public boolean NextQuestion() {
		return currentQuestionIndex < questions.size();
	}

	public Question getNextQuestion() {
		return questions.get(currentQuestionIndex++);
	}

	public void displayQuestion(Question question) {
		System.out.println(question.question);
		for (String option : question.options) {
			System.out.println(option);
		}
	}
	public void displayMessage(String message) {
		System.out.println(message);
	}



	public void play1(){
		System.out.println("Welcome, " + QuizGame1.getUserName() + "!");

		while(NextQuestion()) {
			Question q = getNextQuestion();
			displayQuestion(q);
			System.out.print("Enter your choice: ");
			int userAnswer = getUserChoice();
			switch(userAnswer) {
			case 1:
				if (q.Correct(userAnswer)) {
					displayMessage("Correct!");
					score++;
				} 
				else {
					displayMessage("Incorrect.");
				}
				break;
			case 2:
				if (q.Correct(userAnswer)) {
					displayMessage("Correct!");
					score++;
				} 
				else {
					displayMessage("Incorrect.");
				}
				break;
			case 3:
				if (q.Correct(userAnswer)) {
					displayMessage("Correct!");
					score++;
				} 
				else {
					displayMessage("Incorrect.");
				}
				break;
			case 4:
				if (q.Correct(userAnswer)) {
					displayMessage("Correct!");
					score++;
				} 
				else {
					displayMessage("Incorrect.");
				}
				break;
			case 5:
				displayMessage("Invalid input. Please enter a valid number.");
				System.out.print("Enter your choice: ");	

				break;	
			default:
				displayMessage("Invalid input. Please enter a valid number.");
				System.out.print("Enter your choice: ");
				userAnswer = getUserChoice();	
				switch(userAnswer) {
				case 1:
					if (q.Correct(userAnswer)) {
						displayMessage("Correct!");
						score++;
					} 
					else {
						displayMessage("Incorrect.");
					}
					break;
				case 2:
					if (q.Correct(userAnswer)) {
						displayMessage("Correct!");
						score++;
					} 
					else {
						displayMessage("Incorrect.");
					}
					break;
				case 3:
					if (q.Correct(userAnswer)) {
						displayMessage("Correct!");
						score++;
					} 
					else {
						displayMessage("Incorrect.");
					}
					break;
				case 4:
					if (q.Correct(userAnswer)) {
						displayMessage("Correct!");
						score++;
					} 
					else {
						displayMessage("Incorrect.");
					}
					break;
				case 5:
					displayMessage("Invalid input. Please enter a valid number.");
					System.out.print("Enter your choice: ");	

					break;	
				default:
					displayMessage("Invalid input. Please enter a valid number.");
					System.out.print("Enter your choice: ");
					userAnswer = getUserChoice();					
				}	
			}
		}
		System.out.println("\t\t\t\t**********Your Score Board**********");
		System.out.println("Name: "+QuizGame.userName+"\nYour Total score is: " + score);

	}
	public int getUserChoice(){
		int choice = -1;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String input = scanner.nextLine();
			try {
				choice = Integer.parseInt(input);
				break;
			} catch (NumberFormatException e) {
				displayMessage("Invalid input. Please enter a valid number.");
				System.out.print("Enter your choice: ");
			}
		}
		return choice;

	}

}



