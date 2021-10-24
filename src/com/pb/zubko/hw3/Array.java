package com.pb.zubko.hw3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        final int arraySize = 10;
        int[] a = new int[arraySize];

        int sum = 0;
        int countPositive = 0;

        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arraySize; i++) {
            a[i] = rnd.nextInt(101) - 50;
//            System.out.print("Enter A[" + i + "]: ");
//            a[i]=scan.nextInt();
            sum = sum + a[i];
            if (a[i] > 0) {
                countPositive++;
            }
        }
        System.out.println("Исходный массив: " + Arrays.toString(a));

        // Bubble sort
        for (int j = 0; j < arraySize - 1; j++) {
            for (int i = 0; i < arraySize - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int x = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = x;
                }
            }
        }

//        for (int i = 0; i < arraySize; i++) {
//            System.out.println("a[" + i + "]=" + a[i]);
//        }

        System.out.println("Отсортированный массив: " + Arrays.toString(a));
        System.out.println("Сумма = " + sum);
        System.out.println("Количество положительных элементов = " + countPositive);
    }
}
