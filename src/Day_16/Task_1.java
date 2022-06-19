package Day_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        File file = new File("Test");
        double sum = 0;
        double averageNum = 0;
        try {
            Scanner scanner = new Scanner(file);
            String string = scanner.nextLine();
            String stringNumbers[] = string.split(" ");
            List<Integer> numbers = new ArrayList<>();
            for (int i = 0; i < stringNumbers.length; i++) {
                numbers.add(Integer.parseInt(stringNumbers[i]));
                sum += numbers.get(i);
            }
            averageNum = sum / numbers.size();
            System.out.println(averageNum);
            System.out.printf("%.2f",averageNum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
