public class Contact {

    // Name and phone number

    private String name;
    private String phoneNumber;



    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void changeName(String name){
        this.name = name;
        System.out.println("Name updated");
    }

    public void changeNumber(String number){
        this.phoneNumber = number;
        System.out.println("Number updated");
    }




    public String toString(){
        String toReturn = "Name: " + getName() + " \t  Phone number: " + getPhoneNumber();
        System.out.println(toReturn);
        return toReturn;
    }








}
