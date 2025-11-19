/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sess03_selection_and_iteration;

import java.util.Scanner;

/**
 * java program to demonstrate the various selection/decision/conditional
 * constructs
 *
 * @author user
 */
public class javaDecisionContructs {

    // class variable to be used for user input
    static Scanner sc = new Scanner(System.in);

    // main method begins program execution
    public static void main(String[] args) {

        float temperature;
        String password = "";

        // Temperature input
        System.out.println("Please enter today's temperature in degrees:");
        temperature = Float.parseFloat(sc.nextLine());

        // 1. if
        if (temperature > 25.0f) {
            System.out.println("Hurray 🎊🎊, it's a warm day, let's head to the beach!");
        }

        if (password.equals("")) {
            System.out.println("Please enter your password");
        }

        // 2. if...else (Odd/Even)
        System.out.println("Please enter a number and I'll tell you if it's odd or even ->");
        int userNum = Integer.parseInt(sc.nextLine());

        if (userNum % 2 == 1) {
            System.out.printf("\n%d is an odd number!", userNum);
        } else {
            System.out.printf("\n%d is an even number!", userNum);
        }

        // Pass/Fail
        System.out.println("\nPlease enter the student's score in the exam ->");
        int score = Integer.parseInt(sc.nextLine());

        if (score >= 40) {
            System.out.printf("\nCongratulations! With a score of %d, you've passed the exam!", score);
        } else {
            System.out.printf("\nUnfortunately with a score of %d, you've failed the exam!", score);
        }

        // 3. if..else if..else (Grading System)
        if (score >= 70 && score <= 100) {
            System.out.printf("\nWith a score of %d, you got grade 'A'", score);
        } else if (score >= 60) {
            System.out.printf("\nWith a score of %d, you got grade 'B'", score);
        } else if (score >= 50) {
            System.out.printf("\nWith a score of %d, you got grade 'C'", score);
        } else if (score >= 40) {
            System.out.printf("\nWith a score of %d, you got grade 'D'", score);
        } else {
            System.out.printf("\nWith a score of %d, you got grade 'E'", score);
        } // end grading if/else-if chain

        // 4. switch... case
        // Check if a day of the week is a weekday or weekend
        System.out.println("\nPlease enter the day of the week -> ");
        String day = sc.nextLine().trim().toLowerCase();
        // Read in, remove whitespace and convert to lowercase for case-insensitive comparison

        // Java <17 classic switch ... case
        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("\n" + capitalize(day) + " is a weekday.");
                break;

            case "saturday":
            case "sunday":
                System.out.println("\n" + capitalize(day) + " is on a weekend.");
                break;

            default:
                System.out.println("Sorry, \"" + day + "\" is not a valid day of the week.");
                System.exit(0); // Terminate the program
        }

        sc.close();
    } // end main

    private static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
} // end class
