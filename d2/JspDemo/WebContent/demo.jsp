<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="demo.jsp">
<center>
First Name:
<input type="text" name="firstName"/> <br/><br/>
LastName:
<input type="text" name="lastName"/><br/><br/>
<input type="submit" value="Show"/>
</center>
</form>
<%
String fname=request.getParameter("firstName");
String lname=request.getParameter("lastName");
String fulName=fname+" "+lname;
%>
Full Name : <b> <%=fulName %> </b>
</body>
</html>