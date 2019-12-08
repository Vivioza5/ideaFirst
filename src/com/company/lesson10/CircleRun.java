package com.company.lesson10;

public class CircleRun {
    public static void main(String[] args) {

        Circle circle = new Circle(10, 20, 3);
        //Circle circle1 = new Circle(10, 20, 3);
        //String string = " ";

        circle.x = 11;
        circle.y = 22;
        circle.r = 5;
//        circle.zoom(2);
        System.out.println(circle);
        circle.circumference(circle.r);
        circle.centerReplace(5);
        System.out.println("Площадь круга = " + circle.circleSquare(circle.r));


    }
}