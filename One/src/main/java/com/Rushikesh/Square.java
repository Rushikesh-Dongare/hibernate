package com.Rushikesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Square extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int k = 0;
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c: cookies)
		{
			if(c.getName().equals("ans"))
			{
				k = Integer.parseInt(c.getValue());
			}
		}
		
		
		PrintWriter out = res.getWriter();
		out.println("This is Square Servlet");
		out.println("Result is: "+(k*k));
		
		out.print("Hi ");
		ServletConfig context = getServletConfig();
		String name = context.getInitParameter("name");
		String phone = context.getInitParameter("phone");
		out.print(name);
		out.print(phone);
		System.out.println("square called");
	}
}
