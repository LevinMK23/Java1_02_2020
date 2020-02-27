package lesson2.HomeWork2;

public class par_2 {
    static int numbers[] = new int[8];

    public static void main(String[] args) {
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                numbers[0] = 0;
                System.out.print(numbers[i]);
            } else {
                numbers[i] = numbers[i - 1] + 3;
                System.out.print(numbers[i]);
            }
        }
    }
}
