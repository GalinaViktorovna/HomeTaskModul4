package com.HomeTaskModule4.GeometricFigures;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Util {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void startProgram() {
        System.out.println("Hello fella!\nRead me attentively!!!\nI know that you want to compute "
                + "area of Geometric figure but I must know what figure is it.\nI propose you enter name of geometric" +
                " figure( Circle or Triangle or Rectangle) or enter \"Quit\" for exit: \n");
    }
}
