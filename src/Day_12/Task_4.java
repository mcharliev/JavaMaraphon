package Day_12;

import java.util.ArrayList;
import java.util.List;


public class Task_4 {
    public static void main(String[] args) {
        ///Task_3
        List<String> members1 = new ArrayList<>();
        members1.add("Pink");
        members1.add("Maksim");
        members1.add("Zara");
        members1.add("Hanna");
        members1.add("Britney Spears");
        NewMusicBand band1 = new NewMusicBand("Stars_1", 2002, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Julia Gagarina");
        members2.add("Lady Gaga");
        members2.add("Madonna");
        members2.add("Slava");
        members2.add("Adel");
        NewMusicBand band2 = new NewMusicBand("Stars_2", 2010, members2);
        NewMusicBand.transferMembers(band1, band2);
        NewMusicBand.printMembers(band1);
    }
}
