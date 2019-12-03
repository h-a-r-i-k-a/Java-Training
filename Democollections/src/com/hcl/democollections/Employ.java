package com.hcl.democollections;

public class Employ implements Comparable<Employ> {
  int empno;
  String name;
  String dept;
  String desig;
  double salary;
  /**
   * program for comparable.
   * @param empno parameter.
   * @param name parameter.
   * @param dept parameter.
   * @param desig parameter.
   * @param salary parameter.
   */
  
  public Employ(int empno, String name, String dept, String desig,
            double salary) {
    super();
    this.empno = empno;
    this.name = name;
    this.dept = dept;
    this.desig = desig;
    this.salary = salary;
  }
  
  @Override
    public String toString() {
    return "Employ [empno=" + empno + ", name=" + name + ", dept=" + dept
                + ", desig=" + desig + ", salary=" + salary + "]";
  }
  
  public Employ() {
    super();
  }
  
  @Override
    public int compareTo(Employ e) {
    return this.name.compareTo(e.name);
  }
    
  //sort data default by name-wise
  //create 2 comparators as salary comparator and
  //DeptComparator and sort them and display result.
    

}