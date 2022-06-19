package Day_18;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println(count7(789786782));

    }

    public static int recursionSum(int numbers[], int i) {
        if (i == numbers.length) {
            return 0;
        }
        return numbers[i] + recursionSum(numbers, i + 1);

    }

    public static int count7(int n) {

        if (n == 0) {
            return 0;
        }
        if (n % 10 == 7) {
            return 1 + count7(n / 10);
        } else {
            return count7(n / 10);
        }
    }
}

