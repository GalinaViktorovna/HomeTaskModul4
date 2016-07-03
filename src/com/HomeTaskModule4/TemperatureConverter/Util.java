package com.HomeTaskModule4.TemperatureConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public void greatUsers() throws IOException {
        System.out.println("Hi!!!\nIf you want to turn on Converter enter \"YES\" or \"NO\"" +
                " for exit");
        String data = READER.readLine();
        switch (data) {
            case "YES":
                System.out.println("What do you want to convert?" +
                        " Enter please words \"CELSIUS\" or \"FAHRENHEIT\" or \"NO\"" +
                        " for exit!");
                System.out.println(converter());
                break;
            case "NO":
                System.exit(1);
            default:
                System.out.println("You enter wrong value!Try again!!!");
                greatUsers();


        }
    }

    public String converter() throws IOException {
        String choose = READER.readLine();
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        switch (choose) {
            case "CELSIUS":
                return "Your degree in Fahrenheit = " + temperatureConverter.inFahrenheit(readConsole());

            case "FAHRENHEIT":
                return "Your degree in Celsious = " + temperatureConverter.inCelsius(readConsole());

            case "NO":
                System.exit(1);
            default:
                System.out.println("You enter wrong value!Try again!!!");
                System.out.printf(converter());
                break;

        }
        return null;
    }

    public double readConsole() throws IOException {
        try {
            System.out.println("Enter your value please: ");
            return Double.parseDouble(READER.readLine());

        } catch (NumberFormatException e) {
            System.out.println("Wrong value!Enter please number!");
            readConsole();

        }
        return 0;
    }
}
