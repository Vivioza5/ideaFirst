package com.company.lesson9.homework;

import java.util.Scanner;

public class TrapezoidMethods {


    public static double InputFirst() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите стороны трапеции");
        System.out.println("Пожалуйста введите длину первого основания ");
        double side = scanner.nextDouble();
        return side;
    }

    public static double InputSecond() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите длину второго основания ");
        double side = scanner.nextDouble();
        return side;
    }

    public static double InputThird() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста введите длину боковых сторон ");
        double side = scanner.nextDouble();
        return side;
    }
//    проверка того что фигура трапеция основания не должны быть равными a>b
    public static int testTrapesoid(double a, double b) {
        int testOk = 0;
        if (b != a && b > 0 && a > 0) {
            testOk = 1;
        } else {
            testOk = 2;
        }
        return testOk;
    }
    public static double trapArea(double a, double b, double c) {
        double S = ((a+b)/4)*(Math.sqrt(4* Math.pow(c,2))-Math.pow((a-b),2));
        return S;
    }

    public static double trapPerimeter(double a, double b, double c) {
        double P = a + b + c *2;
        return P;
    }

//

    public static void main(String[] args) {

        double a = InputFirst();
        double b = InputSecond();
        double c = InputThird();
        if (testTrapesoid(a,b) == 1) {
            double S = trapArea(a, b, c);
            System.out.println("Площадь равнобедренной трапеции: " + S);
            double P=trapPerimeter(a, b, c);
            System.out.println("Периметр равнобедренной трапеции: " + P);

        } else {
            System.out.println("Повторите пожалуйста ввод сторон!");
        }


    }
}
