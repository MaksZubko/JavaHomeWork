package com.pb.zubko.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        Scanner input = new Scanner(System.in);
        int firstNumber;
        firstNumber = input.nextInt();
        System.out.println("Введите знак для арифметической операции:");
        String sign;
        sign = input.next();
        System.out.println("Введите второе число:");
        int secondNumber;
        secondNumber = input.nextInt();
        switch (sign) {
            case "+":
                System.out.println(firstNumber + sign + secondNumber + "=" + (firstNumber+secondNumber));
                break;
            case "-":
                System.out.println(firstNumber + sign + secondNumber + "=" + (firstNumber-secondNumber));
                break;
            case "*":
                System.out.println(firstNumber + sign + secondNumber + "=" + (firstNumber*secondNumber));
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println ("На ноль делить нельзя.");
                } else {
                    System.out.println(firstNumber + sign + secondNumber + "=" + (firstNumber/secondNumber));
                    break;}
        }



    }
}