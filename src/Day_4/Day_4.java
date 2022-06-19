package Day_4;

import java.util.Arrays;
import java.util.Scanner;

public class Day_4 {
    public static void main(String[] args) {
//        Задание №1
        System.out.println("Задание №1");
        System.out.print("Введите число ");
        Scanner scanner = new Scanner(System.in);
        int randomNum = scanner.nextInt();
        int array[] = new int[randomNum];
        int sum = 0;
        int evenNum = 0;
        int oddNum = 0;
        int equalOne = 0;
        int moreThanEight = 0;
        for (int i = 0; i < randomNum; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
            sum += array[i];
            if (array[i] % 2 == 0) {
                evenNum++;
            }
            if (array[i] % 2 != 0) {
                oddNum++;
            }
            if (array[i] == 1) {
                equalOne++;
            }
            if (array[i] > 8) {
                moreThanEight++;
            }
        }
        System.out.println("Введено число " + randomNum + ". Сгенерирован следующий массив ");
        System.out.println(Arrays.toString(array));
        System.out.println(" Количество чисел больше 8: " + moreThanEight);
        System.out.println(" Количество чисел равных 1: " + equalOne);
        System.out.println(" Количество четных чисел: " + evenNum);
        System.out.println(" Количество нечетных чисел " + oddNum);
        System.out.println(" Сумма всех элементов массива: " + sum);

//         Задание №2
        System.out.println("Задание №2");
        int newArray[] = new int[100];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (int) (Math.random() * 10000 + 1);
        }
        int min = newArray[0];
        int max = newArray[0];
        int arrayEndZero = 0;
        int arraySum = 0;
        for (int x : newArray) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
            if (x % 10 == 0) {
                System.out.println(x);
                arrayEndZero++;
                arraySum += x;
            }
        }
        System.out.println("Наибольший элемент массива : " + max);
        System.out.println("Наименьший элемент массива : " + min);
        System.out.println("Количество элементов массива оканчивающихся на 0 : " + arrayEndZero);
        System.out.println("Сумма элементов  массива оканчивающихся на 0 : " + arraySum);

//         Задание №3
        System.out.println("Задание №3");
        int array1[][] = new int[12][8];
        int maxSum = 0;
        int array1Index = 0;
        for (int i = 0; i < array1.length; i++) {
             sum = 0;
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 50 + 1);
                sum += array1[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                array1Index = i;
            }
        }
        System.out.println("Максимальное число в строке № " + array1Index + " сумма - " + maxSum);
//         Задание №4
        System.out.println("Задание №4");
        int array2[] = new int[100];
         maxSum = 0;
        int maxIndex = 0;
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 10000 + 1);
        }
        for (int i = 0; i < array2.length - 2; i++) {
            sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array2[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxIndex = i;
            }
        }
        System.out.println("Сумма трех максимальных элементов " + maxSum);
        System.out.println("Индекс макс элементов " + maxIndex);
    }


}



