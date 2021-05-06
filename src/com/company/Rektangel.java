package com.company;

public class Rektangel {
    double bas;
    double hojd;




    public static double getArea(double bas, double hojd){
        double area = Math.abs(bas * hojd);
        return area;


    }

    public static double getOmkrets(double bas, double hojd){
        double omkrets = Math.abs(bas * 2) + Math.abs(hojd * 2);
        return omkrets;

    }
}
