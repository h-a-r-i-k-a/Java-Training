package com.hcl.projectc;

import java.io.Serializable;

public class Customer implements Serializable {
    private int CustId;
    private String custName;
    private double annualPremium;
    private double modalPremium;
    private int paymentMode;
    public int getCustId() {
        return CustId;
    }
    public void setCustId(int custId) {
        CustId = custId;
    }
    public String getCustName() {
        return custName;
    }
    public void setCustName(String custName) {
        this.custName = custName;
    }
    public double getAnnualPremium() {
        return annualPremium;
    }
    public void setAnnualPremium(double annualPremium) {
        this.annualPremium = annualPremium;
    }
    public double getModalPremium() {
        return modalPremium;
    }
    public void setModalPremium(double modalPremium) {
        this.modalPremium = modalPremium;
    }
    public int getPaymentMode() {
        return paymentMode;
    }
    public void setPaymentMode(int paymentMode) {
        this.paymentMode = paymentMode;
    }
    @Override
    public String toString() {
        return "Customer [CustId=" + CustId + ", custName=" + custName
                + ", annualPremium=" + annualPremium + ", modalPremium="
                + modalPremium + ", paymentMode=" + paymentMode + "]";
    }
    

}
