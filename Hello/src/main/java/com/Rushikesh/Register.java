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
			System.out.println("Driver loaded sucessfully");
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
