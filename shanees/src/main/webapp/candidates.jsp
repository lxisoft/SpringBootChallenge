<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Candidates</title>
</head>
<body>
<h1>Candidates</h1>
	
	
	<c:forEach var="i" begin="1" end="${list.size()}">

 		  ${i})	
 		
 		 <a href="/login.jsp?id=${list.get((i-1)).getId()}"> ${list.get((i-1)).getName()}</a>
 		
 		<br><br>
 	
 		
	</c:forEach> 	 
	
	

</body>



</html>