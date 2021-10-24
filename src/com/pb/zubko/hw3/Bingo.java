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

        System.out.println("If you want to exit game, type \"x\" anytime.");
        System.out.print("Try to guess number from " + minNumber + " to " + maxNumber + ". Type your number: ");

        int counter = 0;
        do {
            counter++;
            s = scan.next();
            if (s.equals("x")) {
                break;
            }
            int n = Integer.parseInt(s);

            if (n == guessedNumber) {
                System.out.println("Wow! You are right! I guessed number " + n);
                System.out.println("You did it in " + counter + " attempts.");
                break;
            }

            if (n > guessedNumber) {
                System.out.println("Your number " + n + " > then secret number.");
            } else {
                System.out.println("Your number " + n + " < then secret number.");
            }
            System.out.print("Try #" + (counter + 1) + " [" + minNumber + " - " + maxNumber + "]: ");

        } while (true);

        System.out.print("Game over!");
    }
}

