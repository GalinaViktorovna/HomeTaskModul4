package com.HomeTaskModule4.TemperatureConverter;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Util {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void greatUsers() {
        System.out.println("Hi!!!\nIf you want to turn on Converter enter \"YES\" or \"NO\"" +
                " for exit");
    }

    public static double readConsole() throws IOException {
        try {
            System.out.println("Enter your value please: ");
            return Double.parseDouble(Util.READER.readLine());

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Wrong value!Enter please number!");

        }
    }
}
