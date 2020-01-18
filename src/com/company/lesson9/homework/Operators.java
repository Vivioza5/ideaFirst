package com.company.lesson9.homework;

import java.util.Scanner;

public class Operators {
    public static double inputFirst() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers!");
        System.out.println("enter first number: ");
        double First = scanner.nextDouble();
        return First;
    }

    public static double inputSecond() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter second number: ");
        double second = scanner.nextDouble();
        return second;
    }

    public static String inputOperator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select operator!");
        String operator = scanner.next();
        return operator;
    }

public static double summary(double first, double second){
        double sum= first+second;
        return sum;
}
    public static double subtraction(double first, double second){
        double sub= first-second;
        return sub;
    }

    public static double division(double first, double second){
        double div= first/second;
        return div;
    }
    public static double multiplication(double first, double second){
        double mult= first/second;
        return mult;
    }

    public static void main(String[] args) {
        double First = inputFirst();
        double Second = inputSecond();
        String operator=inputOperator();
        switch(operator){
            case "+":
               double summary=  summary(First,Second);
                System.out.println("summary two numbers: " + summary);
                break;
            case "-":
                double subtraction=  subtraction(First,Second);
                System.out.println("subtraction two numbers: " + subtraction);
                break;
            case "/":
                double division=  division(First,Second);
                System.out.println("division two numbers: " + division);
                break;
            case "*":
                double mult=  multiplication(First,Second);
                System.out.println("multiplication two numbers: " + mult);
                break;
            default:
                System.out.println("you entered wrong symbols!" );



        }





    }
}
