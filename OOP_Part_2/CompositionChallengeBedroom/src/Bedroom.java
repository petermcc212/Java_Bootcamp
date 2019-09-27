public class Bedroom {

    Bookshelf bookshelf;
    Bed bed;
    Desk desk;
    boolean hasLamp;
    ChargingCentre chargingCentre;



    public Bedroom (Bookshelf bookshelf, Bed bed, Desk desk,  boolean hasLamp, ChargingCentre chargingCentre){
        this.bookshelf = bookshelf;
        this.bed = bed;
        this.desk = desk;
        this.hasLamp = hasLamp;
        this.chargingCentre = chargingCentre;


    }

    public void getBedroom(){
        bookshelf.getBookshelf();
        bed.getBed();
        desk.getDesk();
        if(hasLamp){
            System.out.println("The desk has a lamp");
        }
        chargingCentre.getChargingCentre();

    }





}
