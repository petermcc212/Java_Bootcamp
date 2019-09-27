public class Novels {

    private String title;
    private String author;

    public Novels(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void getNovels(){
        System.out.println("_____________________________________");
        System.out.println("The chosen novel is " + title);
        System.out.println("The author is " + author);
    }
}
