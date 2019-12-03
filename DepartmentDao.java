package com.hcl.department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;








public class DepartmentDao {
	Connection connection;
	PreparedStatement pst;
	public String addDepartment(Department dept){
		connection=DaoConnection.getConnection();
		String cmd=" insert into Department(Deptno,Dname,city,loc,head) "+" values(?, ?, ?, ?, ?) ";
		String result="";
		try {
			pst=connection.prepareStatement(cmd);
			pst.setInt(1, dept.getDeptno());
			pst.setString(2,dept.getDname());
			pst.setString(3, dept.getCity());
			pst.setString(4, dept.getLoc());
			pst.setString(5, dept.getHead());
			pst.executeUpdate();
			result="department record added...";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		
	}
	public int generateDeptno() {
		connection=DaoConnection.getConnection();
		String cmd="select CASE WHEN MAX(Deptno) IS NULL THEN 1 "
				+" ELSE MAX(Deptno)+1 END Deptno from Department";
		int Deptno=0;
		try {
			pst=connection.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			Deptno=rs.getInt("Deptno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Deptno;
	}

	
	public List<Department> showDepartment(){
		connection=DaoConnection.getConnection();
		String cmd=" select * from Department ";
		Department dept=null;
		List<Department> deptList=new ArrayList<>();
		try {
			pst=connection.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			while(rs.next()){
				dept=new Department();
				dept.setDeptno(rs.getInt("Deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setCity(rs.getString("city"));
				dept.setHead(rs.getString("head"));
				dept.setLoc(rs.getString("loc"));
				}
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deptList;
		}
	}



