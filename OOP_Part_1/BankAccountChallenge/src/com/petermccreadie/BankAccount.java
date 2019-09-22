package com.petermccreadie;


public class BankAccount {

    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;
    private String accountNumber;


    // creating your own constructor
    public BankAccount(){
        // special use of this
        // calling another constructor within a constructor
        this("56789", 2.50, "Default_user", "test@me.com", "01236376453" );

        System.out.println("Empty constructor called");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        // it's good practice to call the major constructor from other overloaded constructors
        // to fill in default values
        this("99999", 0.00, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // second constructor
    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
       this.balance = balance;
       this.customerName = customerName;
       this.email = email;
       this.phoneNumber = phoneNumber;
       this.accountNumber = accountNumber;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double funds){
        balance += funds;
    }

    public void withdrawal (double funds){
        if((balance - funds)< 0){
            System.out.println("Insufficient funds");
        }else{
            balance -= funds;
            System.out.println("Withdrawl of " + funds + " processed. Remaining balance  = " + balance);
        }


    }








}
