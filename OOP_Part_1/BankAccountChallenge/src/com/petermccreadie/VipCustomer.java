package com.petermccreadie;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public VipCustomer(){
        this.name = "Default Name";
        this.creditLimit = 20.00;
        this.emailAddress = "default@me.com";

    }

    public VipCustomer(String name, String emailAddress){
        this.name = name;
        this.emailAddress = emailAddress;
        creditLimit = 50.00;

    }

    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name= name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }


}

