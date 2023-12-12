package com.ramjava.java.basics.designpatterns.structuralpatterns.composite_der;

public class DiscJockey {
    SongComponent songList;
    public DiscJockey(SongComponent newSongList) {
        songList = newSongList;
    }
    public void getSongList() {
        songList.displaySongInfo();
    }
}
