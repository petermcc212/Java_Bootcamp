public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if(number <0){
            return -1;
        }
        int sumOfEvenNumbers = 0;
        int numberChecking = 0;
        while(number > 0){
            System.out.println((number % 10));
            numberChecking = (number % 10);
            if(numberChecking%2 == 0){
                sumOfEvenNumbers += numberChecking;
                number /= 10;
            }
            else{
                System.out.println(number + " is not even");
                number /= 10;
                continue;
            }
        }

        System.out.println("Sum of even numbers is: " + sumOfEvenNumbers);

            return  sumOfEvenNumbers;
        }



}
