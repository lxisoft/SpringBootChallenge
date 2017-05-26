
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>List1234566</head>

<title>list</title>

	<c:forEach var="lst" items="${list}">

	<a href ="http://localhost:8080/get/<c:out value="${lst.getUsername()}"/>">${lst.getUsername()}</a><br>

</c:forEach>
	


</html>