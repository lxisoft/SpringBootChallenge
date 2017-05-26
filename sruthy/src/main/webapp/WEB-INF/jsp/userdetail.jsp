<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE>
<html>
<head>
<style>
     
     ul {
		
    list-style: none;
    overflow: hidden;
    background-color: black;
	}

	li {
       list-style: none;
	    float: right;
	}

	li a {
	    display: block;
	    color: white;
	    text-align: center;
	    padding: 15px 98px;
	    text-decoration: none;
	    background-color: #111;
	}

	li a:hover:not(.active) {
	    background-color:brown;
	}
     
    </style>
    </head>
<title>Candidate</title>

<body>
		<ul>

		<li><a href="/home">LOGOUT</a></li>
		<li><a href="/home">HOME PAGE</a></li>
	</ul>
<br>

	<c:forEach var="i" items="${list}">
		<c:set var="id" value="${i.getId()}" />
		<c:if test="${id == candidate}">
<center>
<img src="/image?id=${i.getId()}" width="150" height="150" />
<h2>
				<b>${i.getName()}</b>
			</h2>
				<h3>Address : ${i.getAddress()}<br> email :${i.getEmail()}<br>
				phonenumber : ${i.getPhonenumber()}<br> <br>
					
			<br>
			<a href="resume?id=${i.getId()}">VIEW RESUME</a>
			</center>
		</c:if>
	</c:forEach>



</body>
</html>