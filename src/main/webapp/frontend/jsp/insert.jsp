<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="insert" method="post">
	<fieldset>
	<legend>Insert here</legend>
	<th>Name:</th>
	<input type="text" name="name"><br><br>
	<th>Mobile:</th>
	<input type="number" name="mobile"><br><br>
	<th>English:</th>
	<input type="number" name="english"><br><br>
	<th>Kannada:</th>
	<input type="number" name="kannada"><br><br>
	<th>Dob:</th>
	<input type="date" name="dob"><br><br>
	<button type="submit">Submit</button>
	<button type="reset">Cancel <a href="/"></a></button>
	</fieldset>
	</form>
</body>
</html>