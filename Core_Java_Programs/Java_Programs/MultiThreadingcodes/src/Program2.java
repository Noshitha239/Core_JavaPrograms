import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Currently executing Thread is: "+Thread.currentThread().getName());
		System.out.println("Addition operation is Intiated");
		System.out.println("enter num1: ");
		int num1=sc.nextInt();
		System.out.println("enter num2: ");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println("Result of addition is:"+res);
		System.out.println("Addition operation is completed.");
		System.out.println("-------------------------------");
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
		System.out.println("---------------------------------");
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
