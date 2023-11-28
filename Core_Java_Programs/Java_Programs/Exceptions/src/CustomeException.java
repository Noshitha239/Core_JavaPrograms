import java.util.Scanner;
import java.lang.*;
class UnderAgeException extends Exception{
	public String getMessage() {
		return "Your age is less than 18";
	}
}
class OverAgeException extends Exception{
	public String getMessage() {
		return "Your age is above 18";
	}
}
class Candidate{
	int age;
	void collectData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age: ");
		age=sc.nextInt();
	}
	void verify() throws UnderAgeException,OverAgeException {
		if(age<18) {
			UnderAgeException uae=new UnderAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age>18) {
			OverAgeException oae=new OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		}
		else {
			System.out.println("Eligible for License");
		}
	}
}
public class CustomeException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Candidate c1=new Candidate();
        try {
        	c1.collectData();
        	c1.verify();
        }
        catch(UnderAgeException uae) {
        	System.out.println("Under Age Exception handled in main");
        }
        catch(OverAgeException oae) {
        	System.out.println("Over Age Exception handled in main");
        }
	}
}
