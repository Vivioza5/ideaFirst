package com.company.lesson9.homework;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Palindroms {
    public static String inputOperator() {
        Scanner scanner = new Scanner(System.in);

        String operator = scanner.nextLine();
        return operator;
    }
    public static boolean testWords(String first){
        StringBuffer text1 = new StringBuffer(first);
        StringBuffer testtext= text1.reverse();
        String testtext2= testtext.toString();
        String text2 = new String(first);
        boolean test= text2.equals(testtext2);
return test;
    }

    public static void main(String[] args) {
        System.out.println("Please enter word!");
        String first = inputOperator();
        String second =inputOperator();
        String third =inputOperator();
        System.out.println(testWords(first)? "This word is palindrom": "No palindrom");
        System.out.println(testWords(second)? "This word is palindrom": "No palindrom");
        System.out.println(testWords(third)? "This word is palindrom": "No palindrom");


    }


}
