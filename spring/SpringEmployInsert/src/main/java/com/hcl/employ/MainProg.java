package com.hcl.employ;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		DataSource datasource=(DriverManagerDataSource)ctx.getBean("dataS.ource");
		JdbcTemplate jt=new JdbcTemplate(datasource);
		String cmd="insert into employ values(?,?,?,?,?)";
		jt.update(cmd,new Object[]{6654,"priyanka","java","programmer",585666});
		System.out.println("*** Record Inserted ***");
		
	}

}