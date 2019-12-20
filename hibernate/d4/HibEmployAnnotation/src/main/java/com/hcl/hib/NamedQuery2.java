package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class NamedQuery2 {
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query query=s.getNamedQuery("findEmploy").setInteger("empno", 6);
		List<Employ> lstEmploy=query.list();
		Employ e=lstEmploy.get(0);
		
			System.out.println("Empno "+e.getEmpno());
			System.out.println("Name "+e.getName());
			System.out.println("Department "+e.getDept());
			System.out.println("Designation "+e.getDesig());
			System.out.println("Basic "+e.getBasic());
			System.out.println("--------------------");
							
		}
	}


