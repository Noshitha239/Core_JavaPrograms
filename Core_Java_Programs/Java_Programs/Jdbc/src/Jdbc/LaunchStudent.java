package Jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.ResultSetMetaData;
public class LaunchStudent {

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
			ResultSetMetaData rsmd=res.getMetaData();
			
			for(int i=1;i<=rsmd.getColumnCount();i++) {
				System.out.println(rsmd.getColumnName(i));
				System.out.println(rsmd.getColumnTypeName(i));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
