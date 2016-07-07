package com.HomeTaskModule4.DistanceBetweenPoints;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException, IllegalArgumentException {
        Boolean value = true;
        while (value) {
            try {
                UtilPoint.greetUser();
                String answer = UtilPoint.READER.readLine();
                AnswerEnumClass.ANSWER answerEnum = AnswerEnumClass.ANSWER.valueOf(answer);
                switch (answerEnum) {
                    case YES:
                        Coordinate coordinate = new Coordinate();
                        System.out.println("Enter points in order x1,x2,y1,y2(enter is delimiter)");
                        coordinate.setX1(UtilPoint.dataRead());
                        coordinate.setX2(UtilPoint.dataRead());
                        coordinate.setY1(UtilPoint.dataRead());
                        coordinate.setY2(UtilPoint.dataRead());
                        coordinate.distance();
                        value = false;
                        break;

                    case NO:
                        System.exit(1);

                }
            } catch (IllegalArgumentException e) {
                System.out.println("Sorry!You enter wrong value!Try again!");
            }
        }
    }
}




