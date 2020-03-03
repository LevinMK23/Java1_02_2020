package lesson5.persons;

public class Test {
    public static void main(String[] args) {
        Student [] students = new Student[10];
        Teacher teacher = new Teacher("Ivanov", "Ivan");
        for (int i = 0; i < 10; i++) {
            students[i] = new Student("StudentSurname" + (i+1), "StudentName" + (i+1));
            students[i].choiceTeacher(teacher);
        }
        for (Student student : teacher.getStudents()) {
            System.out.println(student);
        }
    }
}
