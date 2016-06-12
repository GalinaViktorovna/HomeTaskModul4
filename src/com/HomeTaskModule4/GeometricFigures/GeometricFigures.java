package com.HomeTaskModule4.GeometricFigures;

public class GeometricFigures {

    private static double area(double a, double b, double c) {
        System.out.print("It is triangle!!! Area is ");
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private static double area(double a, double b) {
        System.out.print("It is rectangle!!! Area is ");
        return a * b;
    }

    private static double area(double a) {
        System.out.print("It is circle!!! Area is ");
        return Math.PI * (a * a);
    }

    public static void main(String[] args) {
        System.out.println(GeometricFigures.area(3, 3, 3));
        System.out.println(GeometricFigures.area(3, 3));
        System.out.println(GeometricFigures.area(3));
    }
}
