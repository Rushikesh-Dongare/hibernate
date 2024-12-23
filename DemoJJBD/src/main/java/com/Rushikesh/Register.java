package com.Rushikesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class Register extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	{
		String mail = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rushikesh", "Root", "Rushikesh");
			
			PreparedStatement ps = con.prepareStatement("insert into user values (?, ?);");
			ps.setString(1, mail);
			ps.setString(2, pass);
			
			int count = ps.executeUpdate();
			if(count > 0)
			{
				System.out.println("Sucess");
			}
			else {
				System.out.println("Failed");
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
