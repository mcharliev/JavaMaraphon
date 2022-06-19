package Day_9;

public class H_W_Test {
    public static void main(String[] args) {
        Student student = new Student("Max","math");
        student.printInfo();
        Teacher teacher = new Teacher("Michail Grigorievich",  "geographic ");
        System.out.println("Учебная группа студента : " + student.getStudyGroup());
        System.out.println("Преподаватель ведет предмет: " + teacher.getTeachersSubject());
        teacher.printInfo();
    }
}
