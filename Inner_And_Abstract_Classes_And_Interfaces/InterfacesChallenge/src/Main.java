import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        Player peter = new Player("Peter", 10, 15);
//        System.out.println(peter.toString());
//        saveObject(peter);
//
//        peter.setHighScore(20);
//        System.out.println(peter);
//        peter.setWeapon("Stormbringer");
//        saveObject(peter);
//        loadObject(peter);
//        System.out.println(peter);

//        Monster theBigYin = new Monster("Hairy Sally", 100, "Hairy legs");
//        System.out.println(theBigYin.toString());
//        saveObject(theBigYin);
//
//        theBigYin.setHeight(99);
//        System.out.println(theBigYin);
//        theBigYin.setMonsterName("Scary Mary");
//
//        saveObject(theBigYin);
//        loadObject(theBigYin);
//        System.out.println(theBigYin);

        ISavable theEvenBiggerYin = new Monster("Tina turner", 100, "Bangin voice");

        // You have to cast Monster to get to the methods through the interface because you've instantiated
        // ISavable object NOT a Monster object
        System.out.println(((Monster) theEvenBiggerYin).getMonsterName());
        System.out.println(((Monster)theEvenBiggerYin).getMostScaryAttribute());












    }


    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }



    public static void saveObject(ISavable objectToSave){
        for(int i = 0; i< objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadObject(ISavable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

}