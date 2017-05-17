<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>save</title>
</head>
<body>
<h2>CREATE NEW USER</h2>
	<form action="/save" method=post>
		ID<input type="text" name="id"><br>
		NAME<input type="text" name="name"><br>
		EMAIL<input type="text" name="email"></br>
		 USERNAME<input type="text" name="username"></br> 
		 PASSWORD<input type="text" name="password"></br>

		<input type="submit" name="button" value="save"> <br>
	</form>
</body>
</html>