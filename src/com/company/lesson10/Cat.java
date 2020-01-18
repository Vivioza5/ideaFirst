package com.company.lesson10;

public class Cat {

    public static final int lags = 4;
    private String hair;
    private int age;
    private String gender;



    public Cat() {
        this(5);
        age = 15;
        gender = "Male";
        hair = "short";

    }
    public Cat(int age) {
        this.age = age;
    }

    public Cat(String hair) {
        this.hair = hair;
    }



    public void setCat(String hair, String gender, int age){
        System.out.println(this.hair +" " + this.gender+" " + this.age);

        this.hair = hair;
        this.gender = gender;
        this.age = age;
        System.out.println(this.hair +" " + this.gender+" " + this.age);

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
    public static int getLags() {
        return lags;
    }
    public String getHair() {
        return hair;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hair='" + hair + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
