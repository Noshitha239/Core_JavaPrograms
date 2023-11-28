package com.gqt.QuizGame2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class QuizGame1 {

	private static String userName;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t\t**********Welcome to the QuizGame**********");
		System.out.println("Enter your name: ");
		setUserName(sc.nextLine());
		takeQuiz(sc);	
	}
	private static void takeQuiz(Scanner sc) {

		// TODO Auto-generated method stub
		System.out.println("Enter which language do you want:\n1. Java\n2. Python\n3. HTML\n4. MSQL");
		int quizName = sc.nextInt();
		if(quizName == 1){
			Quiz1 q = new Quiz1();
			q.play1();
		}
		else {
			System.out.println("Invalid input. Please enter a valid number.");
			takeQuiz(sc);	
		}
	}
	public static String getUserName() {
		return userName;
	}
	public static void setUserName(String userName) {
		QuizGame1.userName = userName;
	}
	public void play1() {
		// TODO Auto-generated method stub
		
	}
	
}
class Question {
	String question;
	String[] options;
	private int correctOption;
	public Question(String question, String[] options, int correctOption) {
		this.question = question;
		this.options = options;
		this.correctOption = correctOption;
	}
	public boolean Correct(int userAnswer){
		return userAnswer == correctOption;
	}
}

 