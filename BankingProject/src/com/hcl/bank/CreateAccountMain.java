package com.hcl.bank;

import java.util.Scanner;

public class CreateAccountMain {
	public static void main(String[] args) {
		AccountDao dao=new AccountDao();
		Account account=new Account();
		int accno=dao.generateAccountNo();
		System.out.println(dao.generateAccountNo());
		account.setAccountNo(accno);
		Scanner sc=new Scanner(System.in);
		System.out.println("First Name ");
		account.setFirstName(sc.nextLine());
		System.out.println("last name ");
		account.setLastName(sc.nextLine());
		System.out.println("city ");
		account.setCity(sc.nextLine());
		System.out.println("state ");
		account.setState(sc.nextLine());
		System.out.println("amount ");
		account.setAmout(Integer.parseInt(sc.nextLine()));
		System.out.println("cheq facil ");
		account.setCheqFacil(sc.nextLine());
		System.out.println("Account type ");
		account.setAccountType(sc.nextLine());
		System.out.println(dao.createAccount(account));
		
	}

	}


