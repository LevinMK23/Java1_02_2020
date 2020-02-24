package lesson2.HomeWork2;

public class par_1 {

    static int[] numbers = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

    public static void main(String[] args) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                numbers[i] = 0;
                System.out.print(numbers[i]);
            } else {
                numbers[i] = 1;
                System.out.print(numbers[i]);
            }
        }
    }

}
