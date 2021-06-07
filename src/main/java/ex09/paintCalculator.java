/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Connor Stanley
 */


package ex09;

import java.util.Scanner;
import java.lang.Math;

public class paintCalculator {

    static final double CONVERSION_RATE = 350;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Asking for input
        System.out.print("What is the length of the ceiling in feet? ");
        String ceilingLength = in.nextLine();
        System.out.print("What is the width of the ceiling in feet? ");
        String ceilingWidth = in.nextLine();


        // Numerical Conversion from string to type int
        double length = Double.parseDouble(ceilingLength);
        double width = Double.parseDouble(ceilingWidth);


        // Variables for the ceiling area and precise ratio of which to round up
        double ceilingArea = length * width;
        double gallons = ceilingArea / CONVERSION_RATE;

        // IF-statement that uses mod to detect a whole number and round up accordingly
        if (gallons % 1 != 0){
            Math.ceil(gallons);
        }
        System.out.print(gallons + "\n");


        // Output
        System.out.print("You will need to purchase " + gallons + " of paint to cover " + ceilingArea + " square feet.");
    }

}