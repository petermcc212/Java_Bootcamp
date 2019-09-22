package com.petermccreadie;

public class Main {

    public static void main(String[] args) {

        // you have to initialise your new object!
//        Car porsche = new Car();
//        Car skoda = new Car();
//        porsche.setModel("911");
//        System.out.println("Model is " + porsche.getModel());


//        BankAccount petersAccount = new BankAccount();
//        petersAccount.setAccountNumber("1005011");
//        petersAccount.setBalance(100.00);
//        petersAccount.setCustomerName("Peter McCreadie");
//        petersAccount.setEmail("pm@petermccreadie.com");
//        petersAccount.setPhoneNumber("07917450638");

        BankAccount petersSavings = new BankAccount(
                "10050",
                100.00,
                "Peter McCreadie",
                "pm@petermccreadie.com",
                "08006353425" );

//        System.out.println(petersSavings.getAccountNumber());
//        System.out.println(petersSavings.getBalance());
//        System.out.println(petersSavings.getCustomerName());
//        System.out.println(petersSavings.getEmail());
//        System.out.println(petersSavings.getPhoneNumber());
//        petersSavings.deposit(100.00);
//        System.out.println(petersSavings.getBalance());
//        petersSavings.withdrawal(150.00);
//        System.out.println(petersSavings.getBalance());
//
//        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "12345");
//        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());

//        VipCustomer peetsay = new VipCustomer();
//        System.out.println(peetsay.getCreditLimit());
//        System.out.println(peetsay.getEmailAddress());
//        System.out.println(peetsay.getName());
//
//        VipCustomer pedro = new VipCustomer("Pedro", "test@mail.com");
//        System.out.println(pedro.getCreditLimit());
//        System.out.println(pedro.getEmailAddress());
//        System.out.println(pedro.getName());
//
//
//        VipCustomer piper = new VipCustomer("Piper", 1000.00, "yaas@me.com");
//        System.out.println(piper.getCreditLimit());
//        System.out.println(piper.getEmailAddress());
//        System.out.println(piper.getName());
//
//        Point p = new Point();
//        System.out.println(p.distance(-1,-1));



        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total = " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total = " + calculator.getTotalCost());


    }
}
