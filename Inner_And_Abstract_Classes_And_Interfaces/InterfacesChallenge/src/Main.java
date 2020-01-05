import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player peter = new Player("Peter", 10, 15);
        System.out.println(peter.toString());
        saveObject(peter);

        peter.setHitPoints(8);
        System.out.println(peter);
        peter.setWeapon("Stormbringer");
        saveObject(peter);
//        loadObject(peter);
        System.out.println(peter);


        ISavable werewolf = new Monster("werefolf", 20, 40);
        // to access methods in Monster, we need to cast the interface werewolf as a Monster
        System.out.println("Strength = " + ((Monster) werewolf).getStrength());
        System.out.println(werewolf);
        saveObject(werewolf);

//        NOTE:
//        If you want to create a variable which may have multiple types, declare the interface as the type
//        If you want to access methods from an object, declare the variable as the object rather than the interface.
//        If you want to get around this, you'll need to cast as the object.

    }



    // simulates getting values from a file

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
        for(int i = 0; i<objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadObject(ISavable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }



}
