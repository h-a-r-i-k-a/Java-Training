package com.hcl.projectc;

public class CustomerException extends Exception {
    public CustomerException(){
        
    }
    public CustomerException(String error){
        super(error);
    }

}
