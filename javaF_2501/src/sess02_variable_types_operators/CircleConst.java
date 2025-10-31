/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sess02_variable_types_operators;

import java.util.Scanner;

/**
 * java program to demonstrate the concept of constants and class variables
 * @author user
 */
public class CircleConst {
    // class field constant to hold the value of PI
    static final float MYPI = 3.1415923f; // or MYPI = 22/7.0f

    // class field variable to hold the input variable
    static Scanner sc;

    // main method begins program execution
    public static void main(String[] args) {
        // method variables to be used in the program
        float radius, area, circumference;

        // instantiate the class variable for user input
        sc = new Scanner(System.in);

        // Read in the radius from the user
        System.out.println("Please enter the radius of the circle in cm and I'll tell you its area and circumference:");
        radius = sc.nextFloat();
        sc.close(); // close the input stream

        // calculate the area and circumference
        area = (float) (MYPI * Math.pow(radius, 2));
        circumference = MYPI * (radius * 2);

        // Display the circle's dimensions
        System.out.println("Circle's Dimensions");
        System.out.println("-".repeat(50));
        System.out.printf("%-15s : %7.1f\n", "Radius", radius);
        System.out.printf("%-15s : %7.1f\n", "Area", area);
        System.out.printf("%-15s : %7.1f\n", "Circumference", circumference);
        System.out.println("-".repeat(50));
    }
}