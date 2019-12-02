package com.hcl.department;

import java.util.Scanner;

public class AddDepartmentMain {
	public static void main(String[] args) {
		DepartmentDao dao=new DepartmentDao();
		Department dept=new Department();
		int Deptno=dao.generateDeptno();
		dept.setDeptno(Deptno);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter department name");
		dept.setDname(sc.nextLine());
		System.out.println("enter department city");
		dept.setCity(sc.nextLine());
		System.out.println("enter department location");
		dept.setLoc(sc.nextLine());
		System.out.println("enter department head");
		dept.setHead(sc.nextLine());
		System.out.println(dao.addDepartment(dept));
	}

}
