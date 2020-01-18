package com.company.lesson11;

public class Shape extends Object{
    private int width;
    private int leight;

    public int getWidth() {
        return width;
    }

    public int getLeight() {
        return leight;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLeight(int leight) {
        this.leight = leight;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "width=" + width +
                ", leight=" + leight +
                '}';
    }
}
