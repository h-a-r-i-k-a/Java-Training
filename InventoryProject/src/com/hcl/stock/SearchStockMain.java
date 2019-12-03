package com.hcl.stock;

import java.util.Scanner;

public class SearchStockMain {
	public static void main(String[] args) {
		String Stockid;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Stockid");
		Stockid=sc.nextLine();
		StockDao dao=new StockDao();
		Stock stock=dao.searchStock(Stockid);
		if(stock!=null){
			System.out.println("First Name "+stock.getItemName());
			System.out.println("Last Name "+stock.getPrice());
		}else{
			System.out.println("Stockid not found...");
		}
	}
	}


