package lesson3;


import java.math.BigInteger;
import java.util.Arrays;

public class Ex1 {

    static void printArgs(BigInteger id, Object... args) {
        System.out.println(args.getClass().getSimpleName());
        for (Object arg : args) {
            System.out.println(arg + " " + arg.getClass().getSimpleName());
        }
    }

    static int sum(int... x) {
        return Arrays.stream(x).sum();
    }

    public static void main(String[] args) {
        printArgs(new BigInteger("1"));
        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 1));
    }
}
