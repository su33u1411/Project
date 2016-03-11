<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
function checkvalue() { 
    var username = document.getElementById('username').value; 
    var password = document.getElementById('password').value; 
    if(!username.match(/\S/)) 
    {
        alert("Name Cannot be Empty");
        return false;
    } 
    else if(!password.match(/\S/)) 
    {
        alert("Password Cannot be Empty");
        return false;
    } 
    else 
    {
        alert("Logging in...........\n Press Ok to Continue");
        return true;
    }
}
</script>
<link rel="stylesheet" type="text/css" href="mystyle.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
<div id="container">
<div id="Header">
<p>SeveletSudeoCode<p>
</div><!-- Header End -->

<div id="Content">
<form name="Login" method="Post" action="/Project/welcome" onsubmit="return checkvalue(this)">
<z>
Username :<input type="text" name="username" placeholder="username" id="username"/>
</br>
Password :<input type="password" name="psword" placeholder="password" id="password"/>
</br>
<input type="submit" value="Login"/>

<a href="register.jsp"><input type="button" value="Register"></input></a>
</form>
</z>
<%
    Integer hitsCount = 
      (Integer)application.getAttribute("hitCounter");
    if( hitsCount ==null || hitsCount == 0 ){
       /* First visit */
       hitsCount = 1;
    }
    else
    {
       /* return visit */
       hitsCount += 1;
    }
    application.setAttribute("hitCounter", hitsCount);
%>

<p>Total number of visits: <%= hitsCount%></p>

</div><!-- Content End -->

<div id="Footer">
<p>Copy Rights@2015 || Subramanyam Mogili</p>
</div><!-- Footer End -->
</div><!-- Container End -->
</body><!-- Body End -->
</html><!-- HTML End  -->