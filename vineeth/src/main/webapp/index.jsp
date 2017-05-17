<html>
<body>
	<center>
		<h2>
			<b>...CRUD...</b>
		</h2>
	</center>

	<form action="/index">
		<h3 style="font-family: TimesNewRoman;"></h3>
		<center>

			ID: <input type="text" name="id"><br> ID: <input
				type="text" name="age"><br> PHONENUM: <input
				type="text" name="phoneno"><br> NAME: <input
				type="text" name="name"><br> <input type="submit"
				name="button" value="SUBMIT">

		</center>
	</form>
	<%
		String id = request.getParameter("id");
		String age = request.getParameter("age");
		String phoneno = request.getParameter("phoneno");
		String name = request.getParameter("name");
	%>


	<a href="http://localhost:8080/save">save</a>
	<a href="http://localhost:8080/save">delete</a>


</body>

</html>
