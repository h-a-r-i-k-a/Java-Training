package com.hcl.cal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("calc.xml");
		Calc c=(CalcImpl)ctx.getBean("bean1");
		System.out.println(c.sum());
		System.out.println(c.sub());
		System.out.println(c.mult());
	}

}
