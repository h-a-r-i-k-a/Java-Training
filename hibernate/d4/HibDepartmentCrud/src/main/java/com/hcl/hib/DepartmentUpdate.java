package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DepartmentUpdate {
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		int Deptno=1;
		Query q=s.createQuery("from Department where Deptno="+Deptno);
		List<Department> lstDepartment=q.list();
		Department res=lstDepartment.get(0);
		Transaction t=s.beginTransaction();
		res.setDname("Ram Murty");
		res.setCity("chennai");
		res.setLoc("ambattur");
		res.setHead("harika");
		s.update(res);
		t.commit();
		System.out.println("department updated");
	
	}

}
