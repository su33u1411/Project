<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>
<div id="container">
<div id="header">

</div><!-- Header End -->

<div id="Content">
<form name="Register" method="Post" action="/Project/register">
<table>
<tr>
<td>FirstName :<input type="text" name="F_name" placeholder="FirstName"/>
</br>
LastName :<input type="text" name="L_name" placeholder="LastName"/>
</br>
Address :<input type="text" name="Address" placeholder="Address"/>
</br>
City :<input type="text" name="City" placeholder="City"/>
</br>
State :<input type="text" name="State" placeholder="State"/>
</br>
Phone :<input type="text" name="Phone" placeholder="Phone"/>
</br>
E-Mail :<input type="text" name="Email" placeholder="Email"/>
</br>
Username :<input type="text" name="U_ID" placeholder="Email"/>
</br>
Password :<input type="text" name="Pass" placeholder="Email"/>
</br>
<input type="submit" value="Register"/>
</td>
</tr>
</table>
</form>
</div><!-- Content End -->
<div id="Footer">
<p>Copy Rights@2015 || Subramanyam Mogili</p>
</div><!-- Footer End -->
</div><!-- Container End -->
</body>
</html>