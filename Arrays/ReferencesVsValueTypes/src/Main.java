import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("AnotherIntValue = " + anotherIntValue);

        anotherIntValue ++;

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("AnotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;


        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

    }
}
