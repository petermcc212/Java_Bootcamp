public class Main {


    public static void main(String[] args) {

        // Instantiate bookshelf
        Novels pmNovels = new Novels("Harry Potter and the philosophers stone", "J.K Rowling");
        Textbooks pmtextbooks = new Textbooks("Human anatomy", "Mr Smart Man", 100, "10/01/2000", "Medical Journal");
        Documents pmDocuments = new Documents("Bank statements", "Banking", "01/09/2019");
        Bookshelf pmBookshelf = new Bookshelf(pmNovels, pmtextbooks, pmDocuments, 10, "Brown", "Ikea");



        //Instantiate bed
        Bed pmBed = new Bed("DeluxeChamp", "Ikea", true, "White");

        // Instantiate DockingStaiton
        Keyboard pmKeyboard = new Keyboard("Apple", "wireless 1.0", false);
        Mouse pmMouse = new Mouse("Tecknet", 2, false);
        Laptop pmLaptop = new Laptop("Apple", "MacbookPro", "i7", 6, true);
        Monitor pmMonitor = new Monitor("Dell", "27 Ultrawide", 27, true, "1027 x 768");
        DockingStation pmDockingStation = new DockingStation(pmKeyboard, pmMouse, pmLaptop, pmMonitor);
        System.out.println(pmDockingStation.getKeyboard().isMechanical);


        // Instantiate ChargingCentre
        ChargingCentre pmChargingCentre = new ChargingCentre(true, true, 5, "Sony");


        // Instantiate desk
        Desk pmDesk = new Desk(pmDockingStation, 100, true);


        // Instantiate petersBedroom

        Bedroom petersBedroom = new Bedroom(pmBookshelf, pmBed, pmDesk, true, pmChargingCentre);
        petersBedroom.getBedroom();



    }


}
