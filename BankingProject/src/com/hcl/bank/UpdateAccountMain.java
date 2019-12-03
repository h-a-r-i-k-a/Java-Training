package com.hcl.bank;

import java.util.Scanner;

public class UpdateAccountMain {
	public static void main(String[] args) {
		int accountNo;
		String city,state;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter accountno ");
		accountNo=Integer.parseInt(sc.nextLine());
		System.out.println("City ");
		city=sc.nextLine();
		System.out.println("state");
		state=sc.nextLine();
		AccountDao dao=new AccountDao();
		System.out.println(dao.updateAccount(accountNo, city, state));
	}

}
