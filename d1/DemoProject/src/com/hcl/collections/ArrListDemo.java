package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrListDemo {
    public static void main(String[] args) {
        List names=new ArrayList();
        names.add("harika");
        names.add("gayathri");
        names.add("anusha");
        names.add("mounika");
        names.add("nandu");
        System.out.println("names are ");
        for (Object ob : names) {
            System.out.println(ob);
            
        }
        names.add(2,"priyanka");
        System.out.println("names after adding item");
        for (Object ob : names) {
            System.out.println(ob);
            
        }
        names.set(3, "jana priya");
        System.out.println("names after editing...");
        for (Object ob : names) {
            System.out.println(ob);
            
        }
        names.remove("harika");
        System.out.println("list after removing by index");
        for (Object ob : names) {
            System.out.println(ob);
            
        }
            
        }
        }
    
    


