package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class LaunchStudent6 {
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
			
			String s="delete from Student where Stud_id=?";
			pstmt=con.prepareStatement(s);
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the id of the Student");
			int tempId=sc.nextInt();
			
						
		
			pstmt.setInt(1, tempId);
			int rows = pstmt.executeUpdate();
			System.out.println(rows);
				
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}
}
