package com.company.lesson10;

public class Circle {
    //свойства(поля) класса
    double x;
    double y;
    double r;

    static final double PI;

    static {
        PI = 3.14;
    }

    public Circle() {
    }

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    //методы класа(поведение)
    public void print() {
        System.out.println("Окружность с такими координатами "
                + " x = " + x + " у = " + y + "   " + "радиус = " + r);
    }


    public void zoom(int k) {
        r = r * k;
    }

    public void circumference(double r) {
        double l = 2 * (PI * r);
        System.out.println("Длина окружности=" + l);
    }

    public Circle centerReplace(int n) {
        Circle circle = new Circle();
        x += n;
        y += n;
        System.out.println("Новые координаты центра окружности: x = " + x + ", y=" + y);
        return circle;
    }
    public double circleSquare(double r) {

        double S= PI* Math.pow(r,2);
//        System.out.println("Площадь круга =:" + S );
        return S;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }
}