package com.HomeTaskModule4.GeometricFigures;

public class Triangle extends GeometricFigure {

    public static final double VALUE = 0.5d;
    private double height;
    private double coreOfTriangle;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getCoreOfTriangle() {
        return coreOfTriangle;
    }

    public void setCoreOfTriangle(double coreOfTriangle) {
        this.coreOfTriangle = coreOfTriangle;
    }

    @Override
    public String getClassName() {
        return "Triangle";
    }

    @Override
    public String initParam() {
        return "Please enter height and core of Triangle(coma is delimiter): ";
    }

    @Override
    public double areaOfFigure() {

        return VALUE * height * coreOfTriangle;
    }
}
