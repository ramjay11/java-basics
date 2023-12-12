package com.ramjava.java.basics.designpatterns.structuralpatterns.composite_der;

/* Allows you to treat individual objects and composition of objects uniformly
*  They allow to represent part-whole hierarchies */
public class SongListGenerator {
    public static void main(String[] args) {
        SongComponent industrialMusic = new SongGroup("\nIndustrial",
                "is a style of experimental music that draws on transgression and provocative themes. "
                        + "\nThe music is accessible but it's angry. It's well produced but it's distorted.");
        SongComponent heavyMetalMusic = new SongGroup("\nHeavy Metal",
                "is a genre of Rock that developed in the late 1960's, largely in the UK and in the US ");
        SongComponent dubstepMusic = new SongGroup("\nDubstep",
                "is a genre of electronic dance music that originated in South London, England");
        //The master song grouping
        SongComponent everySong = new SongGroup("Song List", "Every Song Available");
        everySong.add(industrialMusic);
        industrialMusic.add(new Song("Du hast", "Rammstein", 1997));
        industrialMusic.add(new Song("Happiness in Slavery", "Nine Inch Nails", 1992));
        industrialMusic.add(new Song("HeadHunter", "Front 242", 1988));
        industrialMusic.add(heavyMetalMusic);
        heavyMetalMusic.add(new Song("War Pigs", "Black Sabbath", 1970));
        heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));
        heavyMetalMusic.add(new Song("Dadalang", "Walleye", 2014));
        DiscJockey jockeyFromHell = new DiscJockey(everySong);
        jockeyFromHell.getSongList();
    }
}
