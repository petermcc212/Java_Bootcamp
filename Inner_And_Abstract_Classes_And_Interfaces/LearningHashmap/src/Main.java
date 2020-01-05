import java.util.HashMap;

public class Main {

    public static void main(String[] args) {


        HashMap<String, String> fun = new HashMap();
        fun.put("bobbyJoe1992", "FluffyP0nies!");
        fun.put("helloKittyFan", "Alovera?");
        fun.put("coolguy", "password123");

        fun.remove("helloKittyFan");

        System.out.println(fun.containsValue("password123") );
    }
}
