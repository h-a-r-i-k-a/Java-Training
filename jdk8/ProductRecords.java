package com.hcl.jdk8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRecords {
	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
        list.add(new Product(1,"samsung a5",17000));
        list.add(new Product(2,"iphone 6s",65000));
        list.add(new Product(3,"sony xperia",25000));
        list.add(new Product(4,"samsung m10s",15000));
        list.add(new Product(1,"redmi4",26000));
        list.add(new Product(1,"lenevo vibe",19000));
        Collections.sort(list, (p1,p2)-> {
        	return p1.name.compareTo(p2.name);
        });
        list.forEach(p->{
        	System.out.println(p);
        });
        Collections.sort(list,(p1,p2)->{
        	if(p1.price>p2.price){
        		return 1;
        	}else {
        		return 0;
        	}
        	
        });
        list.forEach(p->{
        	System.out.println(p);
        });
	}

}
