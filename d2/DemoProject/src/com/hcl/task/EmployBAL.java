package com.hcl.task;

import java.util.List;

public class EmployBAL {
	static StringBuilder sb=new StringBuilder();
	public boolean addEmployBal(Employ objEmploy){
		boolean isAdded=true;
		if(objEmploy.getEmpId()<=0){
			System.out.println("employId should not be negative\r\n ");
			isAdded=false;
		}
		if(objEmploy.getEmpName().length()<=5){
            sb.append("name more 5 characters\r\n");
            isAdded=false;
	}
		if(objEmploy.getEmpDepartment().length()<=5){
            sb.append("department more 5 characters\r\n");
            isAdded=false;
		}
		if(objEmploy.getEmpPhone().length()>10){
            sb.append("Invalid phone number\r\n");
            isAdded=false;
		}
		return isAdded;
	}
	
    
    public List<Employ> showEmployBal(){
        return new EmployDAO().showEmployDao();
    }
    public Employ searchEmployBal(int EmpId){
        return new EmployDAO().searchEmployDao(EmpId);
        
    }
 
    public void writeEmployFileBal() {
        new EmployDAO().writeEmployFileDao();
    }
    
    public void readEmployFileBal() {
        new EmployDAO().readEmployFileDao();

}
    }
	
	



