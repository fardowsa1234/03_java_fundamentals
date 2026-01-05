package sess11_additional_java_features;

import java.util.function.IntBinaryOperator;

/**
 * Java program that demonstrates how to call a simple static method in:
 * 1) Pre-Java 8 style (direct call)
 * 2) Java 8 lambda expression
 * 3) Java 8 method reference (ClassName::methodName)
 */
public class MethodReferenceDemo {

    // simple static method
    public static int addTwoNums(int num1, int num2) {
        return num1 + num2;
    }

    // main method
    public static void main(String[] args) {

        //================================
        // 1: Pre-Java 8 approach
        //================================
        int sum1 = MethodReferenceDemo.addTwoNums(5, 3);
        System.out.println("Directly calling 'addTwoNums()' to add 5 and 3 "
                + "gives: " + sum1);

        //================================
        // 2: Java 8 lambda approach
        //================================
        // IntBinaryOperator takes two ints and returns an int
        IntBinaryOperator lambdaAddition =
                (num1, num2) -> MethodReferenceDemo.addTwoNums(num1, num2);

        int sum2 = lambdaAddition.applyAsInt(20, 10);
        System.out.println("Using lambda for 'addTwoNums()' to add 20 and 10 "
                + "gives: " + sum2);

        //================================
        // 3: Java 8+ method reference
        //================================
        // Cleaner version of the lambda above
        //instead of writing (n,a) --> addTwoNums(n,a)
        //java lets us 'refer' to the method directly:
        //                       ClassName::methodName
        IntBinaryOperator referenceAddition = MethodReferenceDemo::addTwoNums;

        int sum3 = referenceAddition.applyAsInt(4, 3);
        System.out.println("Using method reference for 'addTwoNums()' to add 4 and 3 "
                + "gives: " + sum3);
    }
}
