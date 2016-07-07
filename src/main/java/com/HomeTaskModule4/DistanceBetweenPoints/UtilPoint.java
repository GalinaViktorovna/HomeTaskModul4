package com.HomeTaskModule4.DistanceBetweenPoints;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UtilPoint {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void greetUser() {

        System.out.println("Hello Dear Friend!\n" +
                "You want to know Distance between points.I can help you.\n" +
                "If you want to go on enter \"YES\" and \"NO\" for exit!");
    }

    public static double dataRead() throws IOException {
        try {
            return Double.parseDouble(READER.readLine());

        } catch (NumberFormatException e) {
            throw new NumberFormatException("You enter wrong value!Must be number!Try again.");
        }
    }
}


