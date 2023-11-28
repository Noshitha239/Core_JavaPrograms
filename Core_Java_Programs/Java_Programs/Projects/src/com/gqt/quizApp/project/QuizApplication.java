/**
 * 
 */
package com.gqt.quizApp.project;
import java.util.Scanner;
/**
 * @author 91817
 *
 */
public class QuizApplication {
	public static int key;
	public static int amount;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Your First Question is: ");
		System.out.println(QuizQuestions.question_1);
		System.out.println(QuizQuestions.question_1_option);
		System.out.println("Enter your correct choice: ");
		key=sc.nextInt();
		if(key==QuizQuestions.question_1_answer){
			amount=1000;
			System.out.println("Your answer is right. You have won: "+amount);
			System.out.println("Your Second Question is: ");

			System.out.println(QuizQuestions.question_2);
			System.out.println(QuizQuestions.question_2_option);
			System.out.println("Enter your correct choice: ");
			key=sc.nextInt();
			if(key==QuizQuestions.question_2_answer) {
				amount=2000;
				System.out.println("Your answer is right. You have won: "+amount);
				System.out.println("Your Third Question is: ");

				System.out.println(QuizQuestions.question_3);
				System.out.println(QuizQuestions.question_3_option);
				System.out.println("Enter your correct choice: ");
				key=sc.nextInt();
				if(key==QuizQuestions.question_3_answer) {
					amount=3000;
					System.out.println("Your answer is right. You have won: "+amount);
					System.out.println("Your forth Question is: ");
					
					System.out.println(QuizQuestions.question_4);
					System.out.println(QuizQuestions.question_4_option);
					System.out.println("Enter your correct choice: ");
					key=sc.nextInt();
					if(key==QuizQuestions.question_4_answer) {
						amount=4000;
						System.out.println("Your answer is right. You have won: "+amount);
						System.out.println("Your fifth Question is: ");
						
						System.out.println(QuizQuestions.question_5);
						System.out.println(QuizQuestions.question_5_option);
						System.out.println("Enter your correct choice: ");
						key=sc.nextInt();
						if(key==QuizQuestions.question_5_answer) {
							amount=5000;
							System.out.println("Your answer is right. You have won: "+amount);
							System.out.println("Your Sixth Question is: ");
						    
							

							System.out.println(QuizQuestions.question_6);
							System.out.println(QuizQuestions.question_6_option);
							System.out.println("Enter your correct choice: ");
							key=sc.nextInt();
							if(key==QuizQuestions.question_6_answer) {
								amount=6000;
								System.out.println("Your answer is right. You have won: "+amount);
								System.out.println("Your Seventh Question is: ");
								
								
								System.out.println(QuizQuestions.question_7);
								System.out.println(QuizQuestions.question_7_option);
								System.out.println("Enter your correct choice: ");
								key=sc.nextInt();
								if(key==QuizQuestions.question_7_answer) {
									amount=7000;
									System.out.println("Your answer is right. You have won: "+amount);
									System.out.println("Your Eight Question is: ");
									
									System.out.println(QuizQuestions.question_8);
									System.out.println(QuizQuestions.question_8_option);
									System.out.println("Enter your correct choice: ");
									key=sc.nextInt();
									if(key==QuizQuestions.question_8_answer) {
										amount=8000;
										System.out.println("Your answer is right. You have won: "+amount);
										System.out.println("Your ninth Question is: ");
										
										System.out.println(QuizQuestions.question_9);
										System.out.println(QuizQuestions.question_9_option);
										System.out.println("Enter your correct choice: ");
										key=sc.nextInt();
										if(key==QuizQuestions.question_9_answer) {
											amount=9000;
											System.out.println("Your answer is right. You have won: "+amount);
											System.out.println("Your tenth Question is: ");
											
											System.out.println(QuizQuestions.question_10);
											System.out.println(QuizQuestions.question_10_option);
											System.out.println("Enter your correct choice: ");
											key=sc.nextInt();
											if(key==QuizQuestions.question_10_answer) {
												amount=10000;
												System.out.println("Your answer is right. You have won: "+amount);
												
									        }
											else {
												System.out.println("Your answer is wrong");
												System.out.println("You have won: "+amount);
											}
									    }
										else {
											System.out.println("Your answer is wrong");
											System.out.println("You have won: "+amount);
										}
								    }
									else {
										System.out.println("Your answer is wrong");
										System.out.println("You have won: "+amount);
									}
							    }
								else {
									System.out.println("Your answer is wrong");
									System.out.println("You have won: "+amount);
								
								}
						    }
							else {
								System.out.println("Your answer is wrong");
								System.out.println("You have won: "+amount);
							}
					    }
						else {
							System.out.println("Your answer is wrong");
							System.out.println("You have won: "+amount);
						}
					}
					else {
						System.out.println("Your answer is wrong");
						System.out.println("You have won: "+amount);
					}
				}
				else {
					System.out.println("Your answer is wrong");
					System.out.println("You have won: "+amount);
				}
			}
			else {
				System.out.println("Your answer is wrong");
				System.out.println("You have won: "+amount);
			}
		}
		else {
			System.out.println("Your answer is wrong");
			System.out.println("You have won: "+amount);
		}
	}
}	
