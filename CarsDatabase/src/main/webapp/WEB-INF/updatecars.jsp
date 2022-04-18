<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Update Car</title>
</head>
<body>
	
 <form action="updateCars.do" method="POST">
 	
 	
	<input type="hidden" value="${cars.id}" name="id" /> 
	<br>	
	Year: <input type="text" value="${cars.year}" name="year" /> 
	<br>
	Make: <input type="text" value ="${cars.make}" name="make" />
	<br>
	Model: <input type="text" value ="${cars.model}" name="model" />
	<br>
	Engine: <input type="text" value ="${cars.engine}" name="engine" />
	<br>
	Transmission: <input type="text" value ="${cars.transmission}" name="transmission" />
	<br>
	Drivetrain: <input type="text" value ="${cars.drivetrain}" name="drivetrain" />
	<br>
	Force Induction: <input type="text" value ="${cars.forceInduction}" name="forceInduction" />
	<br>
	MPG: <input type="text" value ="${cars.mpg}" name="mpg" />
	<br>
	Photo: <input type="text" value ="${cars.photo}" name="photo" />
	<br>
	<input type="submit" value="Submit" />
	</form>
		<a href="home.do">Return to Home</a><br/>
</body>
</html>