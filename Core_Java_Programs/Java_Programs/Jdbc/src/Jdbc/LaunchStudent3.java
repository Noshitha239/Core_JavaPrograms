package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.SQLException;
public class LaunchStudent3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Statement stmt=null;
			Connection con=null;
			ResultSet res=null;
			PreparedStatement pstmt=null;
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			System.out.println("Driver Loaded successfully.");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt1","root","root");
			System.out.println("Connection is established");
			
			String s="select * from Student where Stud_id=?";
			pstmt = con.prepareStatement(s);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the id of the Student");
			int tempId=sc.nextInt();
			pstmt.setInt(1, tempId);
			res=pstmt.executeQuery();
			if(res.next()) {
				int id= res.getInt(1);
			    String name= res.getString(2);
				int marks1= res.getInt(3);
				int marks2= res.getInt(4);
				int marks3= res.getInt(5);
				
				System.out.println(id+"   "+name+"   "+marks1+"   "+marks2+"   "+marks3);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
