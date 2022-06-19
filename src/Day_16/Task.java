package Day_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws FileNotFoundException {
        Random random = new Random();
        File file1 = new File("file1.txt");
        PrintWriter pw1 = new PrintWriter(file1);

        for (int i = 0; i < 1000; i++) {
            pw1.println(random.nextInt(100));
        }
        pw1.close();

        Scanner scanner = new Scanner(file1);
        File file2 = new File("file2.txt");
        PrintWriter pw2 = new PrintWriter(file2);
        int count = 0;
        int sum = 0;
        while (scanner.hasNextLine()) {
            sum += Integer.parseInt(scanner.nextLine());
            count++;
            if (count == 20) {
                pw2.println(sum / 20.0);
                sum = 0;
                count = 0;
            }
        }
        pw2.close();
        printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
        double result = 0;
        List<Double> array = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            result += Double.parseDouble(scanner.nextLine());
        }
        System.out.println((int) result);
    }
}




