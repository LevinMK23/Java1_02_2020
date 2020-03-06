package lesson6.overriding.read_write;

public class Test {
    public static void main(String[] args) {
        ReadWriter rw = new ReadWriter();
        rw.write(rw.read());

    }
}
