package com.hcl.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DepartmentInsert {
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Department dept=new Department();
		dept.setDeptno(55);
		dept.setDname("java");
		dept.setCity("chennai");
		dept.setLoc("blue lotus");
		dept.setHead("prasanna");
		s.save(dept);
		t.commit();
		System.out.println("Record Inserted....");
	}

	}

