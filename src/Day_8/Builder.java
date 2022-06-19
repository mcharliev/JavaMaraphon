package Day_8;

public class Builder {
    public static void main(String[] args) {
         StringBuilder sb1 = new StringBuilder(); // вместимость по умолчанию 16 символов
         StringBuilder sb2 = new StringBuilder("Good day");
         StringBuilder sb3 = new StringBuilder(50);   // capacity (вместимость 50 символов)
         StringBuilder sb4 = new StringBuilder(sb2);   // capacity (вместимость 50 символов)




    }
}
