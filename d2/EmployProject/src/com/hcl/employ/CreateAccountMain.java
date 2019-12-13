package com.hcl.employ;

import java.util.List;

public class CreateAccountMain {
	public static void main(String[] args) {
		EmployDao dao=new EmployDao();
		List<Employ> employList=dao.showEmploy();
		for (Employ employ : employList) {
			System.out.println("Employ No "+employ.getEmpno());
			System.out.println("Employ Name "+employ.getName());
			System.out.println("Department "+employ.getDept());
			System.out.println("Designation "+employ.getDesig());
			System.out.println("salary "+employ.getBasic());
			System.out.println("-------------------------");
			
		}
	}

}
