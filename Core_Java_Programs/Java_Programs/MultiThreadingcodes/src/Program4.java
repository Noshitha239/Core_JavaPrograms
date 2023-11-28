import java.util.*;
class Operations extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("addition")) {
			addition();
		}
		else if(Thread.currentThread().getName().equals("printing")) {
			printing();
		}
		else {
			login();
		}
	}

	private void addition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition Operation is initiated");
		System.out.println("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int num2 = sc.nextInt();
		int res = num1 + num2;
		System.out.println("Result of addition is: " + res);
		System.out.println("Addition operation is completed");
	}

	private void printing() {
		System.out.println("Printing operation initiated");
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("Global Quest Technologies");
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing operation completed");
	}

	private void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------");

		System.out.println("Login Operation initiated");
		String user_name = "123gqt";
		String pwd = "123gqt";

		System.out.println("Enter the user name:");
		String uname = sc.next();
		System.out.println("Enter the password:");
		String password = sc.next();

		if (user_name.equals(uname)) {
			if (pwd.equals(password)) {
				System.out.println("Login Success");
			} else {
				System.out.println("Check you password");
			}
		} else {
			System.out.println("Check the user name");
		}

		System.out.println("Login operation is completed");

	}
}
//multi threading using thread class
public class Program4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main started");
		Operations op1 = new Operations();
		Operations op2 = new Operations();
		Operations op3 = new Operations();
		
		op1.setName("addition");
		op2.setName("printing");
		op3.setName("login");
		
		op1.start();
		op2.start();
		op3.start();
		
		System.out.println("Main terminated");
	}
}

