package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/sqlpractice","root","root");
			System.out.println("Connected ...");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from Employ");
			while(rs.next()){
				System.out.println("employ no "+rs.getInt("Empno"));
				System.out.println("name "+rs.getString("Name"));
				System.out.println("Department "+rs.getString("Dept"));
				System.out.println("designation "+rs.getString("Desig"));
				System.out.println("salary "+rs.getInt("Basic"));
				System.out.println("-----------------");
			}
			ResultSet rs1=st.executeQuery("select * from Agent");
			while(rs1.next()){
				System.out.println("AgentID "+rs1.getInt("AgentID"));
				System.out.println("Agent FName "+rs1.getString("FirstName"));
				System.out.println("Agent LName "+rs1.getString("LastName"));
				System.out.println("Gender "+rs1.getString("Gender"));
				System.out.println("-------------");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
