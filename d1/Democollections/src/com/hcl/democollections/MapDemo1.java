package com.hcl.democollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo1 {
    /**
     * program for map.
     * @param args passed as arguments.
     */
  public static void main(String[] args) {
    Map names=new HashMap();
    names.put("1", "harika");
    names.put("2", "mounika");
    names.put("3", "laxmi");
    names.put("4", "hemanth");
    names.put("5", "sai");
    String key,value;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter key ");
    key=sc.nextLine();
    value=(String)names.getOrDefault(key, "not found");
        System.out.println(value);
        
    }

}
