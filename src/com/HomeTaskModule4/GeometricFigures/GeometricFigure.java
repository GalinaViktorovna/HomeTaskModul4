package com.HomeTaskModule4.GeometricFigures;

public abstract class GeometricFigure {

    public abstract String getClassName();

    public abstract String initParam();

    public abstract double areaOfFigure();

    @Override
    public String toString() {
        return "Great!!!\nArea of your " + getClassName() + " = " + areaOfFigure() +
                ".\nGood luck, dude!:)";
    }

}
