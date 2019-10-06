import java.util.ArrayList;

public class Customer {

    private String name;
    // Array list of transactions as doubles
    private static ArrayList<Double> customerTransactions = new ArrayList<Double>();




    public Customer(String name, Double openingAmount){


    }

    public String getName(){
        return name;
    }


    public void depositMoney(Double moneyDeposited){
        customerTransactions.add(moneyDeposited);

    }









}
