<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body style="background-color:#f1f1f1; text-align:center;">
<%@ include file="header.jsp"%>
<%
String regis =(String)request.getAttribute("regis");
out.print("Welcome ${regis}! You are successfully logged In");
%>
<h1>Welcome "+regis+"! You are successfully Login</h1>
</body>
</html>