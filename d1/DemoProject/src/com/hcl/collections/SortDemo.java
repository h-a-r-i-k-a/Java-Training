package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortDemo {
    public static void main(String[] args) {
        SortedSet s=new TreeSet();
        s.add("teja");
        s.add("niharika");
        s.add("anusha");
        s.add("sowmya");
        s.add("priya");
        for (Object ob : s) {
            System.out.println(ob);
            
        }
    }

}
