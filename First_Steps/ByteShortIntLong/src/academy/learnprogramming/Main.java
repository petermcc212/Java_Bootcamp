package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;


	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;


        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Maximum byte value = " + myMaxByteValue);
        System.out.println("Minimum byte value = " + myMinByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Maximum short value = " + myMaxShortValue);
        System.out.println("Minimum short value = " + myMinShortValue);

        long myLongValue = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Maximum long value = " + myMaxLongValue);
        System.out.println("Minimum long value = " + myMinLongValue);
        long bigLongLiteralValue =  2_147_483_647_434L;
        System.out.println(bigLongLiteralValue);


        short bigShortLiteralValue = 32767;

        byte myNewByteValue = (byte)(myMinByteValue / 2);
        System.out.println(myNewByteValue);

        short myNewShortValue = (short) (myMinShortValue / 2);


        byte myByteVariable = 10;
        short myShortVariable = 20;
        int myIntVariable = 50;
        long myLongVariable = 50000L + (10L * (myByteVariable + myShortVariable
                + myIntVariable));
        System.out.println(myLongVariable);

        short myShortValue = (short)(1000 + 10 * (myByteVariable + myShortVariable
                + myIntVariable));
    }
}
