package com.hcl.democollections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Double> m=new Hashtable<String,Double>();
        m.put("poornesh", 67745.54);
        m.put("priyanka", 77554.45);
        m.put("priya", 88555.78);
        m.put("bharat", 77455.44);
        String key;
        double sal;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter key");
        key=sc.nextLine();
        sal=m.getOrDefault(key, 0.0);
        System.out.println("salary is"+sal);
    }

}
