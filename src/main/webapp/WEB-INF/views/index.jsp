<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hibernate Demo 1</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
<div class="container">
	<h1>List of People</h1>

	<table border="1">
		<c:forEach var="myVar" items="${list}">
			<tr>
				
				<td>${myVar.id}</td>
				<td>${myVar.name}</td>
				<td>${myVar.location}</td>
				<td><a href="delete?id=${myVar.id}">Delete</a> 
				<td><a href="update?id=${myVar.id}">Update</a>
				
			</tr>

		</c:forEach>

	</table>
	<br>
	<h1>Search for a Person</h1>
	<form action="search">
		ID: <input type="number" name="id"> <input type="submit"
			value="Search">
	</form>

<br>
	<h1>Add a Person</h1>
	<form action="add" method="post">
		Name: <input
			type="text" name="name"><br> Location: <input
			type="text" name="loc"><br> 
			<input type="submit" class="btn btn-danger"
			value="Submit">
	</form>
</div>
</body>
</html>