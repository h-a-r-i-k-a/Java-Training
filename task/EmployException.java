package com.hcl.task;

public class EmployException extends Exception {
	
	class InvalidEmailException extends Exception{
	    InvalidEmailException(String error){
	        super(error);
	    }
	}
	public EmployException(){
		
	}
	public  EmployException(String error){
		super(error);
	}

}
