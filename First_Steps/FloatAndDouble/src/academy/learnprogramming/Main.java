package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);


        // doubles are a lot more precise than floats but they require double the space in memory
        // (64 rather than 32 bits)
        // Remember, a float is a single precision value
        // a double is a double precision value
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);


        int myIntValue = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5d;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue); // Will print 5.0. Decimal shows as is a float
        System.out.println("MyDoubleValue = " + myDoubleValue); // Will print 5.0 as number is a double


        // Pounds to kilograms challenge
        double pounds = 200d;
        double poundsInAKilogram = 0.45359237;
        double result = (pounds * poundsInAKilogram );
        System.out.println("result  = " + result);





    }
}
