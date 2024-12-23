package com.Rushikesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JavaDatabaseConnectivity {
	
	public static void main(String[] args)
	{
		int id = 2;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rushikesh", "root", "Rushikesh");
			
			System.out.println("Driver loaded sucessfully");
			
			PreparedStatement statement = con.prepareStatement("delete from employee where id=?");
			
			statement.setInt(1, id);
			int ans = statement.executeUpdate();
			if(ans > 0)
			{
				System.out.println("Sucess");
			}
			else {
				System.out.println("Failed");
			}
				

			statement.close();
			con.close();
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}
}
