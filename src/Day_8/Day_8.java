package Day_8;

public class Day_8 {
    public static void main(String[] args) {
        //Задание №1
        String numbers = " ";
        long before = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            numbers += i + " ";
        }
        System.out.println(numbers + " ");
        long after = System.currentTimeMillis();
        System.out.println("Время выполнения цикла с классом String " + (after - before));
        StringBuilder sb = new StringBuilder();
        before = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb + " ");
        after = System.currentTimeMillis();
        System.out.println("Время выполнения цикла с классом StringBuilder " + (after - before));

        //Задание №2
        Airplane airplane = new Airplane("Boeing777",2010,78,120);

        System.out.println(airplane);

    }
}

