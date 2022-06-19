package Day_12;

import java.util.List;
import java.util.ArrayList;

public class LastMusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public LastMusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "LastMusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year + '}';
    }

    public static void transferMembers(LastMusicBand musicBand1, LastMusicBand musicBand2) {
        musicBand1.getMembers().addAll(musicBand2.getMembers());
    }

    public static void printMembers(LastMusicBand musicBand) {
        System.out.println(musicBand.getMembers());

    }
}

