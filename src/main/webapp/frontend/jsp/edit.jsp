<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update here</title>
</head>
<body>
	<form action="update" method="post">
		<fieldset>
			<legend>Update your values</legend>
			<input type="hidden" name="id" value=${chandru.id}>
			<table>
				<tr>
					<th>Name:</th>
					<th><input type="text" name="name" value=${chandru.name}>
					</th>
				</tr>
				<tr>
					<th>Mobile</th>
					<th><input type="number" name="mobile" value=${chandru.mobile}>
					</th>
				</tr>
				<tr>
					<th>English</th>
					<th><input type="number" name="english"
						value=${chandru.english}></th>
				</tr>
				<tr>
					<th>Kannada</th>
					<th><input type="number" name="kannada"
						value=${chandru.kannada}></th>
				</tr>

				<tr>
					<th>Date of Birth</th>
					<th><input type="date" name="dob" value=${chandru.dob}></th>
				</tr>
				
			</table>
			<tr>
					<button type="submit">Update</button>
					<button type="reset">Cancel</button>
				</tr>

		</fieldset>
	</form>
</body>
</html>