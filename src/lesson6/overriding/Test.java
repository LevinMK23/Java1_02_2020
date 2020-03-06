package lesson6.overriding;

import lesson6.overriding.logging.ConsoleLogger;
import lesson6.overriding.logging.FileLogger;
import lesson6.overriding.logging.Logger;

public class Test {


    public static void main(String[] args) {
        A a = new A(12);
        B b = new B(1, 2);
        C c = new C(5, 6, 7);
        System.out.println(b.getClass());
        a.printInfo();
        b.printInfo();
        c.printInfo();
        Logger log = new ConsoleLogger();
        log.debug("test1");
        log.debug("test2");
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            log.error("Деление на 0!");
        }
    }
}
