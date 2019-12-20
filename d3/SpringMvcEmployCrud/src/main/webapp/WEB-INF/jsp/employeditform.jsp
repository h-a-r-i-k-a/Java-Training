<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<h1>Edit Employee</h1>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="POST" action="/SpringMvcEmployCrud/editsave">
<table>
<tr>
      	<td></td>  
         <td><form:hidden  path="empno" /></td>
         </tr> 
<tr>
<td>Name :</td>
<td><form:input path="name"/></td>
</tr>
<td>Department :</td>
<td><form:input path="dept"/></td>
</tr>
<td>Designation :</td>
<td><form:input path="desig"/></td>
</tr>
<td>Basic :</td>
<td><form:input path="basic"/></td>
</tr>
<tr>  
<td> </td>  
<td><input type="submit" value="Edit Save" /></td>  
</tr>  
</table>
</form:form>
</body>
</html>