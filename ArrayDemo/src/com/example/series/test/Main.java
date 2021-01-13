package com.example.series.test;

public class Main {

    public static void main(String[] args) {
        System.out.println(rectangleInCircle(5, 9, 5));

    }

    private static boolean rectangleInCircle(double w,double h,double r) {

        double hypotenuse = Math.sqrt((h*h) + (w*w));
        if(hypotenuse/2 > r){
            return false;
        } else {
            return true;
        }


    }

//    private double height;
//    private double width;
//    private double hypotenuse;
//    private boolean rectangleCanFit;
//    private double radius;
//
//    public double calulateRectangleHypotenuse(double h, double w){
//        this.hypotenuse = Math.sqrt((h*h) + (w*w));
//
//        return hypotenuse;
//    }
}
