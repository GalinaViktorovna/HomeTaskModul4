package com.HomeTaskModule4.GeometricFigures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Util {

    public final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void startProgram() throws IOException {
        System.out.println("Hello fella!\nRead me attentively!!!\nI know that you want to compute "
                + "area of Geometric figure but I must know what figure is it.\nI propose you enter name of geometric" +
                " figure( Circle or Triangle or Rectangle) or enter \"Quit\" for exit: \n");
        double[] split;

        String UsersFigure = READER.readLine();

        switch (UsersFigure) {
            case "Circle":
                Circle circle = new Circle();
                split = Util.readDateForFigure(circle);
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
                split = Util.readDateForFigure(rectangle);
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
                split = Util.readDateForFigure(triangle);
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
            default:
                startProgram();

        }

    }

    public static double[] readDateForFigure(GeometricFigure geometricFigure) throws IOException {
        System.out.println(geometricFigure.initParam());
        String input = READER.readLine();
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


