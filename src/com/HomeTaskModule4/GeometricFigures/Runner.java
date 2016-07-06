package com.HomeTaskModule4.GeometricFigures;

import java.io.IOException;

public class Runner {


    public static void main(String[] args) throws IOException {
        Util.startProgram();
        double[] split;
        String UsersFigure = Util.READER.readLine();
        switch (UsersFigure) {
            case "Circle":
                Circle circle = new Circle();
                split = readDateForFigure(circle);
                try {
                    circle.setRadius((split[0]));
                    System.out.println(circle);

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("You enter deficiency value!Try again!");
                    System.exit(1);
                }
                break;

            case "Rectangle":
                Rectangle rectangle = new Rectangle();
                split = Runner.readDateForFigure(rectangle);
                try {
                    rectangle.setLengthOfFirstSide(split[0]);
                    rectangle.setLengthOfSecondSide(split[1]);
                    System.out.println(rectangle);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("You enter only one value!Try again!");
                    System.exit(1);
                }
                break;

            case "Triangle":
                Triangle triangle = new Triangle();
                split = Runner.readDateForFigure(triangle);
                try {
                    triangle.setHeight(split[0]);
                    triangle.setCoreOfTriangle(split[1]);
                    System.out.println(triangle);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("You enter deficiency value!Try again!");
                    System.exit(1);
                }
                break;

            case "Quit":
                System.exit(1);

        }

    }

    public static double[] readDateForFigure(GeometricFigure geometricFigure) throws IOException {
        System.out.println(geometricFigure.initParam());
        String input = Util.READER.readLine();
        String[] s = input.split(",");
        double[] mass = new double[s.length];
        try {
            for (int i = 0; i < s.length; i++) {
                mass[i] = Double.parseDouble(s[i]);

            }
        } catch (NumberFormatException e) {
            System.out.println("You enter wrong value!Try again!");
            System.exit(1);
        }
        return mass;
    }
}

