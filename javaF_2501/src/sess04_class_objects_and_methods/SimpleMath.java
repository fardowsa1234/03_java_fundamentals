/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sess04_class_objects_and_methods;

/**
 * Java class used to perform basic arithmetic operations like addition, subtraction,
 * multiplication, division, modulus, and exponentiation.
 * 
 * @author user
 */
public class SimpleMath {

    /**
     * Returns the sum of two integers.
     * @param num1 the first integer
     * @param num2 the second integer
     * @return the sum of the two integers as a long value
     */
    public long addNums(int num1, int num2) {
        return (long) num1 + num2;
    }

    /**
     * Returns the difference of two integers.
     * @param num1 the first integer
     * @param num2 the second integer
     * @return the difference of the two integers as a long value
     */
    public long subtractNums(int num1, int num2) {
        return (long) num1 - num2;
    }

    /**
     * Returns the product of two integers.
     * @param num1 the first integer
     * @param num2 the second integer
     * @return the product of the two integers as a long value
     */
    public long multiplyNums(int num1, int num2) {
        return (long) num1 * num2;
    }

    /**
     * Returns the quotient of two integers.
     * Checks for division by zero before performing the operation.
     * @param num1 the numerator
     * @param num2 the denominator
     * @return the quotient as a double value
     */
    public double divideNums(int num1, int num2) {
        if (num2 == 0) {
            System.err.println("Error: Attempted to divide by '0'. Please use a non-zero denominator.");
            System.exit(2);
        }
        return (double) num1 / num2;
    }

    /**
     * Returns the modulus (remainder) of two integers.
     * @param num1 the first integer
     * @param num2 the second integer
     * @return the modulus of the two integers as a long value
     */
    public long getModulus(int num1, int num2) {
        return num1 % num2;
    }

    /**
     * Returns the result of raising one integer to the power of another.
     * @param num1 the base number
     * @param num2 the exponent
     * @return the exponent result as a float value
     */
    public float getExponent(int num1, int num2) {
        return (float) Math.pow(num1, num2);
    }
}
