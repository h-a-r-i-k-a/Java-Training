package com.hcl.projectc;

import java.util.List;

public class CustomerBAL {
    static StringBuilder sb=new StringBuilder();
    public boolean addCustomerBal(Customer objCustomer) throws CustomerException{
        boolean isAdded=true;
        if(objCustomer.getCustId()<=0){
            sb.append("cusid cannot be negative or zero \r\n");
            isAdded=false;
        }
        if(objCustomer.getCustName().length()<=5){
            sb.append("name more 5 characters\r\n");
            isAdded=false;
            
        }
        if((objCustomer.getAnnualPremium()<=20000) && (objCustomer.getAnnualPremium()>=100000)){
            sb.append("annual premium exceeded the given range \r\n");
            isAdded=false;
        }
        if((objCustomer.getModalPremium()<=1000) && (objCustomer.getModalPremium()>=50000)){
            sb.append("model premium exceeded the given range \r\n");
            isAdded=false;
        }
        if((objCustomer.getPaymentMode()>=3)){
            sb.append("payment method should be anyone of the above \r\n");
            isAdded=false;
        }
        if(isAdded==false){
            throw new CustomerException(sb.toString());
        }else{
            new CustomerDAO().addCustomerDao(objCustomer);
        }
        return isAdded;
    }
    public List<Customer> showCustomerBal(){
        return new CustomerDAO().showCustomerDao();
    }
    public Customer searchCustomerBal(int CustId){
        return new CustomerDAO().searchCustomerDao(CustId);
        
    }
    public String updateCustomerBal(Customer objCustomer){
        return new CustomerDAO().updateCustomerDao(objCustomer);
    }
    public String deleteCustomerBal(int CustId){
        return new CustomerDAO().deleteCustomerDao(CustId);
    }
    public void writeCustomerFileBal() {
        new CustomerDAO().writeCustomertFileDao();
    }
    
    public void readStudentFileBal() {
        new CustomerDAO().readCustomerFileDao();

}

}
