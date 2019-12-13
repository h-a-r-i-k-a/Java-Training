package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmploySearch {
	public static void main(String[] args) {
		/*int empno;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employ no");
		empno=sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/sqlpractice","root","root");
			String cmd="select * from Employ where Empno=?";
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, empno);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				System.out.println("employ no "+rs.getInt("Empno"));
				System.out.println("name "+rs.getString("Name"));
				System.out.println("Department "+rs.getString("Dept"));
				System.out.println("designation "+rs.getString("Desig"));
				System.out.println("salary "+rs.getInt("Basic"));
				System.out.println("-----------------");
			}else{
				System.out.println("record not found...");
			}*/
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/sqlpractice","root","root");
			int AgentID;
			Scanner sc1=new Scanner(System.in);
			System.out.println("enter agent no");
			AgentID=sc1.nextInt();
			String cmd1="select * from Agent where AgentID=?";
			PreparedStatement pst1=con.prepareStatement(cmd1);
			pst1.setInt(1, AgentID);
			ResultSet rs1=pst1.executeQuery();
			if(rs1.next()){
				System.out.println("AgentID "+rs1.getInt("AgentID"));
				System.out.println("Agent FName "+rs1.getString("FirstName"));
				System.out.println("Agent LName "+rs1.getString("LastName"));
				System.out.println("Gender "+rs1.getString("Gender"));
				System.out.println("-------------");
			}else{
				System.out.println("record not found");
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
