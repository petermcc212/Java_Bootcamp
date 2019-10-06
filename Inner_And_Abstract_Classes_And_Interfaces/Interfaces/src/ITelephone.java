public interface ITelephone {

    // These are the methods that have to be implemented by
    // any class which uses ITelephone

     void powerOn();
     void dial(int phoneNumber);
     void answer();
     boolean callPhone(String phoneNumber);
     boolean isRinging();

}
