package com.Rushikesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class UsingAnnotations extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		
		if(email.equals("rushikesh@gmail.com") && pass.equals("Pass"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("profile.jsp");
			rd.forward(req, res);
		}
		else
		{ 
			PrintWriter out = res.getWriter();
			res.setContentType("text/html");
			out.println("Entered wrong email and password");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, res);
		}
	}
}
