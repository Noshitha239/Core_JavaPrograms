package com.gt.QuizGame1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizGame1 {

	public static void main(String[] args) throws Exception {
		Quiz q = new Quiz();
		q.play();
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
	public boolean Correct(int userAnswer) {
		return userAnswer == correctOption;
	}
}

class Quiz {
	private List<Question> questions;
	private int score;    
	private int currentQuestionIndex;

	public Quiz() {
		questions = new ArrayList<>();
		score = 0;
		currentQuestionIndex = 0;
		questions.add(new Question("Who is the father of computer?", new String[]{"1. James Gosling","2. Steve Jobs","3. Charles Babbage","4. None of the above"}, 3));
		questions.add(new Question("Who Invented java?", new String[]{"1.  James Gosling", "2.  Dennis Ritche", "3. Martin Richards", "4. Ken Thompson"}, 1));
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

	public void play() throws Exception {
		while(NextQuestion()) {
			Question q = getNextQuestion();
			displayQuestion(q);
			System.out.print("Enter your choice: ");

			int userAnswer = InvalidChoiceException.getUserChoice();
			if (q.Correct(userAnswer)) {
				displayMessage("Correct!");
				score++;
			} else {
				displayMessage("Incorrect.");
			}
		}

		displayMessage("Your score: " + score);
	}
	class InvalidChoiceException{
		public static int getUserChoice() throws Exception{
			int choice;
			Scanner sc = new Scanner(System.in);
			choice =sc.nextInt();
			while(true){
				if (choice >= 1 && choice <= 4) {
					InvalidChoiceException ivd= new InvalidChoiceException();
					System.out.println(ivd.displayMessage1());
					Exception idv = null;
					throw idv;
				}
				else{
					System.out.print("Enter your choice: ");
				}
			}
		}
		private String displayMessage1() {
			return "Invalid input. Please enter a valid option.";
		}

	}

}





}

}
