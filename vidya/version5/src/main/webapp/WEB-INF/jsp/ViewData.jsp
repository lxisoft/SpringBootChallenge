<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>VIEW DATA</h1>

</a>

	<c:forEach var="i" begin="8" end="${list.size()}">
 
  		  ${i})	
  		
 		<br>${list.get((i-1)).getiD()}</br>
 		<br> ${list.get((i-1)).getName()}</br>
  		<br>${list.get((i-1)).getEmail()}</br>
 		<br> ${list.get((i-1)).getPhoto()}</br>
  		<br>${list.get((i-1)).getPhoneNumber()}</br>
  		<br>
  	
  		
 	</c:forEach> 	 
 	
 	
</body>
</html>