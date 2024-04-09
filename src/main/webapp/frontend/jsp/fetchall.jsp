<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<!DOCTYPE html>
<html>
<head>
<style>
<
div {
	display: flex;
	flex-direction: column;
	align-items: center;
	justify-content: center;
}
</style>
</head>
<body>
	<div>

		<h1>Student Records</h1>
		<h4 style="color: green">${message}</h4>
		<h4 style="color: red">${delete}</h4>
		<table border="1px solid black">
			<tr>
				<th>Name</th>
				<th>Mobile</th>
				<th>English</th>
				<th>Maths</th>
				<th>Science</th>
				<th>Dob</th>
			</tr>
			<spring:forEach var="boot" items="${fetch}">
				<tr>
					<th>${boot.name}</th>
					<th>${boot.mobile}</th>

					<th>${boot.english}</th>
					<th>${boot.kannada}</th>

					<th>${boot.dob}</th>
					<th><a href="delete?id=${boot.id}"><button>Delete</button></a></th>
					<th><a href="edit?id=${boot.id}"><button>Edit</button></a></th>
				</tr>
			</spring:forEach>
		</table>
</body>
</html>