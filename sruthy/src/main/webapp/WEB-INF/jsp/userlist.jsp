<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css" href="/css/userlist.css"/>
<head>
     
    </head>
<title>USERS</title>

<body>
	<ul>
        <li><a href="/home">HR</a></li>
        
        <li><a href="/userlist/1">USERLIST</a></li>
        
        <li><a href="/register">REGISTER</a></li>
		
	</ul><div>
<h3 style="font-family: TimesNewRoman;"><center>
<br><br><br>
				<table>	<c:forEach var="i" items="${userlist.getContent()}">
						<tr>
							<td><a href="/loginpage">${i.getName()}</a></td>
						</tr>
					</c:forEach>
				</table>
	
	</center></h3>
 <div class="pagination">
 <a href="#">&laquo;</a>
	<a href="/userlist/1">1</a>

	<a href="/userlist/2">2</a>

	<a href="/userlist/3">3</a>

	<a href="/userlist/4">4</a>

	<a href="/userlist/5">5</a>
	 <a href="#">&raquo;</a>
</div>

</body>
</html>