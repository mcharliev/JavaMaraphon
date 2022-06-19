package Day_6;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int grade = (int) (Math.random() * 5 + 1);
        String studentGrade = " ";
        if (grade == 5) {
            studentGrade = "отлично";
        } else if (grade == 4) {
            studentGrade = "хорошо";
        } else if (grade == 3) {
            studentGrade = "удовлетворительно";
        } else {
            studentGrade = "неудовлетворительно";
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +
                " по предмету " + subject + " на оценку " + studentGrade);

    }
}
