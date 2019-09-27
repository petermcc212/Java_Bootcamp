public class Main {

    public static void main(String[] args) {
        Printer pmPrinter = new Printer(50, 10, true);
        pmPrinter.fillUpToner(60);
        pmPrinter.printPages(10);
        pmPrinter.getPagesPrinted();
        pmPrinter.printPages(11);
        pmPrinter.getPagesPrinted();



    }




}
