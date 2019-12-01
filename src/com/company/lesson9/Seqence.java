package com.company.lesson9;

public class Seqence {
    public static double y1 (int x){
       double val= (Math.exp(x)+Math.exp(-x))/2;
       return val;
       }
    public static double y2 (int x){
        double val= (Math.pow(x,2)+Math.pow(x,3))/4;
        return val;
    }

    public static void main(String[] args) {
        double sum1= 0;
        double sum2=0;
        for (int x = 1; x <=10 ; x++) {
            sum1+=y1(x);
            sum2+=y2(x);

        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
    }

