package Day_9;

public class Teacher extends Human {
    private String teachersSubject;

    public Teacher(String name,String teachersSubject) {
        super(name);
        this.teachersSubject = teachersSubject;
    }

    public String getTeachersSubject() {
        return teachersSubject;
    }

    public void setTeachersSubject(String teachersSubject) {
        this.teachersSubject = teachersSubject;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getName());
    }
}
