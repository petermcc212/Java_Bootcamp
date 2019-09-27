public class Bookshelf {

    int numberOfShelves;
    String colour;
    String brand;




    public Bookshelf(Novels novels, Textbooks textbooks, Documents documents, int numberOfShelves, String colour, String brand){
        this.numberOfShelves = numberOfShelves;
        this.colour = colour;
        this.brand = brand;


    }
    public void getBookshelf(){
        System.out.println("_____________________________________");
        System.out.println("The bookshelf has " + numberOfShelves + " shelves");
        System.out.println("The colour of the bookshelf is: " + colour);
        System.out.println("The brand of bookshelf is " + brand);
        System.out.println("_____________________________________");
    }
}
