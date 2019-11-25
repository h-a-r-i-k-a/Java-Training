package com.hcl.jdk8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employ {
	int empno;
	String name;
	String dept;
	String desig;
	double basic;
	public Employ(int empno, String name, String dept, String desig, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.dept = dept;
		this.desig = desig;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", dept=" + dept + ", desig=" + desig + ", basic=" + basic
				+ "]";
	}
	public static void main(String[] args) {
		List<Employ> list=new ArrayList<Employ>();
		list.add(new Employ(1,"harika","java","SE",40000));
		list.add(new Employ(2,"mounika","java","SE",80000));
		list.add(new Employ(3,"anusha","dbms","SE",50000));
		list.add(new Employ(4,"gayathri","ds","SE",60900));
		list.add(new Employ(5,".net","jdbc","SE",50000));
		list.stream().filter(p->p.dept=="java").forEach(x-> {
			System.out.println(x);
		});
		list.stream().filter(p->p.basic>50000).forEach(x->{
			System.out.println(x);
		});
		System.out.println("max basic record---------\n");
		Employ maxBasic=list.stream().max((p1,p2)->p1.basic>=p2.basic?1:-1).get();
		System.out.println(maxBasic);
		System.out.println("first 3 records");
		list.stream().limit(3).forEach(p->{
			System.out.println(p);
		});
		
		
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
			
		});
		System.out.println("after skipping two records");
		Collections.sort(list,(p1,p2)->{
			return (int)(p2.basic-p1.basic);
		});
		list.stream().skip(2).forEach(p->{
			System.out.println(p);
		});
		System.out.println("min basic record---------\n");
		Employ minBasic=list.stream().min((p1,p2)->p1.basic>=p2.basic?1:-1).get();
		System.out.println(minBasic);
	}

}
