package com.hcl.stock;

import java.util.Scanner;

public class PlaceOrderMain {
	public static void main(String[] args) {
		int qtyorder;
		String stockid;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter stock id");
		stockid=sc.nextLine();
		System.out.println("enter qty to be ordered");
		qtyorder=Integer.parseInt(sc.nextLine());
		StockDao dao=new StockDao();
		System.out.println(dao.placeOrder(stockid,qtyorder));
	}
	}


