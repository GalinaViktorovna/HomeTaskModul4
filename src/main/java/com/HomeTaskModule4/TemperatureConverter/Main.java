package com.HomeTaskModule4.TemperatureConverter;

import com.HomeTaskModule4.DistanceBetweenPoints.AnswerEnumClass;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, IllegalArgumentException {
        Boolean value = true;
        while (value) {
            Util.greatUsers();
            String data = Util.READER.readLine();
            try {
                AnswerEnumClass.ANSWER answer = AnswerEnumClass.ANSWER.valueOf(data);

                switch (answer) {
                    case YES:
                        System.out.println("What do you want to convert?" +
                                " Enter please words \"CELSIUS\" or \"FAHRENHEIT\" or \"NO\"" +
                                " for exit!");
                        String choose = Util.READER.readLine();
                        TemperatureConverter temperatureConverter = new TemperatureConverter();
                        ScalaOfDegreeEnum.SCALA_ENUM scala_enum = ScalaOfDegreeEnum.SCALA_ENUM.valueOf(choose);
                        value = false;
                        switch (scala_enum) {
                            case CELSIUS:
                                System.out.println("Your degree in Fahrenheit = " + temperatureConverter.inFahrenheit(Util.readConsole()));
                                value = false;
                                break;
                            case FAHRENHEIT:
                                System.out.println("Your degree in Celsius = " + temperatureConverter.inCelsius(Util.readConsole()));
                                value = false;
                                break;
                            case NO:
                                System.exit(1);
                        }

                        break;
                    case NO:
                        System.exit(1);


                }
            } catch (IllegalArgumentException e) {
                System.out.println("Sorry!You enter wrong value");
            }

        }
    }
}
