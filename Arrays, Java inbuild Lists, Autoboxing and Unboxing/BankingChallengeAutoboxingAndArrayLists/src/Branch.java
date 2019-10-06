import java.util.ArrayList;

public class Branch {

    // Branch name
    private String nameOfBranch;
    //Array list of customers
    private static ArrayList<Customer> customers = new ArrayList<>();


    public Branch(String nameOfBranch){
        this.nameOfBranch = nameOfBranch;
    }



    public void addCustomer(String name, Double initialAmount){

    }

    public void printBranch(){
        System.out.println("Printing branch: ");
        System.out.println(nameOfBranch);
    }

    public String getName(){
        return nameOfBranch;
    }

    public static ArrayList<Customer> getCustomers() {
        return customers;
    }

    public static void printCustomersInBranch(){
        for(Customer c: customers){
            System.out.println(c.getName());
        }
    }



}
