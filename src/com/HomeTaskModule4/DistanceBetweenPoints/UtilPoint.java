package com.HomeTaskModule4.DistanceBetweenPoints;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UtilPoint {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public double dataRead() throws IOException {
        try {
            return Double.parseDouble(READER.readLine());

        } catch (NumberFormatException e) {
            System.out.println("You enter wrong value!Must be number!Try again.");
            dataRead();
        }
        return 0;
    }

    public void greetUser() {

        System.out.println("Hello Dear Friend!\n" +
                "You want to know Distance between points.I can help you.\n" +
                "If you want to go on enter \"YES\" and \"NO\" for exit!");
    }

    public void createPoints() throws IOException {
        String answer = READER.readLine();
        switch (answer) {
            case "YES":
                X x = new X();
                Y y = new Y();
                System.out.println("Enter points in order x1,x2,y1,y2(enter is delimiter)");
                x.setX1(dataRead());
                x.setX2(dataRead());
                y.setY1(dataRead());
                y.setY2(dataRead());
                distance(x.getX1(), x.getX2(), y.getY1(), y.getY2());
                break;

            case "NO":
                System.exit(1);
            default:
                greetUser();
                createPoints();
        }
    }

    public void distance(double x1, double x2, double y1, double y2) {
        double result = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.println("You distance = " + result);
    }
}

