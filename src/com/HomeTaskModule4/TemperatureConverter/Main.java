package com.HomeTaskModule4.TemperatureConverter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Util.greatUsers();
        String data = Util.READER.readLine();
        switch (data) {
            case "YES":
                System.out.println("What do you want to convert?" +
                        " Enter please words \"CELSIUS\" or \"FAHRENHEIT\" or \"NO\"" +
                        " for exit!");
                String choose = Util.READER.readLine();
                TemperatureConverter temperatureConverter = new TemperatureConverter();

                switch (choose) {
                    case "CELSIUS":
                        System.out.println("Your degree in Fahrenheit = " + temperatureConverter.inFahrenheit(Util.readConsole()));

                    case "FAHRENHEIT":
                        System.out.println("Your degree in Celsious = " + temperatureConverter.inCelsius(Util.readConsole()));

                    case "NO":
                        System.exit(1);
                }

                break;
            case "NO":
                System.exit(1);

        }

    }
}
