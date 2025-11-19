
package sess03_selection_and_iteration;

/**
 *java program to demonstrate the if, while, do..while loops to display the first
 * ten integers
 * @author user
 */
public class LoopsFirstTenInts {
    // main program
    public static void main(String[] args) {
        // variable to be used
        int n;
        System.out.println("First ten integers using for loop");
        for (n =1; n <= 10; n++)
            System.out.printf("%02d\n", n);
        
        System.out.println("First ten integers using while loop");
        n = 1; // re-assign n to 1
        while(n <= 10)
        {
          System.out.printf("%02d\n", n);
        }
        
         System.out.println("First ten integers using do...while loop");
         do
         {
             System.out.printf("%02d\n", n);
             n++;
         
         }while(n <= 10);
            
    }
}
