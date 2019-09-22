public class SumOddRange {


    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd(int start, int end) {
        int sumOfOdd = 0;
        if ((start > end) || (start < 0) || (end < 0)) {
            return -1;
        } else {

            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sumOfOdd += i;
                }
            }
        }
        return sumOfOdd;

    }
}
