public class Textbooks {

    private String title;
    private String author;
    private int ISBN;
    private String dateOfPublicaiton;
    private String journal;


    public Textbooks(String title, String author, int ISBN, String dateOfPublicaiton, String journal) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.dateOfPublicaiton = dateOfPublicaiton;
        this.journal = journal;
    }


    public void getTextBook(){
        System.out.println("_____________________________________");
        System.out.println("The chosen textbook is " + title);
        System.out.println("The author is " + author);
        System.out.println("The ISBN is " + ISBN);
        System.out.println("The date of publication is " + dateOfPublicaiton);
        System.out.println("The name of the journal is " + journal);
        System.out.println("_____________________________________");
    }
}
