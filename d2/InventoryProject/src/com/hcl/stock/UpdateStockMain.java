package com.hcl.stock;

import java.util.Scanner;



public class UpdateStockMain {
	public static void main(String[] args) {
		String Stockid;
		double price;int QuantityAvail;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter stockid ");
		Stockid=sc.nextLine();
		System.out.println("Price ");
		price=Double.parseDouble(sc.nextLine());
		System.out.println("QuantityAvail");
		QuantityAvail=Integer.parseInt(sc.nextLine());
		StockDao dao=new StockDao();
		System.out.println(dao.updateStock(Stockid, price, QuantityAvail));
	}

	}


