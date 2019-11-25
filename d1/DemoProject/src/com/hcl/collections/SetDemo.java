package com.hcl.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set s=new HashSet();
        s.add("niharika");
        s.add("gayathri");
        s.add("hemanth");
        s.add("sandeep");
        s.add("niharika");
        s.add("gayathri");
        s.add("hemanth");
        s.add("sandeep");
        s.add("niharika");
        s.add("gayathri");
        s.add("hemanth");
        s.add("sandeep");
        for (Object ob : s) {
            System.out.println(ob);
            
        }
    }

}
