public class Challenge {


    public static int sumDigits (int number){
        if(number <10){
            return -1;
        }
        int sumOfNumbers = 0;
        while(number > 0){
            System.out.println((number % 10));
            sumOfNumbers += (number % 10);
            number = number / 10;


        }
        System.out.println("The sum of the numbers is " + sumOfNumbers);
        return sumOfNumbers;
    }
}
