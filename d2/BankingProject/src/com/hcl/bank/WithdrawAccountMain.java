package com.hcl.bank;

import java.util.Scanner;

public class WithdrawAccountMain {
	public static void main(String[] args) {
		int accountNo,withdrawAmount;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Accountno ");
		accountNo=sc.nextInt();
		System.out.println("enter WithdrawAmount ");
		withdrawAmount=sc.nextInt();
		AccountDao dao=new AccountDao();
		System.out.println(dao.withdrawAccount(accountNo, withdrawAmount));
	}
	}


