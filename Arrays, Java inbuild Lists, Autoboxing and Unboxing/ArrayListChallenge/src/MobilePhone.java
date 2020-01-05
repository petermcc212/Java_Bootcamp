import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private static Scanner scanner = new Scanner(System.in);
    

    // Phone book array list creation
    private static ArrayList<Contact> contactList = new ArrayList<Contact>();



    // Welcome menu which will be looped to the user until the user quits the applicaiton
    public static void welcomeMenu(){
        System.out.println("Welcome to the Nokia 3210 ");
        System.out.println("Please select one of the following options: ");
        System.out.println("1 - Search contacts");
        System.out.println("2 - To view all contacts");
        System.out.println("3 - To add a contact");
        System.out.println("4 - To remove a contact");
        System.out.println("5 - To update an contact");
        System.out.println("6 - To quit");


    }

    // Option 1 - search the contacts

    public static void searchContacts(){
        // only able to search for contact by name. Not by phone number
        System.out.println("Enter a name and I'll search your address book:");
        // get a name from the user
        String name = scanner.nextLine();

        for(Contact c : contactList){
            if(c.getName().equals(name)){
                System.out.println("Found name");
                System.out.print("Name: " + c.getName());
                System.out.print("Phone number: " + c.getPhoneNumber());
                System.out.println("\n \n \n");
            }else{
                System.out.println("Name not found");
                System.out.println("\n \n \n");
            }
        }

    }


    // Option 2 - view  all contacts
    private static void viewPhoneBook(){

        if(contactList.isEmpty()){
            System.out.println("Your contact book is empty");


        }else{
            System.out.println("Here's a list of all your contacts: \n");
            contactList.toString();
            System.out.println("\n \n \n");
        }

    }

    // Option 3 - add a contact

    private static void addContact(){
        System.out.println("Enter the name of the new contact: ");
        String name= scanner.nextLine();
        // check to see if the phone book already contains a contact by that name:
        System.out.println("Enter the phone number of the new contact: ");
        String phoneNumber = scanner.nextLine();
        contactList.add(new Contact(name, phoneNumber));

        System.out.println("Contact added \n" + name + "\t" + phoneNumber );
        System.out.println("\n \n \n");

    }


    // Option 4 - delete a contact

    private static void removeContact(){
        System.out.println("Enter the name of the contact you'd like to remove: ");
        String name = scanner.nextLine();
        for (Contact c: contactList){
            if(c.getName().equals(name)){
                contactList.remove(c);
                System.out.println(name + " was deleted from your phone book.");
                System.out.println("\n \n \n");
                break;
            }else{
                System.out.println("Sorry, couldn't find that contact");
                System.out.println("\n \n \n");
            }

        }
    }

    // Option 5 - Update a contact

    private static void updateContact(){
        System.out.println("Type in the name of the contact you'd like edit: ");
        String name = scanner.nextLine();

        for(Contact c: contactList){
            if(c.getName().equals( name)){
                System.out.println("Would you like th change the name or number? Type name or number");
                String userInput = scanner.nextLine();
                userInput = userInput.toLowerCase();
                if(userInput.equals("name")){
                    System.out.println("Enter the new name");
                    String newName = scanner.nextLine();
                    c.changeName(newName);
                }else if (userInput.equals("number")){
                    System.out.println("Enter the new number: ");
                    String newNumber = scanner.nextLine();
                    c.changeNumber(newNumber);

                }else{
                    System.out.println("Unrecognised input. Please try again.");
                }



            }else{
                System.out.println("Sorry, couldn't find that name");
            }
        }
    }

    public static void main(String[] args) {

        boolean flag = true;

        // add test to contacts
        contactList.add(new Contact("Peter", "1005011"));



        while(flag){
            welcomeMenu();
            // get user input
            int userOption = scanner.nextInt();
            scanner.nextLine();

            switch (userOption){

                case 0:
                    System.out.println("\n");
                    welcomeMenu();
                    System.out.println("\n");
                    break;
                case 1:
                    while(userOption ==1 ){
                        searchContacts();
                        userOption = 0;
                    }break;
                case 2:
                    while(userOption == 2){
                        viewPhoneBook();
                        userOption = 0;
                    }break;
                case 3:
                    while(userOption == 3){
                        addContact();
                        userOption = 0;
                    }break;
                case 4:
                    while(userOption == 4){
                        removeContact();
                        userOption = 0;
                    }break;
                case 5:
                    while(userOption == 5){
                        updateContact();
                        userOption = 0;
                    }break;

                case 6:
                    System.out.println("Phonebook shutting down...");
                    flag = false;
                    userOption = 0;
                    break;
                default:
                    System.out.println("Hit the default");
                    userOption = 0;
                    break;
            }

        }
        scanner.close();


    }





}
