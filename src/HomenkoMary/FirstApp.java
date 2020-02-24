package HomenkoMary;

public class FirstApp {

    public static void main(String[] args) {
        invertArray();
        System.out.println("\n======================");
        fillArray();
        System.out.println("\n======================");
        changeArray();
        System.out.println("\n======================");
        fillDiagonal();
        System.out.println("\n======================");
        maxAndMinArrayValue();
    }

    public static void invertArray() {
        int[] NameArray = {1, 0, 1, 0, 0, 1};

        for (int i = 0; i < NameArray.length; i++) {
            if (NameArray[i] == 1) {
                NameArray[i] = 0;
                System.out.println("элемент массива с ключом " + i + " изменен, и теперь равен: " + NameArray[i] );
            } else {
                NameArray[i] = 1;
                System.out.println("элемент массива с ключом " + i + " изменен, и теперь равен: " + NameArray[i] );
            }
        }
    }

    public static void fillArray() {
        int[] NameArray = new int[8];
        NameArray[0] = 0;
        for (int i = 1; i < NameArray.length; i++) {
            NameArray[i] = NameArray[i - 1] + 3;
            System.out.println(NameArray[i]);
        }
    }

    public static void changeArray() {
        int[] NameArray = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < NameArray.length; i++) {
            if (NameArray[i] < 6) {
                System.out.println("число " + NameArray[i] + " меньше 6ти, умножаем на 2:");
                NameArray[i] = NameArray[i] * 2;
                System.out.println("новое число: " + NameArray[i]);
            }
            else {
                System.out.println("число " + NameArray[i] + " больше 6ти - пропускаем.");
            }
        }
    }

    public static void fillDiagonal() {
        int[][] NameArray = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((i == 0 && j == 0) || (i == 1 && j == 1) || (i == 2 && j == 2) || (i == 3 && j == 3)){
                    NameArray[i][j] = 1;
                }
                if ((i == 0 && j == 3) || (i == 1 && j == 2) || (i == 2 && j == 1) || (i == 3 && j == 0)){
                    NameArray[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(NameArray[i][j]+" ");
            }
        }
    }

    public static void maxAndMinArrayValue() {
        int max = 0;
        int min = 0;

        int[] NameArray = { -1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, -10 };

        for (int i = 0; i < NameArray.length; i++){
            if (max < NameArray[i]) {
                max = NameArray[i];
            }
            min = max;
            if (NameArray[i] < min) {
                min = NameArray[i];
            }
        }

        System.out.println("Максимальное число в массиве = " + max);
        System.out.println("Минимальное число в массиве = " + min);
    }
}
