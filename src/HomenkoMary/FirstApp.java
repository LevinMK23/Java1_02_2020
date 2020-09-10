package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        game();
    }

    private static void game(){
        System.out.println("Угадайте число от 0 до 9. У Вас три попытки. Удачи!");
        Scanner scanner = new Scanner (System.in);

        int ranqe = 9;
        int number = (int)(Math.random()*ranqe);
        int maximumAttempts = 3;
        int attempt = 1;

        while (true){
            if (attempt <= maximumAttempts){
                System.out.println("Введите число от 0 до " + ranqe );
                int input_number = scanner.nextInt();
                if (input_number == number){
                    System.out.println("Поздравляю. Вы угадали.");
                    break;
                } else if (input_number > number){
                    System.out.println("Увы. Загаданное число меньше.");
                } else {
                    System.out.println("Увы. Загаданное число больше.");
                }
                attempt ++;
            }
            else{
                System.out.println("Попыток больше нет");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                int yesNo = scanner.nextInt();
                if (yesNo == 1){
                    game();
                }
                else{
                    System.out.println("Спасибо за игру!");
                    break;
                }

            }
        }
        scanner.close();
    }


}
