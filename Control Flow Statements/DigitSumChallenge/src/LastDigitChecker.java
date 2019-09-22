
public class LastDigitChecker {


    public static boolean hasSameLastDigit(int first, int second, int third) {

        // checking the range
        if ((first < 10) || (first > 1000)
                || (second < 10) || (second > 1000)
                || (third < 10) || (third > 1000)) {
            return false;
        }

        // getting the last number of each and adding them to a string
        String lastNumbersAsString = "";
        lastNumbersAsString += (Integer.toString(first % 10));
        lastNumbersAsString += (Integer.toString(second % 10));
        lastNumbersAsString += (Integer.toString(third % 10));
        System.out.println(lastNumbersAsString);

        for(int i = 0; i<lastNumbersAsString.length(); i ++){
            int count = 0;
            for(int j = 0; j<lastNumbersAsString.length(); j ++ ){
                if (lastNumbersAsString.charAt(i) == lastNumbersAsString.charAt(j)){
                    count ++;
                    if(count > 1){
                        System.out.println("Two of the same number");
                        return true;
                    }
                }
            }
        }


        return false;

    }


    public static boolean isValid (int number){
        if((number <10  ) || (number > 1000)){
            return  false;
        }
        return true;
    }

}
