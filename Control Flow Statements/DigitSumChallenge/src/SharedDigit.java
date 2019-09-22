public class SharedDigit {

    public static boolean hasSharedDigit (int first, int second){
        if ((first <10) || (first >99) ||(second < 10) || (second > 99)){
            return false;
        }
        // getting first and last of first number
        // first number
        int firstOne = (first / 10);
        // second
        int firstTwo = (first % 10);

        // getting first and last of second number
        // first
        int secondOne = (second / 10);
        int secondTwo = (second % 10);

        // comparing the numbers
        if((firstOne == secondOne) || (firstOne == secondTwo)||
                (firstTwo == secondTwo) || (firstTwo == secondOne)){
            return true;
        }
        return false;
    }
}
