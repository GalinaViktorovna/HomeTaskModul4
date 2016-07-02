package com.HomeTaskModule4.GeometricFigures;

public class Circle extends GeometricFigure {

    private double radius;
    public final static double PI = Math.PI;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getClassName() {
        return "Circle";
    }

    @Override
    public String initParam() {
        return "Please enter radius: ";
    }

    @Override
    public double areaOfFigure() {
        return PI * radius * radius;
    }
}
