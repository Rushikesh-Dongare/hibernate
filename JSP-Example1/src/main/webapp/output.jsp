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
		String sessionName = (String)session.getAttribute("SessionName");
		String userName = request.getParameter("userName");
	%>
	
	<div class="Output">
		Hello <%= userName %> this is "<%=sessionName%>" session!
	</div>
</body>
</html>