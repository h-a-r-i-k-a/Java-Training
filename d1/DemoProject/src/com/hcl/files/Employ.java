package com.hcl.files;

import java.io.Serializable;

public class Employ implements Serializable {
  int empno;
  String name;
  double basic;
  
  public Employ(int empno, String name, double basic) {
      /**
       * passing employ values.
       */
        super();
        this.empno = empno;
        this.name = name;
        this.basic = basic;
    }
    public String toString() {
        return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic
                + "]";
    }
    

}