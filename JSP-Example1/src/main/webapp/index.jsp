<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		session.setAttribute("SessionName", "Java Server Pages");
	%>
	<form action="output.jsp">
		<input type="text" name="userName"><br><br>
		<input type="submit">
	</form>
</body>
</html>