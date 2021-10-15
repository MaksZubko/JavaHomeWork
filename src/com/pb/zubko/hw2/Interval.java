package com.pb.zubko.hw2;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
        if (number>=0 && number<=14){
            System.out.println (number + " находится в промежутке [0..14]");
        } else if (number>=15 && number<=35){
            System.out.println (number + " находится в промежутке [15..35]");
        } else if (number>=36 && number<=50) {
            System.out.println(number + " находится в промежутке [36..50]");
        } else if (number>=51 && number<=100) {
            System.out.println(number + " находится в промежутке [51..100]");
        } else {
            System.out.println(number + " не попало ни в один промежуток");
        }
    }
}