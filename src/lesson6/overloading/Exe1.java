package lesson6.overloading;

public class Exe1 {

    // overloading - перегрузка
    // полиморфизм

    static public void func(int i) {
        System.out.println("func with int arg");
    }

    static public void func(int a, int b) {
        System.out.println("func with two int arg");
    }

    static public void func(long l) {
        System.out.println("func with long arg");
    }

    static public void func(float f) {
        System.out.println("func with float arg");
    }

    static public void func(double d) {
        System.out.println("func with double arg");
    }

    public static void main(String[] args) {
        func(3);
        func(10L);
        func(1.2f);
        func(1.2);
    }
}
