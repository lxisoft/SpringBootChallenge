<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
<h1>Register</h1>

<div>

<form action="/create"  method="post" enctype="multipart/form-data">
	<input type="text" name="name" placeholder="Enter your name"/><br><br>
	<input type="email" name="email" placeholder="Enter your email"/><br><br>
	<input type="password" name="password" placeholder="Enter your password"/><br><br>
	<input type="password" name="rePassword" placeholder="Re enter password"/><br><br>
	picture<input type="file" name="image" /><br><br>
	resume<input type="file" name="resume" /><br><br>
	<input type="submit"/>
	



</form>



</div>

</body>
</html>