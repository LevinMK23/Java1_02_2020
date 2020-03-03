package lesson5;

public class AngryCat {

    private static int counter = 0;
    private String name;
    private int age, id;
    int hp; //package private
    //alt + insert

    public static void foo() {
        System.out.println();
    }

    //non static -> static OK
    //static -> non static WRONG
    public int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public AngryCat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
        this.id = counter;
    }

    public void say() {
        System.out.println("SHSHSHSHHSHSHHSHSH");
    }
}
