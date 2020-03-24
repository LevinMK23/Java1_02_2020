package lesson5;

public class employee {
    // Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
    private String fullName, position, email, mobileNumber;
    private Integer salary, age;

    public Integer getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    // Конструктор класса должен заполнять эти поля при создании объекта;
    public employee(String fullName, String position, String email, String mobileNumber, Integer salary, Integer age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.salary = salary;
        this.age = age;
    }

    // * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;

    public void getAllInfo() {
        System.out.printf("---------------------------------------\n");
        System.out.printf("Full Name: " + this.fullName+'\n'+"Position: " + this.position +
                '\n'+"Email:" + this.email + '\n' + "mobileNumber: " + this.mobileNumber + '\n' +
                "Salary: " + this.salary + '\n' + "Age: " + this.age);

    }

}
