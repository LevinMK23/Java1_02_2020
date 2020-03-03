package lesson5.persons;

import java.util.ArrayList;

public class Teacher extends Person{

    private ArrayList<Student> students;

    public Teacher(String surname, String name) {
        super(surname, name);
        students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
