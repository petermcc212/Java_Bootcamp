import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        Customer customer = new Customer("Time", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("balance for customer " + customer.getName()
        + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        for(int i = 0; i<intList.size(); i++){
            System.out.println();
        }


    }


}
