package com.company.lesson9.homework;

import java.util.Scanner;

public class TestMethods {

    //    ввод данных - проверка на ввод чисел.
    public static boolean testSides(double a, double b, double c) {
        boolean testSides = (a + b > c && b + c > a && a + c > b);
//        System.out.println(testSides);
        return testSides;

    }



    public static boolean testNegative(double a, double b, double c) {
        boolean testNegative = (a > 0 && b > 0 && c > 0);
//        System.out.println(testNegative);
        return testNegative;

    }
}
