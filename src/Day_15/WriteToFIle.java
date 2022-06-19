package Day_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WriteToFIle {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("shoes.csv");
        Scanner scanner = new Scanner(file);

        File file1 = new File("Test_1.txt");
        PrintWriter pw = new PrintWriter(file1);

        while (scanner.hasNextLine()) {
            String string = scanner.nextLine();
            String stringNumbers[] = string.split(";");
            for (int i = 0; i < stringNumbers.length; i++) {
                if (Integer.parseInt(stringNumbers[2]) == 0) {
                    pw.println(stringNumbers[0] + " " + stringNumbers[1] + " " + stringNumbers[2]);
                }
            }
        }
        pw.close();
        scanner.close();
    }
}
