package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DepartmentShow {
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Department");
		List<Department> deptList=q.list();
		for (Department dept : deptList) {
			System.out.println("Deptno "+dept.getDeptno());
			System.out.println("Name "+dept.getDName());
			System.out.println("City "+dept.getCity());
			System.out.println("Location "+dept.getLoc());
			System.out.println("Head "+dept.getHead());
			System.out.println("--------------------");
			
			
			
		}
	}

	}


