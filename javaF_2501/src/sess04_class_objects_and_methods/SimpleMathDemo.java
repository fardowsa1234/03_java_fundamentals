package sess04_class_objects_and_methods;

import java.util.Scanner;

public class SimpleMathDemo {
    static Scanner sc = new Scanner(System.in);

    // main method
    public static void main(String[] args) {
        // prompt the user for the values to be used in the program
        System.out.print("Please enter the first number to be used in the calculation ---> ");
        int firstNum = sc.nextInt();

        System.out.print("Please enter the second number to be used in the calculation ---> ");
        int secondNum = sc.nextInt();

        // declare and instantiate a SimpleMath object
        SimpleMath sm = new SimpleMath();

        // perform the various arithmetic operations
        long sum = sm.addNums(firstNum, secondNum);
        long difference = sm.subtractNums(firstNum, secondNum);
        long product = sm.multiplyNums(firstNum, secondNum);
        double quotient = sm.divideNums(firstNum, secondNum);
        float exponent = sm.getExponent(firstNum, secondNum);
        long remainder = sm.getModulus(firstNum, secondNum);

        // display the results of the arithmetic operations
        System.out.println("-".repeat(50));
        System.out.println("Results of various arithmetic operations");
        System.out.println("-".repeat(50));

        System.out.printf("%d + %d = %d%n", firstNum, secondNum, sum);
        System.out.printf("%d - %d = %d%n", firstNum, secondNum, difference);
        System.out.printf("%d x %d = %d%n", firstNum, secondNum, product);
        System.out.printf("%d / %d = %.2f%n", firstNum, secondNum, quotient);
        System.out.printf("%d ^ %d = %.2f%n", firstNum, secondNum, (double) exponent);
        System.out.printf("%d %% %d = %d%n", firstNum, secondNum, remainder);
    }
}
