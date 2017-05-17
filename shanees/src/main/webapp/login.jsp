<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

	<form action="/login">
		<input type="hidden" name="id" value=<% out.println(request.getParameter("id")); %> />
		<input type="text" name="email" placeholder="Email"/><br><br>
		<input type="password" name="pass" placeholder="password"/><br><br>
		<input type="submit"/><br><br>
	
	</form>
  ${email}

	
</body>
</html>