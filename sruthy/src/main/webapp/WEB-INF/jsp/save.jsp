<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Candidate</title>
</head>
<body>
<form action="/saving"  method="post" enctype="multipart/form-data">
		<center>
		<h3 style="font-family: TimesNewRoman;"></h3>
		REGISTRATION FORM <br><br>
			NAME:    <input type="text" name="name"><br>
			ADDRESS: <input type="text" name="address"><br> 
			EMAIL:   <input type="text" name="email"><br> 
			PHONENUM:<input type="text" name="phonenumber"><br>
			USERNAME:<input type="text" name="userName"><br> 
			PASSWORD:<input type="password" name="password"><br> 
			IMAGE:   <input type="file" name="image"><br> 
			RESUME:  <input type="file" name="resume"><br><br>
			       <input type="submit" name="button" value="SUBMIT">

		</center>
	</form>
	
</body>
</html>