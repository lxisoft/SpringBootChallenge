<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
		<li><a href="/home">HOME PAGE</a></li>
	</ul>
<form action="/saving"  method="post" enctype="multipart/form-data">
		<center> 
		<h3 style="font-family: TimesNewRoman;"></h3>
		<br><b>REGISTRATION FORM </b><br><br>
			NAME:    <input type="text" name="name"><br>
			ADDRESS: <input type="text" name="address"><br> 
			EMAIL:   <input type="text" name="email"><br> 
			PHONENUM:<input type="text" name="phonenumber"><br>
			USERNAME:<input type="text" name="userName"><br> 
			PASSWORD:<input type="password" name="password"><br> 
			IMAGE:   <input type="file" name="image"><br> 
			RESUME:  <input type="file" name="resume"><br><br>
			       <input type="submit" name="button" value="SUBMIT">

		</center>
	</form>
	
</body>
</html> --%>


<!DOCTYPE html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]> <html class="lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]> <html class="lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html lang="en"> <!--<![endif]-->
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Registration Form</title>
  <link rel="stylesheet" href="css/style.css">
  <!--[if lt IE 9]><script src="//html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
</head>

<body>
  <div class="container">
    <section class="register">
      <h1>Register</h1>
    <form action="/saving"  method="post" enctype="multipart/form-data">
       <div class="reg_section personal_info">
      <input type="text" name="name" value="" placeholder="name">
      <input type="text" name="email" value="" placeholder="Your E-mail Address">
          </div>
          <div class="reg_section password">
      <input type="text" name="phonenumber" value="" placeholder="phonenumber">
       <input type="text" name="userName" value="" placeholder="username">
       <input type="text" name="password" value="" placeholder="password">
       <input type="file" name="image">
	<input type="file" name="resume">           
     </div>
      <select>
        <option value="">India</option>
        <option value="">Palastine</option>
        <option value="">Syria</option>
        <option value="">Italy</option>
      </select>
      <textarea name="address" id="" placeholder="Your Full Address"></textarea>
      <p class="terms">
        <label>
          <input type="checkbox" name="remember_me" id="remember_me">
           I accept Terms & Condition
        </label>
      </p>
      <p class="submit"><input type="submit" name="commit" value="Sign Up"></p>
      </form>
    </section>
  </div>

 

</body>
</html>