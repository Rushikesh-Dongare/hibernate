package com.Rushikesh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Square extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int k = 0;
		
		Cookie cookie[] = req.getCookies();
		
		for(Cookie c: cookie)
		{
			if(c.getName().equals("ans")) {
				k = req.getParameter(ans);
			}
		}
	}
}
