package lesson6.overriding.read_write;

import java.io.IOException;
import java.util.Scanner;

public class ReadWriter implements Reader, Writer{

    @Override
    public int read() {
        return new Scanner(System.in).nextInt();
    }

    @Override
    public void write(int value) {
        System.out.print(value);
    }
}
