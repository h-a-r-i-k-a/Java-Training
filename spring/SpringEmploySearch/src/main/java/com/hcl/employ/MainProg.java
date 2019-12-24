package com.hcl.employ;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource datasource=(DriverManagerDataSource)ctx.getBean("dataSource");
		JdbcTemplate jt=new JdbcTemplate(datasource);
		String cmd="select * from Employ where empno=?";
		jt.update(cmd,new Object[]{1});
		System.out.println("*** Record Inserted ***");
		
	}

}