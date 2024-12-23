<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>
	<h1>This is profile page</h1>
	<% String name = (String) session.getAttribute("userName"); %>
	
	<h3>Welcome <%= name %></h3>
	
	<a href="home.jsp">Home</a>&nbsp;&nbsp;
	<a href="about-us.jsp">About us</a>&nbsp;&nbsp;
	<a href="logout">Logout</a>&nbsp;&nbsp;
</body>
</html>