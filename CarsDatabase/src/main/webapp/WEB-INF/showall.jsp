<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Inventory</title>
</head>
<body>
		<c:forEach var="c" items="${cars}">
		<table>
		<tr>
					<td>${c.id }</td>
					<td> </td>
					<td>${c.year }</td>
					<td>${c.make }</td>
					<td>${c.model }</td>
					<td><img src = "${c.photo }" style="width:150px;height:100px;"/></td>		
		</tr>
		</table>
		</c:forEach>
		<a href="/">Return Home</a>
</body>
</html>