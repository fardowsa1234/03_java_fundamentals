
package sess03_selection_and_iteration;

/**
 *java program that displays the even numbers between 20 - 50 using a for loop
 * and the continue keyword
 * @author user
 */
public class EvenNumbersContinue {
    // main program 
    public static void main(String[] args) {

        System.out.println("Even numbers between 20 and 50:\n");

        for (int n = 20; n <= 50; n++) {

            // If number is odd skip it
            if (n % 2 != 0) {
                continue;
            }

            // Only even numbers reach here
            System.out.print(n + " ");
        }

        System.out.println("\n\nDone "); 
    }

    
}
