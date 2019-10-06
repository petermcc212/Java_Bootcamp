import java.util.ArrayList;
import java.util.Scanner;

public class Bank {


    // Array list of branches
    private static ArrayList<Branch> branches = new ArrayList<Branch>();
    // userInputScanner
    Scanner scanner = new Scanner(System.in);



    public Bank(){

    }

    public void initialCase1(){
        welcomeToBankFeatures();
    }



    public void welcomeToBankFeatures(){

        String fromUser = "";

        boolean bankingFlag = true;
        while (bankingFlag){
            System.out.println("You have accessed master banking features");
            System.out.println("Type 'a' to add a new branch");
            System.out.println("Type 'b' to add a customer to an existing branch");
            System.out.println("Type 'c' to add a transaction for an existing customer");
            System.out.println("Type 'd' to view all branches");
            System.out.println("Type 'back' to exit");

            // get input from the user
            fromUser = scanner.nextLine();

            if(fromUser.equals("a")){
                boolean addMore = true;
                while(addMore){
                    // create a new branch
                    System.out.println("Enter the name of the new branch");
                    String branchName = scanner.nextLine();
                    addBranch(branchName);
                    System.out.println("Add customers to branch?");
                    boolean addMoreCustomers;
                    if(scanner.nextLine().equals("y")){
                        addMoreCustomers = true;
                    }else{
                        addMoreCustomers = false;
                        addMore = false;
                    }
                    while(addMoreCustomers){
                        System.out.println("What's the name? ");
                        String customerName = scanner.nextLine();
                        System.out.println("What's the initial deposit? ");
                        Double initialDeposit = scanner.nextDouble();
                        scanner.nextLine();
                        addCustomerToExistingBranch(branchName, customerName, initialDeposit);
                        System.out.println("Exit?");
                        if(scanner.nextLine().equals("y")){
                            addMoreCustomers = false;
                            addMore = false;
                        }

                    }

                }
                break;

            }else if (fromUser.equals("b")){
                // Add a customer to an existing branch
                boolean addMoreCustomers = true;
                System.out.println("Add customer to existing branch");
                System.out.println("Enter the name of the existing branch");
                String chosenBranch = scanner.nextLine();
                System.out.println("Enter the name of the customer");
                String customerName = scanner.nextLine();
                while(addMoreCustomers){
                    System.out.println("Enter the amount: ");
                    Double customerDeposit = scanner.nextDouble();
                    addCustomerToExistingBranch(chosenBranch, customerName, customerDeposit);
                    scanner.nextLine();
                    System.out.println("Enter another?");{
                        if(scanner.nextLine().equals("n")){
                            addMoreCustomers = false;
                        }
                    }
                }

                break;

            }else if(fromUser.equals("c")){
                // Add transaction for existing customer
                boolean addMoreTransactions = true;
                System.out.println("Enter the name of the branch");
                String nameOfBranch = scanner.nextLine();
                System.out.println("Enter the name of the customer");
                String nameOfCustomer = scanner.nextLine();
                while(addMoreTransactions){
                    System.out.println("Enter the amount to deposit: ");
                    Double deposit = scanner.nextDouble();
                    scanner.nextLine();
                    addTransactionForExistingCustomer(nameOfBranch, nameOfCustomer, deposit);
                    System.out.println("Add more?");{
                        if(!scanner.nextLine().equals("y")){
                            addMoreTransactions = false;
                        }
                    }

                }

            }else if(fromUser.equals("d")){
                for (Branch b: branches){
                    b.printBranch();
                }

            }else{
                System.out.println("Back to main menu");
                bankingFlag = false;
                break;

            }
        }


    }


    public void addBranch(String name){
        Branch branch = new Branch(name);
        branches.add(branch);
    }


    public void addCustomerToExistingBranch(String branchName, String name, Double initialDeposit){
        for(Branch b: branches){
            if(b.getName().equals(branchName)){
                b.addCustomer(name, initialDeposit);
            }else{
                System.out.println("Sorry, branch not found");
            }
        }
    }

    public boolean doesTheBranchEvenExist(String nameOfBranch){
        for (Branch b: branches){
            if(b.getName().equals(nameOfBranch)){
                return true;
            }
        }
        return false;
    }

    public void addTransactionForExistingCustomer(String branchName, String customerName, Double transactionAmount){
        // check if the branch exits
        if(doesTheBranchEvenExist(branchName)){
            addCustomerToExistingBranch(branchName, customerName, transactionAmount);
        }else{
            System.out.println("Couldn't find the branch");
        }

    }

    public void localBankFeaturesMenu(){

        System.out.println("Please select one of the options below");
        System.out.println("Press 1 to add a new customer to an existing branch");
        System.out.println("Press 2 to add additional transactions for a customer at this branch");
        System.out.println("Press 3 to list all customers at this branch");

    }

    public void getLocalBranchNameFromuser(){
        System.out.println("Welcome to the local bank features menu");
        System.out.println("Please enter the name of your branch:");
        String branchName = scanner.nextLine();
        if(doesTheBranchEvenExist(branchName)){
            localBankFeaturesMenu();
            String userInput = scanner.nextLine();
            if(userInput.equals("1")){
                System.out.println("What's the name");
                String customerName = scanner.nextLine();
                System.out.println("What's the amount?");
                Double customerAmount = scanner.nextDouble();
                addCustomerToExistingBranch(branchName, customerName, customerAmount);
            }else if(userInput.equals("3")){
                listAllCustomersInBranch(branchName);
            }

        }
    }

    public void listAllCustomersInBranch(String branchName){

        for(Branch b: branches){
            if(branchName.equals(b.getName())){
                Branch.printCustomersInBranch();
            }
        }


    }



}
