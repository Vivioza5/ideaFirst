package com.company.lesson9.homework;

import java.util.Scanner;

public class InputMethods {
    public static double Inputside() {
        
        Scanner side = new Scanner(System.in);
        double testNumber = 0;
        if (side.hasNextDouble()) { // возвращает истинну если с потока ввода можно считать целое число
             testNumber = side.nextDouble(); // считывает целое число с потока ввода и сохраняем в переменную
        } else {
            System.out.println("Вы ввели не  число");
        }
        return testNumber;
    }
    public static String inputOperator() {
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.nextLine();
        return operator;
    }


}
