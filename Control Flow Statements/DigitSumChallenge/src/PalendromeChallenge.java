import java.util.Arrays;

public class PalendromeChallenge {


    public static boolean isPalindrome (int number){

        if(number< 0){
            number = -number;
        }

        String numberAsString = Integer.toString(number);
        String processedAsString = "";
        int [] numbersAsArray = new int[numberAsString.length()];
        int counter = 0;


        while(number > 0){
            System.out.println(number%10);
            int tempInt = (number%10);
            processedAsString += Integer.toString(tempInt);
            numbersAsArray[counter] = (number%10);
            counter ++;
            number /= 10;
        }



        System.out.println(Arrays.toString(numbersAsArray));
        System.out.println("Processed string" + processedAsString);
        if(numberAsString.equals(processedAsString)){
            System.out.println("They're the same!");
            return true;
        }else{
            return false;
        }
    }
}
