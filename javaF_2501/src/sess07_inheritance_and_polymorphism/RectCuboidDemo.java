package sess07_inheritance_and_polymorphism;

import java.util.Scanner;

/**
 * Java class to demonstrate creating rectangle and cuboid objects
 * using user input.
 * Author: user
 */
public class RectCuboidDemo {

    // main program
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Prompt the user for the dimensions of the rectangle
        
        System.out.println("Enter Rectangle Length: ");
        int rLength = sc.nextInt();

        System.out.println("Enter Rectangle Width: ");
        int rWidth = sc.nextInt();

        // Create Rectangle object
        
        Rectangle rect = new Rectangle(rLength, rWidth);
        rect.name = "Rectangle";

        System.out.println("\n--- Rectangle Details ---");
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Perimeter: " + rect.calcPerimeter());
        System.out.println("Area: " + rect.calcArea());

        // Prompt the user for the dimensions of the cuboid
        
        System.out.println("\nEnter Cuboid Length: ");
        int cLength = sc.nextInt();

        System.out.println("Enter Cuboid Width: ");
        int cWidth = sc.nextInt();

        System.out.println("Enter Cuboid Breadth: ");
        int cBreadth = sc.nextInt();

        // Create Cuboid object
        
        Cuboid cub = new Cuboid(cLength, cWidth, cBreadth);

        System.out.println("\n--- Cuboid Details ---");
        System.out.println("Length: " + cub.getLength());
        System.out.println("Width: " + cub.getWidth());
        System.out.println("Breadth: " + cub.getBreadth());
        System.out.println("Surface Area: " + cub.calcSurfaceArea());
        System.out.println("Volume: " + cub.calcVolume());
    }
}
