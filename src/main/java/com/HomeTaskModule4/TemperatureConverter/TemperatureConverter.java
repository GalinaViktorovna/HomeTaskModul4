package com.HomeTaskModule4.TemperatureConverter;

public class TemperatureConverter {
    public final static double A = 1.8000;
    public final static double B = 32;
    private double degreeInCelsius;
    private double degreeInFahrenheit;

    public double getDegreeInCelsius() {
        return degreeInCelsius;
    }

    public void setDegreeInCelsius(double degreeInCelsius) {
        this.degreeInCelsius = degreeInCelsius;
    }

    public double getDegreeInFahrenheit() {
        return degreeInFahrenheit;
    }

    public void setDegreeInFahrenheit(double degreeInFahrenheit) {
        this.degreeInFahrenheit = degreeInFahrenheit;
    }

    public double inFahrenheit(double degree) {
        return this.degreeInFahrenheit = (degree * A) + B;
    }

    public double inCelsius(double degree) {

        return this.degreeInCelsius = (degree - B) / A;
    }


}
