package com.HomeTaskModule4.GeometricFigures;

public class Rectangle extends GeometricFigure {

    private double lengthOfFirstSide;
    private double lengthOfSecondSide;

    public double getLengthOfFirstSide() {
        return lengthOfFirstSide;
    }

    public void setLengthOfFirstSide(double lengthOfFirstSide) {
        this.lengthOfFirstSide = lengthOfFirstSide;
    }

    public double getLengthOfSecondSide() {
        return lengthOfSecondSide;
    }

    public void setLengthOfSecondSide(double lengthOfSecondSide) {
        this.lengthOfSecondSide = lengthOfSecondSide;
    }

    @Override
    public String getClassName() {
        return "Rectangle";
    }

    @Override
    public String initParam() {
        return "Please enter length of first side and length of second side of Rectangle (coma is delimiter): ";

    }

    @Override
    public double areaOfFigure() {

        return lengthOfFirstSide * lengthOfSecondSide;
    }
}
