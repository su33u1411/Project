<%@ page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver");%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Users</title>
</head>
<body>
<p>Users :</p>
 <%     	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:8889/test","root@localhost", "");
     String q = "select * from registration";
	Statement stmt=conn.createStatement();
	ResultSet rs=stmt.executeQuery(q);
        %>
<TABLE BORDER="1">
            <TR>
                <TH>First Name</TH>
                <TH>Last Name</TH>
                <TH>Address</TH>
                <TH>City</TH>
                <TH>State</TH>
                <TH>Phone</TH>
                <TH>E-mail</TH>
                <TH>U_ID</TH>
            </TR>
             <% while(rs.next()){ %>
            <TR>
                <TD> <%= rs.getString("F_name") %></td>
                <TD> <%= rs.getString("L_name") %></TD>
                <TD> <%= rs.getString("Address") %></TD>
                <TD> <%= rs.getString("City") %></TD>
                <TD> <%= rs.getString("State") %></TD>
                 <TD> <%=rs.getString("Phone") %></TD>
                <TD> <%= rs.getString("Email") %></TD>
                <TD> <%= rs.getString("U_ID") %></TD>
            </TR>
            <%}%>
            </TABLE>
            <div id="Footer">
<p>Copy Rights@2015 || Subramanyam Mogili</p>
</div><!-- Footer End -->
</body>
</html>