<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HOME PAGE</title>
</head>
<body><br><br><br><br>
<center>

<c:choose>
	<c:when test="${list.size()==0}">
		<% out.println("NO REGISTERED USERS");%>
	</c:when>

	<c:otherwise><table>
		<c:forEach var="i" items="${list}">
		<tr><td><a href="/loginpage">${i.getName()}</a></td></tr>
		</c:forEach>
		</table>
	</c:otherwise>
</c:choose>

<form action="/register"><br><br>
   NOT REGISTERED YET???
   <br><br>
	<input type="submit" name="button" value="REGISTER">
</form>

</center>

</body>
</html>