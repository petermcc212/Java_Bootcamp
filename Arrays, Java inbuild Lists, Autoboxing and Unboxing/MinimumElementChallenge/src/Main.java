import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter count: " );
        int count = s.nextInt();
        s.nextLine();
        System.out.println("You have chosen: " + count);
        int[] returnedArray = readIntegers(count);

        System.out.println("Min value = " + findMinimumValue(returnedArray));


    }



    public static int[] readIntegers(int count ){
        System.out.println("Please enter " + count + " integers");
        int[] array = new int[count];
        for(int i = 0; i< array.length; i++){
            array[i] = s.nextInt();
        }

        System.out.println("Integers as array: ");
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int findMinimumValue (int[] array){
        int minimumValue = Integer.MAX_VALUE;

        for(int i = 0; i< array.length; i++){
            if(array[i] < minimumValue){
                minimumValue = array[i];
            }
        }
//        System.out.println("The minimum value is " + minimumValue);
        return minimumValue;
    }

}
