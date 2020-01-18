package com.company.lesson10;

import com.company.lesson9.Seqence;

public class SectionRun {
    public static void main(String[] args) {
        SectionOnSquare section = new SectionOnSquare(1, 1, 2, 2);
        System.out.println(section);
        SectionOnSquare section2 = new SectionOnSquare(-3, 0, 1, 1);
        System.out.println(section2);
        double leightSection1 = section.cutLength(section.x, section.x1);
        double leightSection2 = section2.cutLength(section2.x, section2.x1);
        boolean equal = section.compare(leightSection1, leightSection2);
        System.out.println(equal ? "Длина двух отрезков равна между собой" : "Длина двух отрезков не равна между собой");

    }
}
