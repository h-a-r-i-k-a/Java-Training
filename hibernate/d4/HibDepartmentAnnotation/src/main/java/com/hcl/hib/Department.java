package com.hcl.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="Department")
public class Department {
	private int Deptno;
	private String Dname,City,Loc,Head;
	@Id
	@Column(name="Deptno")
	public int getDeptno() {
		return Deptno;
	}
	public void setDeptno(int Deptno) {
		this.Deptno = Deptno;
	}
	@Column(name="head")
	public String getHead() {
		return Head;
	}
	public void setHead(String Head) {
		this.Head = Head;
	}
	@Column(name="City")
	public String getCity() {
		return City;
	}
	public void setCity(String City) {
		this.City = City;
	}
	@Column(name="Dname")
	public String getDName() {
		return Dname;
	}
	public void setDName(String Dname) {
		this.Dname = Dname;
	}
	@Column(name="Loc")
	public String getLoc() {
		return Loc;
	}
	public void setLoc(String Loc) {
		this.Loc = Loc;
	}
	
	}
