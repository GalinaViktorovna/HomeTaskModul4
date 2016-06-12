package com.HomeTaskModule4.TemperatureConverter;

public class TemperatureConverter {
    final static double A = 1.8;
    final static double B = 32;
    private static double inFahrenheit(double degree){
        double result = (degree*A)+B;
        return result;
    }
    private static double inCelsius  (double degree){
        double result = (degree - B)/A;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(TemperatureConverter.inFahrenheit(36));
        System.out.println(TemperatureConverter.inCelsius(115));
    }


}
