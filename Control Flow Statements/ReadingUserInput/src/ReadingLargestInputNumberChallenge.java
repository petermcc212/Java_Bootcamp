import java.util.Scanner;

public class ReadingLargestInputNumberChallenge {



    public static void readingLargest (){

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        int minimumNumber = 0;
        int maximumNumber = 0;
        boolean first = true;

        while(true){
            int order = counter + 1;
            System.out.println("Enter number #" + order + ": ");

            boolean isValid = scanner.hasNextInt();
            if(isValid){
                int number = scanner.nextInt();
                // use a flat to run some code ONLY when loop runs for the first time
                if(first){
                    first = false;
                    minimumNumber = number;
                    maximumNumber = number;
                }
                if(number > maximumNumber){
                    maximumNumber = number;
                }
                if(number < minimumNumber){
                    minimumNumber = number;
                }
                counter ++;
                sum += number;
                if(counter == 10){
                    break;
                }

            }else{
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // clear the end of line character
        }
        System.out.println("Sum = " + sum);
        System.out.println("Maximum = " + maximumNumber);
        System.out.println("Minimum = " + minimumNumber);
        scanner.close();

    }


}
