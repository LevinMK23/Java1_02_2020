package lesson5.persons;

public class Student extends Person {

    private Teacher teacher;

    public Student(String surname, String name) {
        super(surname, name);

    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void choiceTeacher(Teacher teacher) {
        this.teacher = teacher;
        teacher.addStudent(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
