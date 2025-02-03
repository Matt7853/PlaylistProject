/**
 * Song class to be used in Playlist Project
 * @Greg Panossian
 * @1-24-25
 */
public class Song 
{
    //Fields-- what information do we want each Song to store?
    private String title;
    private int time; // in seconds
    private String artist;
    private boolean liked; 

    /**
     * By default, the song is not liked (status = false)
     */
    public Song(String title, int time, String artist)
    {
        this.title = title;
        this.time = time;
        this.artist = artist;
        this.liked = false;
    }
    
    /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */
    public String getTitle()
    {
         return title;
    }
    
    public int getTime()
    {
        return time;
    }
    
    public String getArtist()
    {
        return artist;
    }
    
    public boolean getStatus()
    {
        return liked;
    }
    
    //Setters are below
    public void setLiked(boolean status)
    {
        liked = status;
    }
    
    public String toMinutes()
    {
        int minutes = time / 60;
        int seconds = time % 60;
        return String.format("%d:%02d", minutes, seconds);
    }
    
    public String toString()
    {
        return String.format("Title: %s | Artist: %s | Time: %s | Liked: %b", 
                             title, artist, toMinutes(), liked);
    }
}