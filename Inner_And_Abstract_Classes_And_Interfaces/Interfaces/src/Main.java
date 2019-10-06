public class Main {

    private boolean clutchIsIn;



    public static void main(String[] args) {
        ITelephone petersPhone;

        // with interfaces you can  create different objects from that interface
        // as long as the classes of those objects implement that interface

        // for example, here we are creating a desk phone object
        petersPhone = new DeskPhone("08005756453");
        petersPhone.powerOn();
        petersPhone.callPhone("123");
        petersPhone.answer();

        // and here we are creating a mobile phone object

        petersPhone = new MobilePhone("10020203");
        petersPhone.powerOn();
        petersPhone.callPhone("10020203");
        petersPhone.answer();

        // both of the above refer to petersPhone



    }



    public void operateClutch(boolean inOrOut){
        this.clutchIsIn = inOrOut;

    }
}
