import java.util.Arrays;

/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author Matthew & Greg
 * @version 2025-01-27
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        Playlist p1 = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        Song s1 = new Song("Twist", 59, "Korn");
        Song s2 = new Song("Paranoid", 168, "Black Sabbath");
        p1.addSong(s1);
        p1.addSong(s2);
        p1.addSong("Mr. Brightside", 223, "The Killers");
        p1.addSong("Start a Fire", 192, "John Legend");
        p1.addSong("As the World Caves In", 219, "Matt Maltese");
        
        
        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        p1.printPlaylist();
        
        
        System.out.println("\nLiking the songs in position X, Y, Z, etc....\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        p1.changeStatus("Mr. Brightside");
        p1.changeStatus("Twist");
        p1.changeStatus("Paranoid");
        

        System.out.println("Printing the songs...\n");
        p1.printPlaylist();


        System.out.println("\nRemoving the song in position A, B, C, etc...\n");
        p1.removeSong(3);

        System.out.println("Printing the songs...\n");
        p1.printPlaylist();


        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        p1.printLiked();

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        int time = p1.getTotalTime();
        int minutes = time / 60;
        int seconds = time % 60;
        System.out.println(String.format("%d:%02d", minutes, seconds));

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        p1.removeUnliked();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        p1.printPlaylist();

    }
}
