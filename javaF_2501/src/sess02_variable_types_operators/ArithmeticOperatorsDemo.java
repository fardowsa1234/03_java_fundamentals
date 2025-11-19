/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sess02_variable_types_operators;

/**
 *
 * @author user
 */
public class ArithmeticOperatorsDemo {
   public static void main(String[] args) {
       System.out.println("=".repeat(62));
       System.out.println("      JAVA ARITHMETIC OPERATORS DEMONSTRATION");
       System.out.println("=".repeat(62));
       System.out.println();
       
       
       // Variables to be used in the program
       int a = 10, b = 3;
       double x = 10.5, y = 3.0;
       
       
       // 1. Basic arithmetic operators: +, -, *, /, %
       System.out.println("1. BASIC ARITHMETIC OPERATORS");
       System.out.println("=".repeat(62));
       System.out.printf("%-25s %d + %d = %d%n", "Integer Addition:", a, b, a + b);
       System.out.printf("%-25s %.2f + %.2f = %.2f%n%n", "Double Addition:", x, y, x + y);
       System.out.printf("%-25s %d - %d = %d%n", "Integer Subtraction:", a, b, a - b);
       System.out.printf("%-25s %.2f - %.2f = %.2f%n%n", "Double Subtraction:", x, y, x - y);
       System.out.printf("%-25s %d * %d = %d%n", "Integer Multiplication:", a, b, a * b);
       System.out.printf("%-25s %.2f * %.2f = %.2f%n%n", "Double Multiplication:", x, y, x * y);
       System.out.printf("%-25s %d / %d = %d%n", "Integer Division:", a, b, a / b);
       System.out.printf("%-25s %.2f / %.2f = %.2f%n%n", "Double Division:", x, y, x / y);
       System.out.printf("%-25s %d %% %d = %d%n", "Integer Modulus:", a, b, a % b);
       System.out.printf("%-25s %.2f %% %.2f = %.2f%n%n", "Double Modulus:", x, y, x % y);
       
       
       
       // 2. Unary operators: ++ and --
       
       System.out.println("2. UNARY OPERATORS (++ and --)");
       System.out.println("=".repeat(62));
       int num = 5;
       System.out.printf("Initial value: num = %d%n", num);
       
       // Pre-increment
       System.out.printf("Pre-increment (++num): %d%n", ++num); // num = 6
       
       // Post-increment
       System.out.printf("Post-increment (num++): %d%n", num++); // prints 6, then num = 7
       System.out.printf("After post-increment, num = %d%n%n", num);
       
       // Pre-decrement
       System.out.printf("Pre-decrement (--num): %d%n", --num); // num = 6
       
       // Post-decrement
       System.out.printf("Post-decrement (num--): %d%n", num--); // prints 6, then num = 5
       System.out.printf("After post-decrement, num = %d%n%n", num);
       
       // 3. Compound assignment operators: +=, -=, *=, /=, %=
       
       System.out.println("3. COMPOUND ASSIGNMENT OPERATORS");
       System.out.println("=".repeat(62));
       int num2 = 20;
       System.out.println("Initial value of num2: " + num2);
       num2 += 5; // same as num2 = num2 + 5
       
       System.out.println("After += 5, num2 = " + num2);
       num2 -= 3; // same as num2 = num2 - 3
       
       System.out.println("After -= 3, num2 = " + num2);
       num2 *= 2; // same as num2 = num2 * 2
       
       System.out.println("After *= 5, num2 = " + num2);
       num2 /= 4; // same as num2 = num2 / 4
       
       System.out.println("After /= 4, num2 = " + num2);
       num2 %= 6; // same as num2 = num2 % 6
       
       System.out.println("After %= 6, num2 = " + num2);
       System.out.println();
       System.out.println("=".repeat(62));
       System.out.println("         END OF ARITHMETIC OPERATORS DEMO");
       System.out.println("=".repeat(62));
   }
} 