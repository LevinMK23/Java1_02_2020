package lesson6.overriding;

public class A {
    protected int a;

    public A(int a) {
        this.a = a;
        System.out.println(this + " A");
    }

    public void printInfo() {
        System.out.println("Class A, a = " + a);
    }
}
