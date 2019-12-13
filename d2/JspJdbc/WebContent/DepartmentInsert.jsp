<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.jdbc.DaoConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="DepartmentInsert.jsp">
<center>
Department No:
<input type="text" name="deptno"/> <br/>
Department Name:
<input type="text" name="Dname"/> <br/>
City:
<input type="text" name="city"/> <br/>
Location:
<input type="text" name="loc"/> <br/>
Head:
<input type="text" name="head"/> <br/><br/>
<input type="submit" value="Insert"/> <br/>
</center>
</form>
<%
if(request.getParameter("deptno") !=null )
{
int Deptno=Integer.parseInt(request.getParameter("deptno"));

Connection con=DaoConnection.getConnection();
String cmd="insert into Department values(?,?,?,?,?)";
PreparedStatement pst=con.prepareStatement(cmd);
pst.setInt(1, Deptno);
pst.setString(2, request.getParameter("Dname"));
pst.setString(3, request.getParameter("city"));
pst.setString(4, request.getParameter("loc"));
pst.setString(5, request.getParameter("head"));
pst.executeUpdate();
out.println("*** Record Inserted ***");
}
%>
</body>
</html>