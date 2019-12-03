package com.hcl.employ;

import java.util.Scanner;

public class DeleteEmployMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employ no ");
		empno=sc.nextInt();
		EmployDao dao=new EmployDao();
		Employ employ=dao.deleteEmploy(empno);
	}

}
