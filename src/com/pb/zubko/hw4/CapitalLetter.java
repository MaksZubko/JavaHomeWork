package com.pb.zubko.hw4;

import java.util.Locale;
import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        System.out.println(capitalizeFirstLetters(getUserString()));
    }

    static String getUserString(){
        System.out.println("Enter your string: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    static String capitalizeFirstLetters(String originalString) {
        String newString = "";
        boolean isItSpace = true;

        for (char c : originalString.toCharArray()
        ) {
            newString += isItSpace ? String.valueOf(c).toUpperCase() : String.valueOf(c);
            isItSpace = String.valueOf(c).equals(" ");
        }
        return newString;
    }
}