<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inventory</title>
</head>
<body>
		<c:forEach var="c" items="${cars}">
		<table>
		<tr>
					<td>${c.id }</td>
					<td>${c.year }</td>
					<td>${c.make }</td>
					<td>${c.model }</td>		
		</tr>
		</table>
		</c:forEach>
		<a href="/">Return Home</a>
</body>
</html>