package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.sql.Statement;
public class LanuchStudent1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Statement stmt=null;
			Connection con=null;
			ResultSet res=null;
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			System.out.println("Driver Loaded successfully.");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gqt1","root","root");
			System.out.println("Connection is established");
			
			String s="select * from Student";
			stmt = con.createStatement();
			res = stmt.executeQuery(s);
			
			while(res.next()) {
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
