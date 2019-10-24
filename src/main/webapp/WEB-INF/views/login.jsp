<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./login" method="post">
	<table>
		<tr>
			<td>Email:</td>
			<td><input type="email" name="email" required="required"></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="password" name="password" required="required"></td>
		</tr>
		<tr>
			<td><input type="submit" value="Sign in"></td>
		</tr>		
	</table>
</form>
<h2 style="color: green;">${msg} </h2>
<h2 style="color: red;">${msgred} </h2>
</body>
</html>