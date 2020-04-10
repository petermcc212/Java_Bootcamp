public class Main {

    public static void main(String[] args) {

        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstancenumber());
        System.out.println(two.getInstancenumber());
        System.out.println(three.getInstancenumber());



        int pw = 76765;
        Password password = new ExtendedPassword(pw);
        password.storePassword();



        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(92934);
        password.letMeIn(-1);
        password.letMeIn(76765);

    }
}
