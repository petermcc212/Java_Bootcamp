package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private final String myNumber;
    private  final ArrayList<Contact> myContacts;
    private final static Scanner scanner = new Scanner(System.in);


    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }




    public  void menu(){
        boolean quit = false;
        int choice;
        System.out.println("Welcome to your phone. Please make a selection:");
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0 -> printInstructions();
                case 1 -> addContact();
                case 2 -> deleteContact();
                case 3 -> modifyContact();
                case 4 -> printContacts();
                case 5 -> quit = true;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("Option 0: Print menu ");
        System.out.println("Option 1: Add a contact");
        System.out.println("Option 2: Delete a contact");
        System.out.println("Option 3: Modify a contact");
    }




    public  void addContact(){
        System.out.println("Enter the name of the contact: ");
        String name = scanner.nextLine();
        System.out.println("Enter the number of the contact: ");
        String number = scanner.nextLine();
        myContacts.add(new Contact(name, number));
    }

    public  void deleteContact(){
        System.out.println("Enter the contacts name you wish to delete");
        String name = scanner.nextLine();
        boolean isPresent = false;
        String confirmation;
        int contactPosition = 0;
        for(Contact c: myContacts){
            if(c.getName().equals(name)){
                isPresent = true;
                contactPosition = myContacts.indexOf(c);
                System.out.println("Contact position: " + contactPosition);
                System.out.println("Deleting contact: " + c.getName() + " with number: " + c.getPhoneNumber());
            }
        }
        if(isPresent){
            System.out.println("Are you sure? y or n");
            confirmation = scanner.nextLine();
            if(confirmation.equals("y")){
                myContacts.remove(contactPosition);
                System.out.println("Removed");
            }else{
                System.out.println("Exiting...");
            }
        }
    }

    private  void modifyContact(){
        printContacts();
        System.out.println("Enter the name of the contact to modify");
        String name = scanner.nextLine();
        String modifiedName;
        String modifiedNumber;
        int contactIndex = 0;
        for (Contact c: myContacts){
            if(c.getName().equals(name)){
                contactIndex = myContacts.indexOf(c);
                System.out.println("Name: " + c.getName() + "Number: " + c.getPhoneNumber());
            }
        }
        System.out.println("Enter new name: ");
        modifiedName = scanner.nextLine();
        System.out.println("Enter new number: ");
        modifiedNumber = scanner.nextLine();
        // check to ensure empty values aren't saved
        if(modifiedName.equals("")) { modifiedName = name;}
        if(modifiedNumber.equals("")) { modifiedNumber = name;}

        myContacts.remove(contactIndex);
        myContacts.add(new Contact(modifiedName, modifiedNumber));
        System.out.println("Modified!");
    }


    public  void printContacts(){
        for (Contact c: myContacts){
            System.out.println("Name " + c.getName());
            System.out.println("Number: " + c.getPhoneNumber());
        }
    }

    public String getMyNumber(){
        return myNumber;
    }




}
