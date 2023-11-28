package com.gqt.Quizgame;

import java.util.Scanner;

public class SqlQuiz {
	public static int key;
	public static int amount;
	/**
	 * @param args
	 */
	public static void fun() {
		System.out.println("Do you want to retake the quiz?\n1.Yes\n2.No");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		if(k==1) {
			 QuizGame.takeQuiz(sc);
		}
		else {
			System.out.println("Thank you for taking quiz");
		}
	}
	public static void quiz(){	
	Scanner sc=new Scanner(System.in);
	System.out.println("Your First Question is: ");
	System.out.println(JavaQuestions.question_1);
	System.out.println(JavaQuestions.question_1_option);
	System.out.println("Enter your correct choice: ");
	key=sc.nextInt();
	if(key==JavaQuestions.question_1_answer){
		amount=1000;
		System.out.println("Your answer is right. You have won: "+amount);
		System.out.println("Your Second Question is: ");

		System.out.println(JavaQuestions.question_2);
		System.out.println(JavaQuestions.question_2_option);
		System.out.println("Enter your correct choice: ");
		key=sc.nextInt();
		if(key==JavaQuestions.question_2_answer) {
			amount=2000;
			System.out.println("Your answer is right. You have won: "+amount);
			System.out.println("Your Third Question is: ");

			System.out.println(JavaQuestions.question_3);
			System.out.println(JavaQuestions.question_3_option);
			System.out.println("Enter your correct choice: ");
			key=sc.nextInt();
			if(key==JavaQuestions.question_3_answer) {
				amount=3000;
				System.out.println("Your answer is right. You have won: "+amount);
				System.out.println("Your forth Question is: ");
				
				System.out.println(JavaQuestions.question_4);
				System.out.println(JavaQuestions.question_4_option);
				System.out.println("Enter your correct choice: ");
				key=sc.nextInt();
				if(key==JavaQuestions.question_4_answer) {
					amount=4000;
					System.out.println("Your answer is right. You have won: "+amount);
					System.out.println("Your fifth Question is: ");
					
					System.out.println(JavaQuestions.question_5);
					System.out.println(JavaQuestions.question_5_option);
					System.out.println("Enter your correct choice: ");
					key=sc.nextInt();
					if(key==JavaQuestions.question_5_answer) {
						amount=5000;
						System.out.println("Your answer is right. You have won: "+amount);
						System.out.println("Your Sixth Question is: ");
					    
						

						System.out.println(JavaQuestions.question_6);
						System.out.println(JavaQuestions.question_6_option);
						System.out.println("Enter your correct choice: ");
						key=sc.nextInt();
						if(key==JavaQuestions.question_6_answer) {
							amount=6000;
							System.out.println("Your answer is right. You have won: "+amount);
							System.out.println("Your Seventh Question is: ");
							
							
							System.out.println(JavaQuestions.question_7);
							System.out.println(JavaQuestions.question_7_option);
							System.out.println("Enter your correct choice: ");
							key=sc.nextInt();
							if(key==JavaQuestions.question_7_answer) {
								amount=7000;
								System.out.println("Your answer is right. You have won: "+amount);
								System.out.println("Your Eight Question is: ");
								
								System.out.println(JavaQuestions.question_8);
								System.out.println(JavaQuestions.question_8_option);
								System.out.println("Enter your correct choice: ");
								key=sc.nextInt();
								if(key==JavaQuestions.question_8_answer) {
									amount=8000;
									System.out.println("Your answer is right. You have won: "+amount);
									System.out.println("Your ninth Question is: ");
									
									System.out.println(JavaQuestions.question_9);
									System.out.println(JavaQuestions.question_9_option);
									System.out.println("Enter your correct choice: ");
									key=sc.nextInt();
									if(key==JavaQuestions.question_9_answer) {
										amount=9000;
										System.out.println("Your answer is right. You have won: "+amount);
										System.out.println("Your tenth Question is: ");
										
										System.out.println(JavaQuestions.question_10);
										System.out.println(JavaQuestions.question_10_option);
										System.out.println("Enter your correct choice: ");
										key=sc.nextInt();
										if(key==JavaQuestions.question_10_answer) {
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
		fun();
		
	}
	
}
}



