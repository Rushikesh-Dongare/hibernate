package com.Rushikesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet 
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		PrintWriter out = res.getWriter();
		
		String email = req.getParameter("email");
		String pass = req.getParameter("password");
		System.out.println(email);
		if(email.equals("rushikesh@gmail.com") && pass.equals("Pass"))
		{
			String name = "Rushikesh";
			HttpSession session = req.getSession();
			session.setAttribute("userName", name);
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, res);
		}
		else {
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.forward(req, res);
		}
	}
}
