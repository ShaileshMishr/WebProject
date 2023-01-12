pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header file</title>
</head>
<body>
<h1>Welcome to JSP</h1>
<c:out value="this is example of jstl core" /><br>
<c:set var="url" value="https://hello.com"></c:set>
before removing url
<c:out value="${url}"></c:out><br>
<c:remove var="url"></c:remove>
after removing url:-<c:out value="${url}"></c:out>
<c:set var="num" value="9"></c:set>
<c:choose>
<c:when test="${num>10}">
Number is Greater than 10
</c:when>
<c:when test="${num==10}">
Number is 10
</c:when>
<c:when test="${num<10}">
Number is less than 10
</c:when>
<c:otherwise>
Number is not 9</c:otherwise>
</c:choose>
<c:set var="num1" value="1234.678"></c:set>
Number after setting type attribute
<fmt:formatNumber value="${num1}" type="currency" currencySymbol="₹"></fmt:formatNumber>
<c:set var="teststring" value="Hi this is a JSTL"></c:set>
<c:choose>

<c:when test="${fn:contains(teststring, 'p')}">
 
JSTL Contains
</c:when>
<c:when test="${fn:startsWith(teststring, 'H')}">

<%--
<c:set var="st" value="${fn:length(teststring)}"></c:set>
<c:out value="${st}"></c:out>
--%>

Starts with H and length of string is:-${fn:length(teststring)}<br>
Index of String is:-${fn:indexOf(teststring,'t')}<br>
upper case of String is:-${fn:toUpperCase(teststring)}<br>
lower case of String is:-${fn:toLowerCase(teststring)}<br>
Substring of String is:-${fn:substring(teststring, 5, 17)}<br>
trim of String is:-${fn:trim(teststring)}<br>

</c:when>
<c:when test="${fn:length(teststring)}=17">
</c:when>
<c:otherwise>
Number is not 9</c:otherwise>
</c:choose>
</body>
</html>