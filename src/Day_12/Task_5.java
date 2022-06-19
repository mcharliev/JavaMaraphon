package Day_12;

import java.util.ArrayList;
import java.util.List;

public class Task_5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Pink", 32));
        members1.add(new MusicArtist("Maksim", 35));
        members1.add(new MusicArtist("Zara", 30));
        members1.add(new MusicArtist("Hanna", 28));
        members1.add(new MusicArtist("Britney Spears", 25));
        LastMusicBand band1 = new LastMusicBand("Stars_1", 2002, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Julia Gagarina", 25));
        members2.add(new MusicArtist("Lady Gaga", 35));
        members2.add(new MusicArtist("Madonna", 48));
        members2.add(new MusicArtist("Slava", 31));
        members2.add(new MusicArtist("Adel", 30));
        LastMusicBand band2 = new LastMusicBand("Stars_2", 2010, members2);
        LastMusicBand.transferMembers(band1, band2);
        LastMusicBand.printMembers(band1);

    }
}

