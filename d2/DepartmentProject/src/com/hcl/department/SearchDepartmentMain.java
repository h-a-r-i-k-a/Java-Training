package com.hcl.department;

import java.util.Scanner;


public class SearchDepartmentMain {
	public static void main(String[] args) {
		int Deptno;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employ no ");
		Deptno=sc.nextInt();
		DepartmentDao dao=new DepartmentDao();
		Department dept=dao.searchDepartment(Deptno);
		if(dept!=null){
			System.out.println("name "+dept.getDname());
			System.out.println("Department "+dept.getCity());
		}else{
			System.out.println("record not found");
		}
		
		
	}

		
	}


