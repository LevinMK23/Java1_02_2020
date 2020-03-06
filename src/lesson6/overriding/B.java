package lesson6.overriding;

public class B extends A {

    protected int b;

    public B(int a, int b) {
        super(a);
        this.b = b;
        System.out.println(this + " B");
    }

    //ctrl + O

    @Override
    public void printInfo() {
        //A print
        //super.printInfo();
        //B print
        System.out.println("Class B, a = " + a + ", b = " + b);
    }
}
