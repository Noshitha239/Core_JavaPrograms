package com.gt.QuizGame1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.gqt.QuizGame2.Quiz1;

public class QuizGame {
	public static String userName;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t\t**********Welcome to the QuizGame**********");
		System.out.println("Enter your name: ");
	    userName=sc.nextLine();
		takeQuiz(sc);	
	}
	private static void takeQuiz(Scanner sc) {
		 System.out.println("Welcome, " + QuizGame.userName + "!");
		    
		// TODO Auto-generated method stub
		System.out.println("Enter which language do you want:\n1. Java\n2. Python\n3. HTML\n4. MSQL");
		int quizName = sc.nextInt();
		
		if(quizName == 1){
			Quiz q = new Quiz();
			q.play();
		}
		else if(quizName == 2) {
			Quiz1 otherQuiz = new Quiz1();
			otherQuiz.play1();
		}
		else {
			System.out.println("Invalid input. Please enter a valid number.");
			takeQuiz(sc);	
		}
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

class Quiz {
	private List<Question> questions;
	private int score; 
	private int currentQuestionIndex;
	private String userName;
	public Quiz() {
		questions = new ArrayList<>();
		score = 0;
		currentQuestionIndex = 0;
		questions.add(new Question("1.Who is the father of computer?", new String[]{"1. James Gosling","2. Steve Jobs","3. Charles Babbage","4. None of the above"}, 3));
		questions.add(new Question("2.Who Invented java?", new String[]{"1. James Gosling", "2. Dennis Ritche", "3. Martin Richards", "4. Ken Thompson"}, 1));
		questions.add(new Question("3.In Which year java was introduced?", new String[]{"1. 1992","2. 1995","3. 1998","4. 1962"}, 2));
		questions.add(new Question("4.What are the features of java?", new String[]{"1. Object Oriented","2. portable","3. platform Independent","4. All of the above"}, 4));
		questions.add(new Question("5.who is Invented c language?", new String[]{"1. James Gosling","2. Dennis Ritche","3. Martin Richards","4. Ken Thompson"}, 2));
		questions.add(new Question("6.what are the pillers of object oriented?", new String[]{"1. Encapsulation","2. Abstraction","3. Polymorphism","4. all of the above"}, 4));
		questions.add(new Question("7.How many segments are there in java?", new String[]{"1. 4","2. 3","3. 2","4. 1"}, 1));
		questions.add(new Question("8.what is the priority order for static variable?", new String[]{"1. 1st","2. 2nd","3. 3rd","4. None of the above"}, 1));
		questions.add(new Question("9.As long as loop also called as?", new String[]{"1. For Loop","2. While Loop","3. do while loop","4. For Each loop"}, 2));
		questions.add(new Question("10.How the data is stored in hard disk?", new String[]{"1. files","2. bytes","3. Registers","4. None of the above"}, 1));

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



	public void play(){
		 System.out.println("Welcome, " + QuizGame.userName + "!"+" Your questions starts now. All the best!!!");
		    
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
