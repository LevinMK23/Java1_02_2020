package lesson3;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random rnd = new Random();
        System.out.println(rnd.nextInt());
        System.out.println(rnd.nextInt(100));
        System.out.println(rnd.nextDouble()); // (0;1)
    }
}
