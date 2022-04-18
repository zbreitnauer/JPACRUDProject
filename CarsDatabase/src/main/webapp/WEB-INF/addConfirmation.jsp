<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Confirmation</title>
</head>
<body>
		<h1>Car has been successfully added. </h1>
		<img src = "${cars.photo }" style="width:500px;height:400px;"/>
		<br>
		<p>ID: ${cars.id}</p>
		<br>
		<p>Year: ${cars.year}</p>
		<br>
		<p>Make: ${cars.make}</p>
		<br>
		<p>Model: ${cars.model}</p>
		<br>
			
		<a href="/">Return Home</a><br/>
			

			
</body>
</html>