package com.hcl.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteStudent {
    public static void main(String[] args) {
        Student student=new Student(1,"harika","maddela",66.5);
        try {
            FileOutputStream fout=new FileOutputStream("c:/files/student.txt");
           ObjectOutputStream objout=new ObjectOutputStream(fout);
           objout.writeObject(student);
           objout.close();
           fout.close();
           System.out.println("student  object stored successfully...");
           
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    }



