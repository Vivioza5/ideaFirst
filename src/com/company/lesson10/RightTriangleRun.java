package com.company.lesson10;

public class RightTriangleRun {
    public static void main(String[] args) {
        RightTriangle rightTriangle1= new RightTriangle(3,4);
        System.out.println(rightTriangle1);
        RightTriangle rightTriangle2= new RightTriangle(5,6);
        System.out.println(rightTriangle2);
        System.out.println(rightTriangle1.compareTrianqle(rightTriangle1.katet1,rightTriangle1.katet2,rightTriangle2.katet1,rightTriangle2.katet2) ? "Треугольники с введенными катетами подобны между собой" : "Треугольники с введенными катетами различны между собой");
    }



}
