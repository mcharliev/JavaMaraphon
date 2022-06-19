package Day_6;

public class Task3Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Григорий Александрович", "математика");
        Student Petya = new Student("Михаил");
        teacher.evaluate(Petya);
    }
}
