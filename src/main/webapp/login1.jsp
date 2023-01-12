<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#f1f1f1; text-align:center;">
<h1>Login Page</h1>
<%@ include file="header.jsp"%>
<form action="<%=request.getContextPath()%>/welcomeServlet1" method="post">
<input type = "text" name="mno" placeholder ="Enter mobile no"/><br><br>
<input type = "submit" value = "LogIn"/><br><br>
</form>
</body>
</html>