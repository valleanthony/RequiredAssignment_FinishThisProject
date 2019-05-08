package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);



        ArrayList<Song> songs = new ArrayList<Song>();
        for (int i = 0; i< 10;i++){

            System.out.println("Please enter an artist:");
            String artist = keyboard.nextLine();
            System.out.println("Please enter a song title:");
            String title = keyboard.nextLine();
            Song s = new Song();
            s.setArtist(artist);
            s.setTitle(title);
            songs.add(s);
        }

        //print all the songs in the array list
        for(Song item:songs){
            System.out.println(item.getTitle());
            //System.out.println(xxxx.display());
        }

        System.out.println();
        System.out.println("What song are you looking for?");
        String titleToFind = keyboard.nextLine();
        for (Song item2: songs){
            if (item2.getTitle().equals(titleToFind)){
                System.out.printf("I found %s \r\n",item2.getTitle());
            }
        }
    }
}