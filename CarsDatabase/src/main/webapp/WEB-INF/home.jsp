<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Cars Database</title>
</head>
<body>
	<h1>Welcome to Cars Database</h1>
	
	<p>Find a car by id.</p>
	<form action="getCars.do" method = "GET">
	<input type = "text" name = "id"/>
	<input type = "submit" value = "Submit"> 
	</form>
	<br>
	<!-- <p>Find a car by model.</p>
	<form action="carsbymodel.do" method = "GET">
	<input type = "text" name = "model"/>
	<input type = "submit" value = "Submit"> 
	</form> -->
	
	<p>Add a car.</p>
	<form action="createCarsForm.do" method="POST">
	<input type="submit" value="Submit"/>
	</form>
	<br>
	<p>Show Inventory.</p>
	<form action="getAllCars.do" method="GET">
	<input type="submit" value ="Submit"/>
		</form>
	
</body>
</html>