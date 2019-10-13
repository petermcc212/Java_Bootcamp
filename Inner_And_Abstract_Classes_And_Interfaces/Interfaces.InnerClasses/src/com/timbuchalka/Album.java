package com.timbuchalka;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Album {
    private String name;
    private String artist;
//    private ArrayList<Song> songs;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
//        this.songs = new ArrayList<Song>();
        this.songs = new SongList();

    }

    private boolean addSong(String title, double duration){
        return this.songs.addSong(new Song(title, duration));

    }

    private Song findSong(String title){
        for(Song s: playlist){
            if(s.getTitle().equals(title)){
                return s;
            }

        }
    }



//    public boolean addSong(String title, double duration) {
//        if(findSong(title) == null) {
//            this.songs.add(new Song(title, duration));
//            return true;
//        }
//        return false;
//    }

//    private Song findSong(String title) {
//        for(Song checkedSong: this.songs) {
//            if(checkedSong.getTitle().equals(title)) {
//                return checkedSong;
//            }
//        }
//        return null;
//    }

//    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
//        int index = trackNumber -1;
//        if((index >0) && (index <= this.songs.size())) {
//            playList.add(this.songs.get(index));
//            return true;
//        }
//        System.out.println("This album does not have a track " + trackNumber);
//        return false;
//    }

//    public boolean addToPlayList(String title, LinkedList<Song> playList) {
//        Song checkedSong = findSong(title);
//        if(checkedSong != null) {
//            playList.add(checkedSong);
//            return true;
//        }
//        System.out.println("The song " + title + " is not in this album");
//        return false;
//    }



    private class SongList {

        private List<Song> songs;


        private SongList(){
            this.songs = new ArrayList<Song>();


        }


        public boolean addSong(Song song){
            if(songs.contains(song)){
                return false;
            }
            this.songs.add(song);
            return true;
        }


        private Song findSong(String title){
            for(Song checkedSong: this.songs){
                if(checkedSong.getTitle().equals(title)){
                    return checkedSong;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber){
            int index = trackNumber - 1;
            if((index > 0) && (index<songs.size())){
                return songs.get(index);
            }
            return null;
        }


    }






}
