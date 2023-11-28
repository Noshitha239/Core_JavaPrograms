package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UserOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		int choice;

		System.out.println("1.First Time User\n2.Existing User");
		System.out.println("Enter Your choice: ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			FirstTimeUser();
			break;

		case 2:
			ExistingUser();
			break;
		default:
			System.out.println("You entered invalid input.please enter valid input.");
			break;
		}
	}
	private static void ExistingUser() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("1.Login\n2.Forgot Password\n3.change Password.");
			System.out.println("Enter Your choice: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				Login();
				break;
			case 2:
				ForgotPassword();
				break;
			case 3:
				ChangePassword();
				break;
			default:
				System.out.println("You entered invalid input.please enter valid input.");
				break;
			}
		}while(choice!=0);
	}

	private static void Login() {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			System.out.println("Driver loaded successfully");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt1", "root", "root");
			System.out.println("Connection is established");

			String s = "select * from user where username=?";
			pstmt = con.prepareStatement(s);
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter username");
			String username = scan.nextLine();
			System.out.println("Enter password");
			String password = scan.nextLine();
//			String encrytedPassword = encryptPassword(password);
			pstmt.setString(1, username);
			res = pstmt.executeQuery();
			String SS=" ";
			for(int i=0;i<password.length();i++) {
				int s1=password.charAt(i)+10;
				SS+=(char)s1;
			}
			if(res.next()){
				String tempPassword = res.getString(2);
				if(tempPassword.equals(SS)){
					System.out.println("Login success.");
				}
				else {
					System.out.println("Invalid password..Please enter valid password.");
				}
			}   
			else {
				System.out.println("Invalid user name");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
//	static String encryptPassword(String password) {
//		char pw[] = password.toCharArray();
//		String enpw = "";
//
//		for(int i=0; i<pw.length; i++) {
//			int x = pw[i];
//			x += 10;
//			enpw = enpw +(char)x;
//		}
//		String encrytedPassword = encryptPassword(enpw);
//		return enpw;
//		
//	}

	
	private static void ChangePassword() {
		// TODO Auto-generated method stub
          
	}
	private static void ForgotPassword() {
		// TODO Auto-generated method stub

	}
	private static void FirstTimeUser() {
		// TODO Auto-generated method stub
		try {
			Statement stmt=null;
			Connection con=null;
			PreparedStatement pstmt=null;
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			System.out.println("Driver Loaded successfully.");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt1","root","root");
			System.out.println("Connection is established");

			String s="insert into User values(?,?,?)";

			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter User name:");
			String username=sc1.next();
			sc1.nextLine();

			System.out.println("Enter password:");
			String password=sc1.next();
			
			String SS=" ";
			for(int i=0;i<password.length();i++) {
				int s1=password.charAt(i)+10;
				SS+=(char)s1;
			}
			System.out.println("Enter Phone Number:");
			long phno=sc1.nextLong();
		    String s1=Long.toString(phno);
		    if(s1.length()!=10) {
		    	System.out.println("Invalid number please enter valid number");
		    	FirstTimeUser();
		    }
			pstmt = con.prepareStatement(s);
			pstmt.setString(1, username);
			pstmt.setString(2, SS);
			pstmt.setLong(3, phno);
			int res = pstmt.executeUpdate();
			System.out.println(res);
			if(res != 0) {
				System.out.println("Registration Done Successfully.");
				ExistingUser();
			}
			else {
				System.out.println("There is some issues occured while entering username and password.");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}
}
