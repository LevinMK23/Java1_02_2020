package lesson2.HomeWork2;

public class par_3 {
    static int[] numbers = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

    public static void main(String[] args) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] = numbers[i] * 2;
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i]);
            }
        }
    }
}
