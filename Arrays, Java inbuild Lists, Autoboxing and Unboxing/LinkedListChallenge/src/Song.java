public class Song {

    String title;
    Double duration;



    public Song (String artist, String title, Double duration){
        this.title = title;
        this.duration = duration;
    }



    public String getSongTitle() {
        return this.title;
    }



    public Double getDuration(){
        return this.duration;
    }

    @Override
    public String toString() {
        return this.title + " : " + this.duration;
    }
}
