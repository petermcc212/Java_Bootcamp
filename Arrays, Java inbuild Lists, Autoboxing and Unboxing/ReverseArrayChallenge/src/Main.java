import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] test = {1,2,3,4,5,6,7,8,9};
        System.out.println("The entered array is: " + Arrays.toString(test));
        System.out.println("That array backwards is " + Arrays.toString(reverse(test)));
        







    }



    public static int [] reverse(int [] array ){

        int[] reversedArray = new int[array.length];

        for(int i = 0; i< array.length; i++){
            reversedArray[array.length-i -1] = array[i];
        }

        return reversedArray;
    }
}
