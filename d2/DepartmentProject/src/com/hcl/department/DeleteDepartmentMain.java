package com.hcl.department;

import java.util.Scanner;


public class DeleteDepartmentMain {
	public static void main(String[] args) {
		int Deptno;
		System.out.println("enter Deptno no ");
		Scanner sc=new Scanner(System.in);
		Deptno=sc.nextInt();
		DepartmentDao dao=new DepartmentDao();
		System.out.println(dao.deleteDepartment(Deptno));
	}
	}


