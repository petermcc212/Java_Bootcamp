import java.util.Scanner;

public class Main {

private static Scanner scanner = new Scanner(System.in);




    public static void main(String[] args) {

        boolean flag = true;
        int userInput = 0;
        Bank bank = new Bank();
        while(flag){
            switch (userInput){
                case 0:
                    welcomeMenu();
                    // get input from the user
                    userInput = scanner.nextInt();
                    scanner.nextLine();
                    break;
                case 1:
                    bank.initialCase1();
                    userInput = 0;
                    break;
                case 2:
                    bank.getLocalBranchNameFromuser();
                    break;


                    
                    

                case 9:
                    System.out.println("Goodbye");
                    flag = false;
                    break;
            }


        }





    }



    public static void welcomeMenu(){
        System.out.println("Welcome to Peetsays bank. Please select from the options below");
        System.out.println("Press 1 to access master banking features");
        System.out.println("Press 2 to access local branch features");
        System.out.println("Press 3 to access customer features");



    }
}
