<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<!-- 
<body style="text-align:center;">

<div style="background-color:#04AA6D;">
<h1>This is header</h1>
<h2>Welcome</h2>
</div>

</body>
 -->
 <body>
 <h1>JSP TUTORIAL</h1>
	Username: <%=request.getParameter("userName") %>
 </body>

</html>