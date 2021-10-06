package mpPlayer;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    private String nameOfArtist;
    private List<Music> music;
    private String genre;

    public Playlist(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }



    public void addMusic(Music... newMusic) {
        if(music == null){
            music = new ArrayList<>();
        }
        for (Music musics : newMusic){
            music.add(musics);
        }
    }
    public List<Music> getMusic() {
        return music;
    }




    @Override
    public String toString() {
        return "Playlist " +
                "Artist Name: '" + nameOfArtist + '\'' +
                ", music:  "+ music+ "Genre: "+ genre ;
    }
}
