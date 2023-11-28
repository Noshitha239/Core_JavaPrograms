package Jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;
public class LaunchStudent4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con=null;
			ResultSet res=null;
			PreparedStatement pstmt=null;
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			System.out.println("Driver Loaded successfully.");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt1","root","root");
			System.out.println("Connection is established");
			
			String s="insert into Student values(?,?,?,?,?)";
			pstmt=con.prepareStatement(s);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the id of the Student");
			int tempId=sc.nextInt();
			System.out.println("Enter the Name");
			String tempName=sc.next();
			System.out.println("Enter Marks1");
			int tempMarks1=sc.nextInt();
			System.out.println("Enter Marks2");
			int tempMarks2=sc.nextInt();
			System.out.println("Enter Marks3");
			int tempMarks3=sc.nextInt();
			pstmt.setInt(1, tempId);
			pstmt.setString(2, tempName);
			pstmt.setInt(3, tempMarks1);
			pstmt.setInt(4, tempMarks2);
			pstmt.setInt(5, tempMarks3);
			int rows = pstmt.executeUpdate();
			System.out.println(rows);	
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
