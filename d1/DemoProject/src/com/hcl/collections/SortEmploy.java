package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
    public static void main(String[] args) {
        Comparator c=new NameComparator();
        SortedSet s=new TreeSet(c);
        s.add(new Employ(1,"niharika",67455));
        s.add(new Employ(1,"laxmi",67455));
        s.add(new Employ(1,"navya",67455));
        s.add(new Employ(1,"hemanth",67455));
        s.add(new Employ(1,"deepak",67455));
        for (Object object : s) {
            Employ e=(Employ)object;
            System.out.println(e);
            
        }
    }

}
