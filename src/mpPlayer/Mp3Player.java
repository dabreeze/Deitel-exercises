package mpPlayer;

import java.util.ArrayList;
import java.util.List;

public class Mp3Player {
    private String name;
    private List<Playlist> playlist;
    private int volume;
    public boolean isOn;


    public Mp3Player(String name) {
        this.name = name;
    }

    public void createPlaylist(String name, String genre ) {
        this.playlist = new ArrayList<Playlist>();

    }

    public String getName()
    {

        return name;
    }

    @Override
    public String toString() {
        return "Mp3Player{" +
                "name='" + name + '\'' +
                ", playlist=" + playlist +

                ", volume=" + volume +
                ", isOn=" + isOn +
                '}';
    }


    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }




    public void searchMusicByName(String musicName){

    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        volume += 5;
    }

    public byte getPlaylist() {
        playlist.get(1);
        return 0;
    }
}
