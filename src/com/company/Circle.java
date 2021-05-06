package com.company;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }



    public double  area(){
        return Math.abs(3.14 * Math.pow(this.radius, 2));
    }

    public double circumference () {
        return Math.abs(2 * 3.14 * this.radius);
    }
}
