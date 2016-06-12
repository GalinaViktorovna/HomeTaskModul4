package com.HomeTaskModule4.DistanceBetweenPoints;

public class DistanceBetweenPoints {
    private static double distance(double x1,double x2,double y1, double y2){
        double result = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

        return result;

    }

    public static void main(String[] args) {
        System.out.println(DistanceBetweenPoints.distance(2,3,4,2));
    }
}
