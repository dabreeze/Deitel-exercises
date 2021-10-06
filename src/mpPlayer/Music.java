package mpPlayer;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;

public class Music {
    private String name;
    private String artistName;
    private int trackNumber;
    private LocalTime duration;

    public Music(){}
    public Music(String name, String artistName, int trackNumber, LocalTime duration) {
        this.name = name;
        this.artistName= artistName;
        this.trackNumber = trackNumber;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Music{" +
                "name='" + name + '\'' +
                ", artistName='" + artistName + '\'' +
                ", trackNumber=" + trackNumber +
                ", duration=" + duration +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getArtistName() {
        return artistName;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public LocalTime getDuration() {
        return duration;
    }
}
