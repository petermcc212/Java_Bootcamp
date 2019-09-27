public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;


    public Printer (int tonerLevel, int pagesPrinted, boolean duplexPrinter){

        // validate toner initially set
        if(tonerLevel > 0 && tonerLevel <100){
            this.tonerLevel += tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplexPrinter = duplexPrinter;

    }



    public void fillUpToner(int tonerToAdd){
        if(tonerLevel == 100){
            System.out.println("Your toner is full. No need to add more");
        }else{
            if(tonerToAdd + tonerLevel > 100){

                // toner to leave
                int tonerLeftOver = ((tonerToAdd) - (100 - tonerLevel));
                tonerLevel = 100;
                System.out.println("Not all toner required. You are left with " + tonerLeftOver + " in your refill");
            }else{
                tonerLevel += tonerToAdd;
                System.out.println("Your toner level is now " + tonerLevel);
            }
        }
    }


    public void printPages(int pages){
        if(duplexPrinter){
            System.out.println("Printer is a duplex printer");
            // check to see if there's an odd number of pages being printed.
            // if so, increase page count by an extra page
            if(pages % 2 != 0){
                pagesPrinted += 1;
                int additionalPages = (int) (pages/2);
                pagesPrinted += additionalPages;
            }
        }else{

            pagesPrinted += pages;
        }
    }

    public int getTonerLevel(){
        System.out.println("Toner level: " + tonerLevel);
        return this.tonerLevel;
    }

    public int getPagesPrinted(){
        System.out.println("Pages printed: " + pagesPrinted );
        return pagesPrinted;
    }

    public boolean isDuplexPrinter(){
        if(duplexPrinter){
            System.out.println("This is a duplex printer");
            return true;
        }else{
            System.out.println("This is not a duplex printer");
            return false;
        }
    }





    // methods
    //fill up toner
    // printing a page
    // print a message if printer is a duplex


}
