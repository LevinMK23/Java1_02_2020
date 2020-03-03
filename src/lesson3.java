import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class lesson3 {
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);
    /**
     * 1. Написать программу, которая загадывает случайное число от 0 до 9,
     *    и пользователю дается 3 попытки угадать это число. При каждой попытке
     *    компьютер должен сообщить больше ли указанное пользователем число чем
     *    загаданное, или меньше. После победы или проигрыша выводится запрос
     *    «Повторить игру еще раз? 1 – да / 0 – нет» (1 – повторить, 0 – нет).
     */
    public static void main(String[] args) {
        do {
            int count = 0;
            int guess = -1;
            int number = random.nextInt(10);
            while (count < 3 && guess != number) {
                System.out.print(
                        "Guess [" + (count + 1) + "] the number (0..9): ");
                try {
                    guess = sc.nextInt();
                    if (number == guess) {
                        System.out.println("You won!");
                    } else {
                        System.out.println("Your number is " + ((guess > number)? "greater" : "less."));
                        count++;
                    }
                } catch (InputMismatchException ex) {
                    System.out.println("Input Mismatch Exception!");
                    sc.next();
                }
            }
            if (count == 3)
                System.out.println("You lost!");
            System.out.print("Repeat the game?\n[1 - yes / 0 - no]: ");
        } while (sc.next().equals("1"));
    }
}
