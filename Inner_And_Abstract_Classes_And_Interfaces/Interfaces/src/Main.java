public class Main {

    public static void main(String[] args) {

        ITelephone petersPhone;
        petersPhone = new DeskPhone(123456);
        petersPhone.powerOn();
        petersPhone.callPhone(123456);
        petersPhone.answer();


        // Alt code to achieve the same as the above
//        DeskPhone petersPhone = new DeskPhone(123456);
//        petersPhone.powerOn();
//        petersPhone.callPhone(123456);
//        petersPhone.answer();

        // mobile phone

        petersPhone = new MobilePhone(246810);
//        petersPhone.powerOn();
        petersPhone.callPhone(246810);
        petersPhone.answer();





    }
}
