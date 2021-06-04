/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Gabriel Fernandez
 */

package org.example;

// Import required libraries
import java.util.Scanner;
import java.lang.Math;

public class App 
{

    // Main function
    public static void main( String[] args )
    {
        // Exercise prompt says 350, but sample output says 360
        // so I went with 360
        final int GALLON = 360;

        // Prompt the user for length and width of the ceiling and store in a double datatype
        System.out.println("What is the length of the ceiling you want to paint (in feet)?");
        Scanner lengthInput = new Scanner(System.in);
        double length = lengthInput.nextInt();

        System.out.println("What is the width of the ceiling (in feet)?");
        Scanner widthInput = new Scanner(System.in);
        double width = widthInput.nextInt();

        // Calculate the amount of gallons needed to paint the ceiling
        double area = length * width / GALLON;

        // Print the output
        System.out.println("You will need to purchase " + Math.round(area)
                + " gallons of paint to cover " + GALLON + " square feet.");
    }
}
