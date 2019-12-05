package com.company.lesson9.homework;

import java.util.Scanner;

public class TrapezoidMethods {
    public static double trapArea(double a, double b, double c) {
        double S = ((a+b)/4)*(Math.sqrt(4* Math.pow(c,2))-Math.pow((a-b),2));
        return S;
    }
//    проверка того что фигура трапеция основания не должны быть равными a>b
    public static int testTrapesoid(double a, double b, double c) {
        int testOk = 0;
        if (b != a && b > 0 && a > 0&& c>0) {
            testOk = 1;
        } else {
            testOk = 2;
        }
        return testOk;
    }
//методы ввода выведены в отдельный класс InputMethods для удобства доступа из нескольких классов
    public static void main(String[] args) {
        System.out.println("введите стороны трапеции");
        System.out.println("Пожалуйста введите длину первого основания ");
        double a = InputMethods.Inputside();
        System.out.println("Пожалуйста введите длину второго основания ");
        double b = InputMethods.Inputside();
        System.out.println("Пожалуйста введите длину боковых сторон ");
        double c = InputMethods.Inputside();
        if (testTrapesoid(a,b,c) == 1) {
            double S = trapArea(a, b, c);
            System.out.println("Площадь равнобедренной трапеции: " + S);
        } else {
            System.out.println("Повторите пожалуйста ввод сторон!");
        }


    }
}
