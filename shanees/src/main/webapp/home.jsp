<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
<center><br><br>
	<a href="/register.jsp">Update profile</a>
</center>
<h1>	${user.getName()}</h1>
	<br><br>
<h1>	${user.getEmail()}</h1>
	
	<br><br>
	
	<img src="http://localhost:8080/getImage?id=${user.getId()}&count=12" width="200px" height="200px">
	

</body>
</html>