package com.HomeTaskModule4.GeometricFigures;

import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException {

        GeometricFigure figure = Util.startProgram();
        System.out.println(figure.toString());

    }
}
