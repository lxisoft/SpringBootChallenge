 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<c:forEach var="applicant" items="${user}">
<a href="http://localhost:8080/personaldata/${applicant.getUsername()">${applicant.getUsername()}<br>
</c:forEach>

</html>