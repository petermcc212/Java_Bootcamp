import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // creating library. An arrayList of all albums
        ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(lewisNewAlbum());
        albums.add(LauraNewAlbum());


        // arrayList for playlist
        ArrayList<Song> playlist = new ArrayList<Song>();
        // making sure the track is part of an album
        // by first selecting the album
        playlist.add(albums.get(0).getSong("Grace"));
        playlist.add(albums.get(0).getSong("Hold Me While You Wait"));
        playlist.add(albums.get(1).getSong("The Light (IYEARA Remix)"));


        boolean quit = false;
        boolean goingForward = true;
        Scanner scanner = new Scanner(System.in);
        ListIterator<Song> listIterator = playlist.listIterator();

        if(playlist.isEmpty()){
            System.out.println("No songs in the playlist");
            return;
        }else{
            menu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Goodbye");
                    quit = true;
                    break;

                case 1:
                    // forward
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().getSongTitle());
                        break;
                    } else {
                        System.out.println("You're at the end");
                        break;
                    }
                case 2:
                    // backward
                    if (goingForward) {
                        listIterator.hasPrevious();
                    }
                    goingForward = false;
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().getSongTitle());
                        break;
                    } else {
                        System.out.println("You're at the beginning");
                        break;
                    }
                case 3:
                    if (goingForward) {
                        System.out.println("Replaying current track " + listIterator.previous().getSongTitle());
                        listIterator.next();
                        break;
                    } else {
                        System.out.println("Replaying current track " + listIterator.next().getSongTitle());
                        listIterator.next();
                        break;
                    }
                case 4:
                    // remove current song
                    if (goingForward) {
                        System.out.println("Removing current track ");
                        playlist.remove(listIterator.previous());
                        break;
                    }
                    if (!goingForward) {
                        System.out.println("Removing current track ");
                        playlist.remove(listIterator.next());
                        break;
                    }
                case 5:
                    for (Song s : playlist) {
                        System.out.println("Track: " + s.getSongTitle());
                    }
                    break;
            }


        }

    }


    public static void menu(){
        System.out.println("Peter's iPod ");
        System.out.println("___________________________");
        // display current song that's playing
        System.out.println("Press 0 to quit");
        System.out.println("Press 1 to skip forward to the next song");
        System.out.println("Press 2 to go backwards to the previous song");
        System.out.println("Press 3 to replay current song");
        System.out.println("Press 4 to remove current song");
        System.out.println("Press 5 to list all songs in playlist");

    }


    public static Album lewisNewAlbum (){
        // setup his album
        Song grace = new Song("Lewis Capaldi", "Grace", 3.04);
        Song bruises = new Song("Lewis Capaldi", "Bruises", 3.40);
        Song holdMeWhileYouWait = new Song("Lewis Capaldi", "Hold Me While You Wait", 3.25);
        Song someoneYouLoved = new Song("Lewis Capaldi", "Someone You Loved", 3.02);
        Song maybe = new Song("Lewis Capaldi", "Maybe", 3.30);


        Album divinityUninspiredToAHellishExtent = new Album("Divinely Uninspired To A Hellish Extent", "Lewis Capaldi");
        divinityUninspiredToAHellishExtent.addSong(grace);
        divinityUninspiredToAHellishExtent.addSong(bruises);
        divinityUninspiredToAHellishExtent.addSong(holdMeWhileYouWait);
        divinityUninspiredToAHellishExtent.addSong(someoneYouLoved);
        divinityUninspiredToAHellishExtent.addSong(maybe);

        return divinityUninspiredToAHellishExtent;
    }


    public static Album LauraNewAlbum(){
        Song theLight = new Song("Laura Marling", "The Light (IYEARA Remix)", 3.22);

        Album lump = new Album("Lump",  "Laura Marling");
        lump.addSong(theLight);
        return lump;
    }
}
