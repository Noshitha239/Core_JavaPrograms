package QuizGame;

import java.util.ArrayList;
import java.util.List;

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
	private List<Question> questions = new ArrayList<>();
	private int score;    
	private int currentQuestionIndex;

	public Quiz() {
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

	public void getUserInput() {
		System.out.print("Enter your choice: ");
	}

	public void displayMessage(String message) {
		System.out.println(message);
	}

public class QuizGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
}
