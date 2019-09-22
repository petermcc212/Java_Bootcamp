import java.util.Scanner;

public class ReadingInput {

    public static void ReadingInputFromUser(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: " );
        // checks to see if the next input is a number
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();
            // this line is required to handle next line character (enter key)
            scanner.nextLine();

            System.out.println("Enter your name: " );
            String name = scanner.nextLine();
            int age = 2019 - yearOfBirth;
            if(age >= 0 && age <= 100){
                System.out.println("Your name is: " + name + ", and you are " + age + " years old.");
            }else{
                System.out.println("Invalid year of birth");
            }
        }else{
            System.out.println("Unable to parse year of birth.");
        }

        scanner.close();
    }


}
