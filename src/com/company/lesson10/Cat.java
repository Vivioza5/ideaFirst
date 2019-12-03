package com.company.lesson10;

public class Cat {
    public static final int lags = 4;
   private String hair;
    private int age;
    private String gender;

    public Cat() {
        age = 1;
        gender = "male";
        hair = "short";

    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}

