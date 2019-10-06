import java.util.ArrayList;

public class Album  {

    private String albumTitle;
    private String artist;
    private ArrayList<Song> songs;


    public Album(String albumTitle, String artist){
        songs = new ArrayList<Song>();
        this.albumTitle = albumTitle;
        this.artist = artist;

    }

    public void addSong(Song song){
        songs.add(song);
    }

    public void removeSong(Song song){
        if(songs.contains(song)){
            songs.remove(song);
        }else{
            System.out.println("Sorry, couldn't find that song");
        }
    }



    public Song getSong(String songTitle){

        for(Song s: songs){
            if(s.getSongTitle().equals(songTitle)){
                return s;
            }
        }
        return null;
    }






}
