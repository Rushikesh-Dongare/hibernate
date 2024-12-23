package com.Rushikesh;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Demo extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
//		System.out.println("This is the service method of demo class");
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int ans = a + b;
		
//		RequestDispatcher rd = req.getRequestDispatcher("/square");
//		rd.forward(req, res);
		
//		res.sendRedirect("square?ans="+ans); //URL rewriting
		
		Cookie cookie = new Cookie("ans", ans + "");
		
		res.addCookie(cookie);
		
		res.sendRedirect("square");
	}
}
