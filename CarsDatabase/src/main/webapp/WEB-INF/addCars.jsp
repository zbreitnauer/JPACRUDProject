<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Add a Car</title>
</head>
<body>
		<form action="createCars.do" method="POST">
	<p>Year:</p> <input type="text" name="year" required/> 
	<br>
	<p>Make:</p><input type="text" name="make" required/>
	<br>
	<p>Model:</p><input type="text" name="model" required/>
	<br>
	<p>Engine:</p> <input type="text" name="engine" />
	<br>
	<p>Transmission:</p> <input type="text" name="transmission" />
	<br>
	<p>Drivetrain:</p><input type="text" name="drivetrain" />
	<br>
	<p>Force Induction:</p><input type="text" name="forceInduction" />
	<br>
	<p>MPG:</p><input type="text" name="mpg" />
	<br>
	<p>Photo:</p><input type="text" name="photo" />
	<input type="submit" value="Submit"/>
		</form>
</body>
</html>