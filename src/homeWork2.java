public class homeWork2 {
    public static void main(String[] args){
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла
        // и условия заменить 0 на 1, 1 на 0;
        System.out.println("\r\n Задание номер 1");
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] == 1 ? 0 : 1;
            System.out.print(arr1[i] + " ");
        }

        //2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.println("\r\n Задание номер 2");
        int[] arr2 = new int[8];
        for (int i = 1, j = 0; i < arr2.length; i++)
            arr2[i] = j += 3;
        for (int v : arr2)
            System.out.print(v + " ");

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2;
        System.out.println("\r\nЗадание номер 3");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6)
                arr3[i] *= 2;
            System.out.print(arr3[i] + " ");
        }

        //4. Создать квадратный двумерный целочисленный массив ,
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.println("\r\n Задание номер 4");
        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0, j2 = arr4[i].length; j < arr4[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arr4[i][j] = 1;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.print("\r\n");
        }

        //5. * Задать одномерный массив и найти в нем минимальный и максимальный элементы;
        System.out.println("\r\n Задание номер 5");
        int[] arr5 = {10, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = arr5[0], max = arr5[0], indMax = 0, indMin = 0;
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > max) {
                max = arr5[i];
                indMax = i;
            }
            if (arr5[i] < min) {
                min = arr5[i];
                indMin = i;
            }
        }
        System.out.println("Максимальный элемент находится в массиве под индексом " + indMax + " со значением  = " + max);
        System.out.println("Минимальный элемент находится в массиве под индексом " + indMin + " со значением  = " + min);


        int[] arr6 = {4, 2, 8, 3, 9, 15, 5, 12, 3, 1, 11, 1};

        System.out.println("\r\n Задание номер 6 \n результат = " + checkBalance(arr6));
    }

    //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    // метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
    // Примеры: checkBalance([1, 1, 1, || 2, 1])  true, checkBalance ([2, 1, 1, 2, 1])  false, checkBalance ([10, || 10])  true,
    // граница показана символами ||, эти символы в массив не входят.
    private static boolean checkBalance(int[] arrParam) {
        int leftSum, rightSum;

        for (int i = 0; i < arrParam.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arrParam[j];
            }

            for (int j = i; j < arrParam.length; j++) {
                rightSum += arrParam[j];
            }

            if (leftSum == rightSum) return true;
        }
        return false;
    }
}
