package Day_12;

import java.util.ArrayList;
import java.util.List;
import java.util.List;

public class NewMusicBand {
    private String name;
    private int year;
    private List<String> members;


    public NewMusicBand(String name, int year, List<String> members) {
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

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "NewMusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", members=" + members +
                '}';
    }

    public static void transferMembers(NewMusicBand musicBand1, NewMusicBand musicBand2) {
        musicBand1.members.addAll(musicBand2.members);
    }
    public static void printMembers(NewMusicBand musicBand){
        System.out.println(musicBand.getMembers());
    }
}



