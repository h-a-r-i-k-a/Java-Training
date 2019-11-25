package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrEmploy {
    public static void main(String[] args) {
        List employ=new ArrayList();
        employ.add(new Employ(1,"niharika",67455));
        employ.add(new Employ(1,"laxmi",67455));
        employ.add(new Employ(1,"navya",67455));
        employ.add(new Employ(1,"hemanth",67455));
        employ.add(new Employ(1,"deepak",67455));
        for (Object ob : employ) {
            Employ e=(Employ)ob;
            System.out.println(e);
        }
            
        }
        
    }


