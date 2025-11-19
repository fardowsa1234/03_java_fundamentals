// Java program to demonstrate single dimensional array using user's rating of a product
package sess05_strings_and_arrays;

import java.util.Scanner;

public class SingleDimArray {

    // main method begins program execution
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of ratings: ");
        int n = input.nextInt(); // variable to hold number of ratings

        // integer array to hold user's ratings of a product
        int[] userRating = new int[n];

        // integer variable to hold the total of all ratings given
        int totalRating = 0;

        // float variable to hold the mean/avg. rating
        float meanRating;

        // use a for loop to input and calculate total rating
        for (int i = 0; i < userRating.length; i++) {
            System.out.print("Enter rating " + (i + 1) + " (1–5): ");
            userRating[i] = input.nextInt();
            totalRating += userRating[i];
        }

        // calculate the mean/avg. rating
        meanRating = (float) totalRating / userRating.length;

        // display all ratings
        System.out.println("\nAll product ratings are:");
        for (int i = 0; i < userRating.length; i++) {
            System.out.println("Rating " + (i + 1) + ": " + userRating[i]);
        }

        // display average rating
        // display average rating
System.out.printf(
    "\nThe total rating is %d and the main rating is %.2f\n out of 5.\n",
    totalRating, meanRating
);

        input.close();
    }
}
