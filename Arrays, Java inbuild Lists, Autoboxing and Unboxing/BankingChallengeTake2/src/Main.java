public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Nationwide");

        bank.addBranch("Cumbernauld");

//        bank.addCustomer("Cumbernauld", "Peter", 50.05);
        bank.addCustomer("Cumbernauld", "Percy", 123.32);
        bank.addCustomer("Cumbernauld", "Tony", 150.32);
        bank.addCustomer("Cumbernauld", "Stevie", 150.32);


        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelade", "Percy", 44.22);
        bank.addCustomerTransaction("Adelade", "Steven", 12.44);
        bank.addCustomerTransaction("Adelade", "Steven", 44.22);


        bank.listCustomers("Cumbernauld", true);


    }

}
