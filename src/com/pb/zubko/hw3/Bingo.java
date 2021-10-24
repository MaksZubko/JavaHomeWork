package com.pb.zubko.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        final int minNumber = 0;
        final int maxNumber = 100;

        Random rnd = new Random();
        int guessedNumber = rnd.nextInt(maxNumber + 1 - minNumber) + minNumber;

        Scanner scan = new Scanner(System.in);
        String s;

        System.out.println("Если ты хочешь закончить игру, нажми \"R\"");
        System.out.print("Угадай число" + minNumber + " до " + maxNumber + ". Введи свое число: ");

        int counter = 0;
        do {
            counter++;
            s = scan.next();
            if (s.equals("R")) {
                break;
            }
            int n = Integer.parseInt(s);

            if (n == guessedNumber) {
                System.out.println("Ты угадал номер" + n);
                System.out.println("Ты сделал это " + counter + " попытках.");
                break;
            }

            if (n > guessedNumber) {
                System.out.println("Твое число " + n + " > затем секретное число.");
            } else {
                System.out.println("Твое число " + n + " < затем секретное число.");
            }
            System.out.print("Попытка #" + (counter + 1) + " [" + minNumber + " - " + maxNumber + "]: ");

        } while (true);

        System.out.print("Игра окончена!");
    }
}

