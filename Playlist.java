/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 * 
 * @author Matthew and Greg
 * @version 2025-01-27
 */

import java.util.ArrayList;

public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> playlist;


     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist() {
        playlist = new ArrayList<Song>();
    }

      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */
    public int find(String title) {
        int index = 0;
        for (Song i : playlist) {
            if (i.getTitle().equals(title)) {
                return index;
            }
            index++;
        }
        return 0;
    }
    public void addSong(Song newSong) {
        playlist.add(newSong);
    }
    
    public void addSong(String title, int length, String artist) {
        playlist.add(new Song(title, length, artist));
    }

    public void removeSong(int index) {
        playlist.remove(index);
    }

    public void changeStatus(String title) {
        playlist.get(find(title)).setLiked(true);
    }

    public void printPlaylist() {
        int count = 1;
        for (Song i : playlist) {
            System.out.println(count + ") " + i.toString());
            count++;
        }
    }

    public int getTotalTime() {
        int total = 0;
        for (Song i : playlist) {
            total += i.getTime();
        }
        return total;
    }

    public void removeUnliked() {
        for (int i = 0; i < playlist.size(); i++) {
            if (!playlist.get(i).getStatus()) {
                playlist.remove(i);
            }
        }
    }

    public void printLiked() {
        int count = 1;
        for (Song i : playlist) {
            if (i.getStatus()) {
            System.out.println(count + ") " + i.toString());
            count++;
            }
        }
    }
}
