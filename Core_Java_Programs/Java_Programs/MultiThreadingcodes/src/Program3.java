import java.util.*;
import java.util.Scanner;
class Addition extends Thread{
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Currently executing Thread is: "+Thread.currentThread().getName());
		System.out.println("Addition operation is Intiated");
		System.out.println("Enter num1: ");
		int num1=sc.nextInt();
		System.out.println("Enter num2: ");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println("Result of addition is:"+res);
		System.out.println("Addition operation is completed.");
		System.out.println("-------------------------------");
		System.out.println("Currently executing Thread is: "+Thread.currentThread().getName());
	}
}
class Printing extends Thread{
	@Override
	public void run() {
		System.out.println("Currently executing Thread is: "+Thread.currentThread().getName());
		System.out.println("Printing Operation Intiated");
		for(int i=0;i<5;i++) {
			try {
				System.out.println("Glabal Quest Technologies");
				Thread.sleep(3000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing operation is completed.");
		System.out.println("-------------------------------");
		System.out.println("Currently executing Thread is: "+Thread.currentThread().getName());
	}
}
class Login extends Thread{
	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("currently executing Thread is:"+Thread.currentThread().getName());
		System.out.println("Login Operation Intiated.");
		String user_name="123gqt";
		String pwd="123gqt";
		System.out.println("enter the user name: ");
		String uname=sc.next();
		System.out.println("Enter the password: ");
		String password=sc.next();
		if(user_name.equals(uname)) {
			if(pwd.equals(password)) {
				System.out.println("Login Success"); 
			}
			else {
				System.out.println("Check your Password");
			}
		}
		else {
			System.out.println("Check the user name");
		}
        System.out.println("Login Operation is completed");
        System.out.println("currently executing Thread is:"+Thread.currentThread().getName());
	}
}
public class Program3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Main Started");
        Addition ad=new Addition();
        Printing pt= new Printing();
        Login lg=new Login();
        ad.setName("addition");
        pt.setName("printing");
        lg.setName("Login");
        System.out.println(ad);
        System.out.println(pt);
        System.out.println(lg);
        ad.start();
        pt.start();
        lg.start();
        System.out.println("Main Thread terminated.");
	}
}
