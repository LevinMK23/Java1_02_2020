package lesson6.overriding;

public class C extends B {
    protected int c;

    public C(int a, int b, int c) {
        super(a, b);
        this.c = c;
        System.out.println(this + " C");
    }

    @Override
    public void printInfo() {
        //super.printInfo();
        System.out.println("Class C, a = "
                + a + ", b = " + b + ", c = " + c);
    }
}
