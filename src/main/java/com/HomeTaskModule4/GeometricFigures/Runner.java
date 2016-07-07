package com.HomeTaskModule4.GeometricFigures;

import java.io.IOException;

public class Runner {


    public static void main(String[] args) throws IOException {


        Boolean s = true;
        double[] split;
        while (s) {
            try {


                Util.startProgram();
                String usersFigure = Util.READER.readLine();
                FigureEnum.FIGURE figure = FigureEnum.FIGURE.valueOf(usersFigure);


                switch (figure) {
                    case CIRCLE:
                        Circle circle = new Circle();
                        split = readDateForFigure(circle);
                        try {
                            circle.setRadius((split[0]));
                            System.out.println(circle);
                            s = false;

                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("You enter deficiency value!Try again!");
                            System.exit(1);
                        }
                        break;

                    case RECTANGLE:
                        Rectangle rectangle = new Rectangle();
                        split = Runner.readDateForFigure(rectangle);
                        try {
                            rectangle.setLengthOfFirstSide(split[0]);
                            rectangle.setLengthOfSecondSide(split[1]);
                            System.out.println(rectangle);
                            s = false;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("You enter only one value!Try again!");
                            System.exit(1);
                        }
                        break;

                    case TRIANGLE:
                        Triangle triangle = new Triangle();
                        split = Runner.readDateForFigure(triangle);
                        try {
                            triangle.setHeight(split[0]);
                            triangle.setCoreOfTriangle(split[1]);
                            System.out.println(triangle);
                            s = false;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            System.out.println("You enter deficiency value!Try again!");
                            System.exit(1);
                        }
                        break;

                    case QUIT:
                        System.exit(1);

                }

            } catch (IllegalArgumentException e) {
                System.out.println("Sorry!You enter wrong value");
            }
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
            return mass;
        } catch (NumberFormatException e) {
            throw new NumberFormatException("You enter wrong value!Try again!");
        }

    }
}

