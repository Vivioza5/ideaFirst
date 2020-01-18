package com.company.lesson11;

public class Run {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.setLeight(10);
        shape.setWidth(10);
        System.out.println(shape);

        Quadrate quadrate = new Quadrate();
        quadrate.setWidth(15);
        quadrate.setLeight(15);
        quadrate.setDiagonal(25);
        System.out.println(quadrate);
        double squreQ = quadrate.squareQuadr(quadrate.getLeight(),quadrate.getWidth());
        System.out.println(squreQ);
    }

}
