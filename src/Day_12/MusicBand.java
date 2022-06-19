package Day_12;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;


    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;

    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
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
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        for (MusicBand x : bands) {
            if (x.getYear() > 2000) {
                System.out.print(x + " ");
                ;
            }
        }
        return bands;
    }
}
