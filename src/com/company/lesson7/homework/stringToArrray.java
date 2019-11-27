package com.company.lesson7.homework;

//Напишите Java программу для создания массива символов, содержащего содержимое строки.
public class stringToArrray {
    public static void main(String[] args) {

        String testString = "testing";
        char ch[] = testString.toCharArray();
        for (char i : ch) {
            System.out.print(i + " ");
        }

    }


}
