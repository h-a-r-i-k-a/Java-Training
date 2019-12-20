<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<h1>Departments List</h1>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2" width="70%" cellpadding="2">
<tr><th>Empno</th><th>Name</th><th>Dept</th><th>Desig</th><th>Basic</th></tr>
<c:forEach var="employ" items="${list}">
<tr>
<td>${employ.empno}</td>
<td>${employ.name}</td>
<td>${employ.dept}</td>
<td>${employ.desig}</td>
<td>${employ.basic}</td>
<td><a href="editemploy/${employ.empno}">Edit</a></td>
<td><a href="deleteemploy/${employ.empno}">Delete</a></td>
</tr>
</c:forEach>
</table>
<br/>
<a href="employform">Add new Employee</a>

</body>
</html>