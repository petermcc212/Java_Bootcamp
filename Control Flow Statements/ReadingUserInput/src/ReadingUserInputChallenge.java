import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void ReadingFromUser(){
        Scanner scanner = new Scanner (System.in);

        boolean isValid = false;
        int sumOfNumbers = 0;
        int count = 0;
        while(!isValid){
            System.out.println("Enter number #1:  ");

            while (count < 10){
                if(scanner.hasNextInt()){
                    isValid = true;
                    System.out.println("Enter number " + (count + 2) + ": ");
                    sumOfNumbers += scanner.nextInt();
                    count ++;

                }else{
                    System.out.println("Invalid Number");
                    System.out.println("Try again" );
                    isValid = false;
                }
                scanner.nextLine(); // handle end of line (enter key)
            }

        }
        System.out.println("TOTAL = "  + sumOfNumbers);

        scanner.close();

    }




}
