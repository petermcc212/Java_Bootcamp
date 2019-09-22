public class FirstAndLast {


    public static int sumFirstAndLastDigit (int number){

        // checking if a negative number has been entered
        if(number < 0){
            return -1;
        }

        // Getting the last number
        int lastNumber = (number % 10);
        System.out.println("The last number is: " + lastNumber);

        // Getting the first number with a loop
        int firstNumber = 0;
        while(number > 0){
            firstNumber = number;
            number /= 10;

        }
        System.out.println("The first number is: " + firstNumber);
        int sumOfFirstAndLast = (firstNumber + lastNumber);
        System.out.println("The sum of the first and last is: " + sumOfFirstAndLast);

        return sumOfFirstAndLast;

    }
}
