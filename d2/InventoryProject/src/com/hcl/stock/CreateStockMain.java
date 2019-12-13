package com.hcl.stock;

import java.util.Scanner;

public class CreateStockMain {
	public static void main(String[] args) {
		StockDao dao=new StockDao();
		Stock stock=new Stock();
		String Stockid=dao.generateStockid();
		System.out.println(dao.generateStockid());
		stock.setStockid(Stockid);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the item name");
		stock.setItemName(sc.nextLine());
		System.out.println("enter the price of item");
		stock.setPrice(Double.parseDouble(sc.nextLine()));
		System.out.println("enter the available quantity");
		stock.setQuantityAvail(Integer.parseInt(sc.nextLine()));
		System.out.println(dao.createStock(stock));
		
	}

}
