package com.HomeTaskModule4.GeometricFigures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {

    public final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static GeometricFigure startProgram() throws IOException {
        System.out.println("Hello fella!\nRead me attentively!!!\nI know that you want to compute "
                + "area of Geometric figure but I must know what figure is it.\nI propose you enter name of geometric" +
                " figure( Circle or Triangle or Rectangle) or enter \"Quit\" for exit: \n");
        String[] split;

        String UsersFigure = READER.readLine();

        switch (UsersFigure) {
            case "Circle":
                Circle circle = new Circle();
                split = Util.readDateForFigure(circle);
                try {
                    circle.setRadius(Double.parseDouble(split[0]));
                } catch (NumberFormatException e) {
                    System.out.println("You enter wrong value!Must be number!");
                }
                return circle;
            case "Rectangle":
                Rectangle rectangle = new Rectangle();
                split = Util.readDateForFigure(rectangle);
                try {
                    rectangle.setLengthOfFirstSide(Double.parseDouble(split[0]));
                    rectangle.setLengthOfSecondSide(Double.parseDouble(split[1]));
                } catch (NumberFormatException e) {
                    System.out.println("You enter wrong value!Must be number!");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("You enter only one value!Try again!");
                    System.exit(1);
                }
                return rectangle;
            case "Triangle":
                Triangle triangle = new Triangle();
                split = Util.readDateForFigure(triangle);
                try {
                    triangle.setHeight(Double.parseDouble(split[0]));
                    triangle.setCoreOfTriangle(Double.parseDouble(split[1]));
                } catch (NumberFormatException e) {
                    System.out.println("You enter wrong value!Must be number!");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("You enter only one value!Try again!");
                    System.exit(1);
                }
                return triangle;

            case "Quit":
                System.exit(1);
            default:
                startProgram();

        }


        return null;
    }

    public static String[] readDateForFigure(GeometricFigure geometricFigure) throws IOException {
        System.out.println(geometricFigure.initParam());
        String input = READER.readLine();
        return input.split(",");

    }


}


