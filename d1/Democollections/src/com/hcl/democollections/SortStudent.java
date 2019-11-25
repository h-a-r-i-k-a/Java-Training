package com.hcl.democollections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortStudent {
    public static void main(String[] args) {
        SortedSet<Student> students=new TreeSet<Student>();
        students.add(new Student(1,"sowmya","nellore",7.5));
        students.add(new Student(3,"harika","nellore",7.95));
        students.add(new Student(4,"bharat","chennai",9.4));
        students.add(new Student(5,"deepak","delhi",9.2));
        students.add(new Student(6,"sam","hyd",8.2));
        for (Student student : students) {
            System.out.println(student);
            
        }
        
    }

}
