 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<c:forEach var="applicant" items="${user}">
NAME: ${applicant.getUsername()}<br>
PASSWORD: ${applicant.getPassword()}<br>
</c:forEach>

</html>