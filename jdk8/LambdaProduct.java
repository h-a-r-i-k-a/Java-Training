package com.hcl.jdk8;

import java.util.List;
import java.util.ArrayList;

public class LambdaProduct {
	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
        list.add(new Product(1,"samsung a5",17000));
        list.add(new Product(2,"iphone 6s",65000));
        list.add(new Product(3,"sony xperia",25000));
        list.add(new Product(4,"samsung m10s",15000));
        list.add(new Product(1,"redmi4",26000));
        list.add(new Product(1,"lenevo vibe",19000));
        list.stream().filter(p ->p.price>=20000).forEach(x -> {
            System.out.println(x);
        });
        list.stream().filter(p -> p.name.startsWith("s")).forEach(x ->{
        	System.out.println(x);
        });
        System.out.println("max price mobile \n---------------");
        Product maxProduct=list.stream().max((p1,p2)->p1.price>=p2.price?1:-1).get();
        System.out.println(maxProduct);
        System.out.println("first 3 records");
        list.stream().limit(3).forEach(p-> {
        	System.out.println(p);
        });
        System.out.println("after skipping 2 records");
        list.stream().skip(2).forEach(p->{
        	System.out.println(p);
        });
        

        System.out.println("min price mobile \n--------------");
        Product minProduct=list.stream().min((p1,p2)->p1.price>=p2.price?1:-1).get();
        System.out.println(minProduct);
	}

}
