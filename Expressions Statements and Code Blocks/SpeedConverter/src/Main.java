public class Main {

    public static void main(String[] args) {

        SpeedConverter s = new SpeedConverter();
        System.out.println(s.toMilesPerHour(1.5));
        System.out.println(s.toMilesPerHour(10.25));
        System.out.println(s.toMilesPerHour(-5.6));
        System.out.println(s.toMilesPerHour(25.42));
        System.out.println(s.toMilesPerHour(75.114));


    }
}
