<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<body>
	<h1>This is about us page</h1>
	<% String name = (String) session.getAttribute("userName"); %>
	
	<h3>Welcome <%= name %></h3>
	<a href="home.jsp">Home</a>&nbsp;&nbsp;
	<a href="profile.jsp">Profile</a>&nbsp;&nbsp;
	<a href="logout">Logout</a>&nbsp;&nbsp;
</body>
</body>
</html>