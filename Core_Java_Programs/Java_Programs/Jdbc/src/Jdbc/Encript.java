package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Scanner;

public class Encript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Statement stmt=null;
			Connection con=null;
			PreparedStatement pstmt=null;
			ResultSet res=null;
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			System.out.println("Driver Loaded successfully.");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt1","root","root");
			System.out.println("Connection is established");

			String s="select * from user where username=?";
			pstmt =con.prepareStatement(s);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter u name");
			String username=sc.nextLine();
			System.out.println("Enter psw");
			String password=sc.nextLine();
			String encryptedPassword=encryptedPassword(password);
			pstmt.setString(1,username);
			res = pstmt.executeQuery();
			if(res.next()) {
				String temp=res.getString(2);
				if(temp.equals(encryptedPassword)) {
					System.out.println("Login successfully");
				}

			}
			else {
				System.out.println("Inavalid user name");
			}

		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	private static String encryptedPassword(String password) {
		// TODO Auto-generated method stub
		char pw[] = password.toCharArray();
		String enpw = "";

		for(int i=0; i<pw.length; i++) {
			int x = pw[i];
			x += 10;
			enpw = enpw +(char)x;
		}
		return enpw;
//		char pw[]=password.toCharArray();
//		char enpw[]=new char[pw.length];
//		for(int i=0;i<pw.length;i++) {
//			int x=pw[i];
//			x+=10;
//			enpw[i]=(char)x;
//		}
//        String encryptedPassword=new String(enpw);
//		return encryptedPassword;
	}

}
