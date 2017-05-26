<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Candidate</title>
</head>
<body>
	<form action="/login">
		<center>
			<h3 style="font-family: TimesNewRoman;">LOGIN PAGE</h3>
			<br>
			<br> USERNAME: <input type="text" name="userName"><br>
			<br> PASSWORD: <input type="password" name="password"><br>
			<br> <input type="submit" name="button" value="LOGIN">

		</center>
	</form>

</body>
</html> 


 --%>
 
 <!DOCTYPE html>
<html>
<style>
form {

    border: 3px solid #f1f1f1;
     width: 30%;
     height:70%;
}

input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
      box-sizing: border-box;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

button:hover {
    opacity: 0.8;
}

.cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
}

.imgcontainer {
    text-align: center;
    
}

img.avatar {
   
    border-radius: 70%;
}

.container {
 text-align: center;
    padding: 16px;
    width:50%;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 100px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
}

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
	    padding: 15px 55px;
	    text-decoration: none;
	    background-color: #111;
	}

	li a:hover:not(.active) {
	    background-color:brown;
	}
     

</style>
<body>
<ul>
		<li><a href="/home">LOGOUT</a></li>
		<li><a href="/home">HOME PAGE</a></li>
	</ul>
<br>
<center>
<form action="/login"><br><br>
  <div class="imgcontainer">
    <img src="avatar.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    
    <input type="text" placeholder="Enter Username" name="userName" required>

    <input type="password" placeholder="Enter Password" name="password" required>
        
    <button type="submit">Login</button>
    <input type="checkbox" checked="checked"> Remember me
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>
</center>
</body>
</html>
 
 
 