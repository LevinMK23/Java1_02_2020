package lesson2.homework;

import java.util.Arrays;

public class HomeWork {

    static int[] task1(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            // (0 + 1) % 2 = 1
            // (1 + 1) % 2 = 0
            ar[i] = (ar[i] + 1) % 2;
        }
        return ar;
    }

    static void task11(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            ar[i] = (ar[i] + 1) % 2;
        }
    }

    //1 2 3 3 3, sum = 12
    //1 - 11, 3 - 9, 6 - 6
    static boolean checkBalance(int[] array) {
        int fullSum = 0, leftSum = 0;
        for (int i : array) fullSum += i;
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            if (fullSum  == 2 * leftSum) {
                int [] left = new int[i+1],
                        right = new int[array.length - i - 1];
                for (int j = 0; j <= i; j++) {
                    left[j] = array[j];
                }
                for (int j = i + 1; j < array.length; j++) {
                    right[j - i - 1] = array[j];
                }
                System.out.printf("full array = %s\n" +
                                "left = %s\n" +
                        "right = %s\n" +
                        "sum = %d\n", Arrays.toString(array),
                        Arrays.toString(left),
                        Arrays.toString(right), leftSum);
                return true;
            }
        }
        return false;
    }
    //89112756975
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 0, 0, 1};
        //task11(array);
        checkBalance(new int[] {1, 2, -3, 1, 2, -1});
    }
}
