package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrStudent {
    public static void main(String[] args) {
        List student=new ArrayList();
        student.add(new Student(1,"niharika","x",67455));
        student.add(new Student(1,"laxmi","y",67455));
        student.add(new  Student(1,"navya","z",67455));
        student.add(new Student(1,"hemanth","v",67455));
        student.add(new Student(1,"deepak","c",67455));
        for (Object ob : student) {
            Student e=(Student)ob;
            System.out.println(e);
        }
            
        }
        

}
