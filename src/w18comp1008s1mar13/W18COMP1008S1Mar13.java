package w18comp1008s1mar13;

import java.util.ArrayList;

/**
 *
 * @author JWright
 */
public class W18COMP1008S1Mar13
{
    public static void main(String[] args)
    {
        Song song1 = new Song("Primary Stage","JavaFX'ers",2018,177);
        Song song2 = new Song("The Java Boogie","Code-R",2015,228);
        Song song3 = new Song("Loopin'","Abstract People", 2017,104);
        
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        
        try{
            Song song4 = new Song("Erroring out","Catchers", 2020, 100);
            Song song5 = new Song("Erroring out","Catchers", 2010, 9);
            Song song6 = new Song("", "Catchers",2010,100);
            Song song7 = new Song("Erroring out","", 2010, 90);
            songs.add(song4);
            songs.add(song5);
            songs.add(song6);
            songs.add(song7);
        }
        catch (IllegalArgumentException e){};
        
        
        /**
         * Uncomment these commands once the methods are created.
         */
        displaySongs(songs);
        
        System.out.printf("The longest song is: %s%n", getLongestSong(songs));
    }
    
    
    /**
     * Question 7 - This method is called displaySongs.  It will receive an ArrayList of Song 
     * objects and display their attributes to the screen. The display will come in the form of 
     * Song [#]: [song name by artist], released in [year released], it is [duration] seconds long.
     * 
     * It should show 1 song per line.
     */
    public static void displaySongs(ArrayList<Song> songList)
    {
        for (int i=0; i<songList.size(); i++)
        {
            Song song = songList.get(i);
            System.out.printf("Song %d: %s, released in %d, it is %d seconds long.%n",
                                   i+1, song.toString(), song.getYearReleased(),
                                   song.getDurationInSec());
        }
    }

     /**
      * This method is called getLongestSong.  It accepts an ArrayList of Song objects. 
      * The method will loop over all the Song objects in the ArrayList and return 
      * the Song object that has the longest duration.
      */
    public static Song getLongestSong(ArrayList<Song> songList)
    {
        Song longestSong = songList.get(0);
        
        for (Song song:songList)
        {
            if (longestSong.getDurationInSec() < song.getDurationInSec())
                longestSong = song;
        }
        return longestSong;
    }
}