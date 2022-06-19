package Day_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Day_12.MusicBand.groupsAfter2000;

public class Task_1_3 {
    public static void main(String[] args) {
        ///Task_1
        List<String> list = new ArrayList<>();
        list.add("Renault");
        list.add("Opel");
        list.add("BMW");
        list.add("Audi");
        list.add("Skoda");
        System.out.println(list);
        list.add(2, "Mercedes");
        list.remove(0);
        System.out.println(list);

        ///Task_2
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            if (i % 2 == 0) {
                list1.add(i);
            }
        }
        for (int i = 300; i < 350; i++) {
            if (i % 2 == 0) {
                list1.add(i);
            }
        }
        System.out.println(list1);

        ///Task_3
        MusicBand band1 = new MusicBand("The Beatles", 1965);
        MusicBand band2 = new MusicBand("Abba", 1972);
        MusicBand band3 = new MusicBand("BackstreetBoys", 1993);
        MusicBand band4 = new MusicBand("Spice Girls", 1994);
        MusicBand band5 = new MusicBand("OneRepublic", 2002);
        MusicBand band6 = new MusicBand("Franz Ferdinand", 2002);
        MusicBand band7 = new MusicBand("Tokio Hotel", 2001);
        MusicBand band8 = new MusicBand("R and B", 2006);
        MusicBand band9 = new MusicBand("5esta Family", 2004);
        MusicBand band10 = new MusicBand("Propaganda", 2001);
        MusicBand band11 = new MusicBand("Propaganda", 2001);

        List<MusicBand> list2 = new ArrayList<>();
        list2.add(band1);
        list2.add(band2);
        list2.add(band3);
        list2.add(band4);
        list2.add(band5);
        list2.add(band6);
        list2.add(band7);
        list2.add(band8);
        list2.add(band9);
        list2.add(band10);
        Collections.shuffle(list2);
        System.out.println(list2);
        groupsAfter2000(list2);
    }

}

