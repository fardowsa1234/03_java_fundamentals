/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sess02_variable_types_operators;

import java.util.Scanner;

/**
 *java program that accepts the temperature in degree Celcius and 
 * converts it to degrees Fahrenheit
 * @author Fardowsa
 */
public class TempConverter {
    // main method begins program execution
    public static void main(String [] args)
    {
       // TODO: Complete the program 
        
        // FORMULA  °F=(°C×5/9​)+32
        
        // Variables to be used in the program
        float celsius, fahrenheit;

        // Create a Scanner object for user input
         Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the temperature
        System.out.print("Enter temperature in degrees Celsius: ");
        celsius = sc.nextFloat();

        // close the input stream
        sc.close();

        // Convert Celsius to Fahrenheit
        fahrenheit = (celsius * 9 / 5) + 32;

        // Display result
        System.out.printf("%.2f°C = %.2f°F\n", celsius, fahrenheit);
    
    
    }
    
    
}