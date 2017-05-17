 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<c:forEach var="user" items="${applicant}">
NAME: ${user.getUsername()}<br>
PASSWORD: ${user.getPassword()}<br>
</c:forEach>

</html>