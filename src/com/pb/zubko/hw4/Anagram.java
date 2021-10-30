package com.pb.zubko.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую фразу: ");
        String str1 = scan.nextLine();
        System.out.println("Введите вторую фразу: ");
        String str2 = scan.nextLine();

        if(normalizeAnagram(str1).equals(normalizeAnagram(str2))){
            System.out.println("Эти фразы являются анаграммами.");
        }
        else{
            System.out.println("Эти фразы НЕ являются анаграммами.");
        }

    }

    static String normalizeAnagram(String str){
        str = str.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return Arrays.toString(charArray);
    }
}