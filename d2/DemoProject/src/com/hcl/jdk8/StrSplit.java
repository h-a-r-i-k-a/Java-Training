package com.hcl.jdk8;



public class StrSplit {
	void show(){
		String names="Sowmya Harika Bharat Teja Sai Mounika";
		String[] list=names.split(" ");
		for (String string : list) {
			System.out.println(string);
			}
	}
	public static void main(String[] args) {
		new StrSplit().show();
	}

}
