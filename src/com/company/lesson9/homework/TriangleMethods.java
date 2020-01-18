package com.company.lesson9.homework;

import java.util.Scanner;

public class TriangleMethods {
    public static double triangleArea(double a, double b, double c) {
        double p= (a+b+c)/2;
        double S = Math.sqrt (p*(p-a)*(p-b)*(p-c));
        return S;
    }
//вывод приглашения отдельный класс вывод для фигур, как на лету изменять  параметрі методов?
    public static void main(String[] args) {

        System.out.println("введите стороны треугольника");
        System.out.println("Пожалуйста введите длину первой стороны ");
        double a = InputMethods.Inputside();
        System.out.println("Пожалуйста введите длину второй стороны ");
        double b = InputMethods.Inputside();
        System.out.println("Пожалуйста введите длину третьей стороны ");
        double c = InputMethods.Inputside();
        TestMethods.testNegative(a, b, c);
        TestMethods.testSides(a,b,c);
        double S =triangleArea(a, b, c);
        System.out.println("Площадь треугольника: " + S);

    }
}
