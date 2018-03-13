package w18comp1008s1mar13;

import java.time.LocalDate;

/**
 *
 * @author JWright
 */
public class Song
{
    private String songName, artist;
    private int yearReleased, lengthInSec;

    public Song(String songName, String artist, int yearReleased, int lengthInSec)
    {
        setSongName(songName);
        setArtist(artist);
        setYearReleased(yearReleased);
        setDurationInSec(lengthInSec);
    }
    
    public String getSongName()
    {
        return songName;
    }

    public String getArtist()
    {
        return artist;
    }

    public int getYearReleased()
    {
        return yearReleased;
    }

    public int getDurationInSec()
    {
        return lengthInSec;
    }

    public void setSongName(String songName)
    {
        if (!songName.isEmpty())
            this.songName = songName;
        else
            throw new IllegalArgumentException("Song name cannot be empty");
    }

    public void setArtist(String artist)
    {
        if (!artist.isEmpty())
            this.artist = artist;
        else
            throw new IllegalArgumentException("Artist cannot be empty");
    }
    
    public void setYearReleased(int yearReleased)
    {
        int currentYear = LocalDate.now().getYear();
        if (yearReleased <= currentYear)
            this.yearReleased = yearReleased;
        else
            throw new IllegalArgumentException("Year released must be equal to or "
                                + "less than " + currentYear);
    }
    
    /**
     * This method will validate that the length is greater than 10 and set the 
     * instance variable
     * @param lengthInSec 
     */
    public void setDurationInSec(int lengthInSec)
    {
        if (lengthInSec > 10)       
            this.lengthInSec = lengthInSec;
        else
            throw new IllegalArgumentException("Length must be greater than 10 seconds");
    }
    
    public String toString()
    {
        return songName + " by " + artist;
    }
    
    
}
