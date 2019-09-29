package com.petermccreadie;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;

            }
        }


    }


    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());


        // Copy array list to another array list
        ArrayList<String > nextArray = new ArrayList<>(groceryList.getGroceryList());


        // Copy array list to an array
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);

    }



    public static void printInstructions(){
        System.out.println("\n Press ");
        System.out.println("\n 0 - To print choice options.  ");
        System.out.println("\n 1 - To print the list of grocery items  ");
        System.out.println("\n 2 - To add an item to the list  ");
        System.out.println("\n 3 - To modify an item on the list  ");
        System.out.println("\n 4 - To remove an item from the list  ");
        System.out.println("\n 5 - To search for an item on the list ");
        System.out.println("\n 6 - Copy array list ");
        System.out.println("\n 7 - To quit the application ");

    }


    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter item name");
        String itemNumber = scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNumber, newItem);

    }

    public static void removeItem(){
        System.out.println("Enter the name of the item you wish to remove: ");
        String itemToRemove = scanner.nextLine();
        groceryList.removeGroceryItem(itemToRemove);
        System.out.println("Item has been removed");

    }

    public static void searchForItem(){
        System.out.println("Enter the item you wish to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in our grocery list ");
        }else{
            System.out.println(searchItem + " is not in the shopping list");
        }

    }

}
