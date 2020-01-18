package com.company.lesson10;

public class SectionOnSquare {
    double x;
    double y;
    double x1;
    double y1;

   /* public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }*/
   public SectionOnSquare(double x, double y, double x1, double y1) {
       this.x = x;
       this.y = y;
       this.x1 = x1;
       this.y1 = y1;

   }
    public double cutLength(double x,double x1){
        double leight = x1-x;
        System.out.println(leight);
        return leight;
    }
    public boolean compare(double leight,double leight2){
       return leight==leight2;
    }
    @Override
    public String toString() {
        return "SectionOnSquare{" +
                "x=" + x +
                ", y=" + y +
                ", x1=" + x1 +
                ", y1=" + y1 +
                '}';
    }
}
