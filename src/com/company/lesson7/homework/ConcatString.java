package com.company.lesson7.homework;
//    2. Напишите программу Java для конкатенации данной строки в конец другой строки

public class ConcatString {
    public static void main(String[] args) {
        String firstString = "First Phrase + ";
        System.out.println(firstString);
        String testString = "Hello World!!";
        System.out.println(testString);
        System.out.println(firstString.concat(testString));
    }
}
