package com.hcl.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Foutput {
	public static void main(String[] args) {
		try {
			FileInputStream src=new FileInputStream("C:/java_hcl/harika/d1/DemoProject/src/com/hcl/files/FileRead.java");
			FileOutputStream tar=new FileOutputStream("c:/files/cpy.txt");
			int ch;
			while((ch=src.read())!=-1){
				tar.write((char)ch);	
			}
			src.close();
			tar.close();
			System.out.println("*** file copied ***");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
