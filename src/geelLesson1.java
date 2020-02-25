public class geelLesson1 {
    public static void main (String[] args){
        task2();
        System.out.println("a * (b + (c / d)) = " + task3(10,12,34,41));
        System.out.println(task4(7, 15));
        task5(-1);
        System.out.println(task6(-10));
        task7("Мир!");
        task8(2020);
    }


    //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
    static void task2() {
        System.out.println("Задание 2.");
        boolean b = true;
        byte bt = 1;
        char c = 'с';
        short s = 12;
        int i = 124;
        long l = 1568L;
        float f = 13.6f;
        double d = 12.1;
        System.out.println("Значение для типа boolean = " + b);
        System.out.println("Значение для типа byte = " + bt);
        System.out.println("Значение для типа char = [" + c + "]");
        System.out.println("Значение для типа short = " + s);
        System.out.println("Значение для типа int = " + i);
        System.out.println("Значение для типа long = " + l);
        System.out.println("Значение для типа float = " + f);
        System.out.println("Значение для типа double = " + d);
    }

    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – входные параметры этого метода;
    static double task3(int a, int b, int c, int d) {
        System.out.println("\nЗадание 3.");
        return a * (b + (c / d));
    }

    //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
    //в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    static boolean task4(int a, int b) {
        System.out.println("\nЗадание 4.");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен
    //напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль
    //считаем положительным числом.
    static void task5(int a) {
        System.out.println("\nЗадание 5.");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    //6. Написать метод, которому в качестве параметра передается целое число, метод должен
    //вернуть true, если число отрицательное;
    static boolean task6(int a) {
        System.out.println("\nЗадание 6.");
        if (a < 0) return true;
        return false;
    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    //метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    static void task7(String name) {
        System.out.println("\nЗадание 7.");
        System.out.println("Привет, " + name + "!");
    }

    //8. Написать метод, который определяет является ли год високосным, и выводит сообщение
    //в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й
    //– високосный.
    static void task8(int year) {
        System.out.println("\nЗадание 8.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " год не високосный");
        else System.out.println(year + " год високосный");
    }
}
