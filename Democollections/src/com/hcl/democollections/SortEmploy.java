package com.hcl.democollections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
    public static void main(String[] args) {
        SortedSet<Employ> employ=new TreeSet<Employ>();
        employ.add(new Employ(1,"harika","cse","software engineer",50000));
        employ.add(new Employ(2,"gayathri","ece","software engineer",40000));
        employ.add(new Employ(3,"anusha","civil","software engineer",60000));
        employ.add(new Employ(4,"mounika","cse","software engineer",70000));
        employ.add(new Employ(5,"nanditha","mech","software engineer",80000));
        for (Employ employ2 : employ) {
            System.out.println(employ);
            
        }
        
        
    }

}
