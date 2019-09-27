public class Documents {
    private String title;
    private String subsection;
    private String date;

    public Documents(String title, String subsection, String date) {
        this.title = title;
        this.subsection = subsection;
        this.date = date;
    }

    public void getDocument(){
        System.out.println("_____________________________________");
        System.out.println("The title of the document is " + title);
        System.out.println("The subsection of the chosen document is " + subsection);
        System.out.println("The date of the chosen document is " + date);
        System.out.println("_____________________________________");
    }
}
