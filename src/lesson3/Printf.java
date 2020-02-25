package lesson3;

public class Printf {
    public static void main(String[] args) {
        // %6d _ _ _ _ _ _ int, long, short, byte
        // %7.5f _ _, _ _ _ _ _ float, double
        // %s - String
        // %c - char
        System.out.printf("int value = %2d, float value = %4.2f",
        12, 5.7);
    }
}
