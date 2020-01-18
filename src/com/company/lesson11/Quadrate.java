package com.company.lesson11;

public class Quadrate extends Shape {
   private int diagonal;
public  int squareQuadr(int widht, int leight){
    return  widht*leight;
}
    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return super.toString()+"Quadrate{" +
                "diagonal=" + diagonal +
                '}';
    }
}
