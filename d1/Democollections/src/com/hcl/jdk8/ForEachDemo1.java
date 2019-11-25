package com.hcl.jdk8;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo1 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<String>();
        names.add("sowmya");
        names.add("sai");
        names.add("teja");
        names.add("navya");
        for (String string : names) {
            System.out.println(string);
            
        }
        List<Integer> num=new ArrayList<Integer>();
        num.add(new Integer(67));
        num.add(new Integer(11));
        num.add(new Integer(79));
        num.add(new Integer(55));
        num.add(new Integer(11));
        for (Integer integer : num) {
            System.out.println(integer);
            
        }
        
        
        
        
    }

}
