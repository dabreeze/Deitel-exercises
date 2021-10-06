package mpPlayer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class Mp3PlayerTest {

    Mp3Player sony;
    @BeforeEach
    void setUp(){
        sony = new Mp3Player("sony");
    }

    @Test
    public void MpCanBeCreated()
    {
        assertEquals("sony", sony.getName());
    }

    @Test
    public void mpCanBeTurnedOn()
    {
        sony.setOn(true);

        assertEquals(true, sony.isOn());
    }

    @Test
    public void mpHasPlaylist()
    {
        Playlist newPlaylist = new Playlist("Default", "Pop");
       sony.createPlaylist("Default", "All");
       sony.createPlaylist("Gospel", "Gospel");
       sony.createPlaylist("Afro pop", "pop");
       sony.createPlaylist("Jazz", "smooth-jazz");
       assertEquals("pop", sony.getPlaylist());
    }

//    @Test
//    public void addMusicToMp()
//    {
//        Music music1 = new Music("joe boy", "joe", 1, LocalTime.of(0, 3,4));
//        Music music2 = new Music("joe boy2", "joe2", 1, LocalTime.of(0,4,0));
//        sony.
//
//    }
//
//    @Test
//    public void mpCanPlayMusic()
//    {
//        Music music1 = new Music("joe boy", "joe", 1, LocalTime.of(0, 3,4));
//        Music music2 = new Music("joe boy2", "joe2", 1, LocalTime.of(0,4,0));
//        sony.addMusic(music1, music2);
//
//    }
//    @Test
//    public void mpVolumeCanBeIncreased()
//    {
//        sony.increaseVolume();
//        sony.increaseVolume();
//        sony.increaseVolume();
//        sony.increaseVolume();
//        assertEquals(20,sony.getVolume());
//    }

}