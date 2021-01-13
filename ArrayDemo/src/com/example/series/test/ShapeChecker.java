package com.example.series.test;

public class ShapeChecker {

    private double height;
    private double width;
    private double hypotenuse;
    private double radius;

    public double calulateRectangleHypotenuse(double h, double w){
        this.hypotenuse = Math.sqrt((h*h) + (w*w));

        return hypotenuse;
    }

}
