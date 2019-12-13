package com.hcl.spring;

public class HelloImpl implements Hello{
	private String greeting;

	public String sayHello(String name) {
				return greeting+name;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	

}
