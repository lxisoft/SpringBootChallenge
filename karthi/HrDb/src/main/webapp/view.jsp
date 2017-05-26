<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>VIEW
</head>

<title>view</title>

<c:forEach var="lst" items="${list}">
	
${lst.getUsername()}
	${lst.getPassword()}
	

	</c:forEach>



</html>