<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring boot challenge</title>
<form action="http://localhost:8080/register" enctype = "multipart/form-data">
username:<input type="text" name="username">  <br />
password:<input type="text" name="password">    <br />
photo:<input type = "file" name = "file" />   <br />

<input type="submit" name="save">
</form>

</head>
<body>

</body>
</html>