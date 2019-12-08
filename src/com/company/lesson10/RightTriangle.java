package com.company.lesson10;

public class RightTriangle {
    double katet1;
    double katet2;

    public RightTriangle(double katet1, double katet2) {
        this.katet1 = katet1;
        this.katet2 = katet2;

    }
    public boolean compareTrianqle(double katet1, double katet2, double katet3, double katet4){
        return (katet1/katet2)==(katet3/katet4);
    }

    @Override
    public String toString() {
        return "Был создан прямоугольный треугольник со сторонами {" +
                "katet1=" + katet1 +
                ", katet2=" + katet2 +
                '}';
    }
}
