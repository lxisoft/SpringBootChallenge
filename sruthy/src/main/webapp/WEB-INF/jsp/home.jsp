<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

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
	    float:right;
		}

	li a {
	    display: block;
	    color: white;
	    text-align: center;
	    padding: 25px 50px;
	    text-decoration: none;
	    background-color: black;
	}

	li a:hover:not(.active) {
	    background-color:brown;
	}
	   
      div
    {
        position: absolute;
        top:11%;
        width: 98.8%;
    height: 160%;
    background-color: orange;
   animation-name: example;
    animation-duration: 4s;
    animation-iteration-count: infinite;
   
                  
    }
    
    @keyframes example {
    0%   {background-color: orange;}
    25%  {background-color: yellow;}
    50%  {background-color: orange;}
    100% {background-color: orange;}
}
     
    </style>
    </head>
<title>HOME PAGE</title>

<body>
<ul>
	<li><a href="/home">HR</a></li>
        
        <li><a href="/userlist/1">USERLIST</a></li>
        
        <li><a href="/register">REGISTER</a></li>
		
	</ul><div></div>


</body>
</html>