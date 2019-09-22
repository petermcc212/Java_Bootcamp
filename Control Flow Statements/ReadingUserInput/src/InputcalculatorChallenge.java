import java.util.Scanner;

public class InputcalculatorChallenge {





    public static void inputThenPrintSumAndAverage () {

        Scanner scanner = new Scanner(System.in);

        // set up local variables

        int sum = 0;
        int count = 0;
        int average = 0;


        while(true){
            System.out.println("Enter a number: " );
            boolean isValid = scanner.hasNextInt();

            if(isValid){
                sum += scanner.nextInt();
                count ++;
            }else{
                if(count != 0){
                    average = (sum / count);
                }
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;

            }
            scanner.nextLine();

        }
        scanner.close();
    }
}
