package com.pb.zubko.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first phrase: ");
        String str1 = scan.nextLine();
        System.out.println("Enter second phrase: ");
        String str2 = scan.nextLine();

        if(normalizeAnagram(str1).equals(normalizeAnagram(str2))){
            System.out.println("These phrases are anagrams.");
        }
        else{
            System.out.println("These phrases are NOT anagrams.");
        }

    }

    static String normalizeAnagram(String str){
        str = str.replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return Arrays.toString(charArray);
    }
}