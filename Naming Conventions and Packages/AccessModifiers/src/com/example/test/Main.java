package com.example.test;

public class Main {

    public static void main(String[] args) {
	Account petersAccount = new Account("Peter");
	petersAccount.deposit(1000);
	petersAccount.withdraw(500);
	petersAccount.withdraw(-200);
	petersAccount.deposit(-20);
	petersAccount.calculateBalance();

        System.out.println("Balance on account is " + petersAccount.getBalance());
        petersAccount.calculateBalance();
    }
}
