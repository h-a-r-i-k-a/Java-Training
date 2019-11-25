package com.hcl.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FInput {
	public static void main(String[] args) {
		
		try {
			FileInputStream fin=new FileInputStream("C:/java_hcl/harika/d1/DemoProject/src/com/hcl/files/FileRead.java");
			int ch;
			while((ch=fin.read())!=-1){
				System.out.println((char)ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
	}

}
