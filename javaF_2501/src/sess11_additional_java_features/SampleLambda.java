
package sess11_additional_java_features;
/**
 * Functional interface for mathematical operation
 **/ 

@FunctionalInterface
interface MathOperation
{
  int operation(int num1, int num2);
}
/**
 *java program to demonstrate a functional interface, use of lambda expressions
 * for mathematical operations
 * 
 * this class performs basis arithmetic operations(addition, subtraction, multiplication
 * and division) using lambdas.
 * @author user
 */
public class SampleLambda {
    
    /**
     * Executes a mathematical operation on two numbers
     * 
     * @param num1 The first number to be used in the operation.
     * @param num2 The second number to be used in the operation.
     * @param mo The operation to be performed.
     * @return The result of the arithmetic operation
     **/
    
    private int operate (int num1, int num2, MathOperation mo)
    {
        return mo.operation(num1, num2);
    
    }
    
    // main method
    public static void main(String[] args) {

        SampleLambda sl = new SampleLambda();

        // Lambda expressions for each operation
        MathOperation sum = (num1, num2) -> num1 + num2;          // Addition
        MathOperation difference = (num1, num2) -> num1 - num2;  // Subtraction
        MathOperation product = (num1, num2) -> num1 * num2;     // Multiplication

        MathOperation quotient = (num1, num2) -> {               // Division
            if (num2 == 0)
                throw new ArithmeticException(
                    "Division by zero will give an error.\nPlease use a non-zero denominator."
                );
            return num1 / num2;
        };

        try {
            // Test executions
            System.out.println("Sum: " + sl.operate(10, 5, sum));
            System.out.println("Difference: " + sl.operate(10, 5, difference));
            System.out.println("Product: " + sl.operate(10, 5, product));
            System.out.println("Quotient: " + sl.operate(10, 5, quotient));

            // This will throw an exception
            System.out.println("Quotient: " + sl.operate(4, 0, quotient));

        } catch (ArithmeticException ae) {
            // Handle division by zero
            System.err.println("Error: " + ae.getMessage());
        }
    }
} 