<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results</title>
</head>
<body>
	<h1>${cars.year} ${cars.make} ${cars.model}</h1>
	<img src = "${cars.photo }" style="width:500px;height:400px;"/>
	<table>
	<tr>
		<td><p>Engine: ${cars.engine}</p></td>
	</tr>
	<tr>
		<td><p>Transmission: ${cars.transmission}</p></td>
	</tr>
	<tr>
		<td><p>Drivetrain: ${cars.drivetrain}</p></td>
	</tr>
	<tr>
		<td><p>Force Induction: ${cars.forceInduction}</p></td>
	</tr>
	<tr>
		<td><p>MPG: ${cars.mpg}</p></td>
	</tr>
	</table>
	
			<form action="updateCarForm.do" method="POST">
		<button name="id" type="submit" value="${cars.id}">UPDATE</button>
		</form>
		<form action="deleteCars.do" method="POST">
		<button name="id" type="submit" value="${cars.id}">DELETE</button>
	</form>
		<a href="/">Return Home</a>

</body>
</html>