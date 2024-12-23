package com.Rushikesh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
	{
		String mail = req.getParameter("mail");
		String pass = req.getParameter("pass");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rushikesh", "root", "Rushikesh");

			PreparedStatement ps = con.prepareStatement("insert into user values (?, ?);");
			ps.setString(1, mail);
			ps.setString(2, pass);
			
			if(ps.executeUpdate() > 0)
			{
				System.out.println("Sucess");
			}
			else
			{
				System.out.println("Failed");
			}
			
			ps.close();
			con.close();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
	{
		doPost(req, res);
	}
}
