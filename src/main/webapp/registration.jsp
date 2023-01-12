<!-- 
Create a registration jsp with userId and mobile number field. once user registers values should be saved in 
database table and then user can login with mobile number. All pages should have a common header and also include 
an error page in case of any exception.
 -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#f1f1f1; text-align:center;">
<h1>Registration Page</h1>
<%@ include file="header.jsp"%>
<form action="<%=request.getContextPath()%>/InsertData" method="post">
<input type = "text" name="id" placeholder ="Enter User id "/><br><br>
<input type = "text" name="mno" placeholder ="Enter mobile no"/><br><br>
<input type = "submit" value = "Register"/>

</form>
<br>
<a href='login1.jsp'><button type=\"button\">Login</button></a>


</body>
</html>