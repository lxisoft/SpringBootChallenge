<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>

<form action="/register">
		<h3 style="font-family: TimesNewRoman;"></h3>
		<center>
			USERNAME: <input type="text" name="name"><br> 
			PASSWORD: <input type="text" name="password"><br> 
			<input type="submit" name="button" value="Login">

		</center>
	</form>
	<%
		String name = request.getParameter("name");
		String password = request.getParameter("password");
	%>
</body>
</html>