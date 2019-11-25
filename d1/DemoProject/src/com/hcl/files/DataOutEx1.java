package com.hcl.files;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutEx1 {
  /**
     * program for creating file.
     * @param args used to pass arguments.
     */
  public static void main(String[] args) {
    try {
      FileOutputStream fout = new FileOutputStream("c:/files/d1.txt");
      DataOutputStream dout = new DataOutputStream(fout);
      dout.writeInt(67);
      dout.writeInt(56);
      dout.close();
      fout.close();
      System.out.println("file created");
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
