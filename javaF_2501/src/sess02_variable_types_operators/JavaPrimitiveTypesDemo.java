/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sess02_variable_types_operators;

/**
 *
 * @author user
 */
public class JavaPrimitiveTypesDemo {
   public static void main(String[] args) {
       System.out.println("=======================================");
       System.out.println("   JAVA PRIMITIVE DATA TYPES DEMONSTRATION");
       System.out.println("=======================================\n");
       // 1. Declare variables for each primitive type
       byte byteVar = 0;
       short shortVar = 0;
       int intVar = 0;
       long longVar = 0L;
       float floatVar = 0.0f;
       double doubleVar = 0.0;
       char charVar = '\u0000';
       boolean boolVar = false;
       // 2. Display declared variables and their default values
       System.out.println("1. DECLARED VARIABLES AND THEIR DEFAULT VALUES");
       System.out.println("--------------------------------------------------");
       System.out.printf("%-10s %-15s %-15s%n", "Type", "Variable", "Default Value");
       System.out.println("--------------------------------------------------");
       System.out.printf("%-10s %-15s %-15d%n", "byte", "byteVar", byteVar);
       System.out.printf("%-10s %-15s %-15d%n", "short", "shortVar", shortVar);
       System.out.printf("%-10s %-15s %-15d%n", "int", "intVar", intVar);
       System.out.printf("%-10s %-15s %-15d%n", "long", "longVar", longVar);
       System.out.printf("%-10s %-15s %-15.2f%n", "float", "floatVar", floatVar);
       System.out.printf("%-10s %-15s %-15.2f%n", "double", "doubleVar", doubleVar);
       System.out.printf("%-10s %-15s %-15s (Unicode: U+%04X)%n", "char", "charVar", charVar, (int) charVar);
       System.out.printf("%-10s %-15s %-15b%n", "boolean", "boolVar", boolVar);
       System.out.println("\n");
       // 3. Display the size of each primitive type in bytes
       System.out.println("2. SIZE OF EACH PRIMITIVE TYPE IN BYTES");
       System.out.println("-------------------------------------------");
       System.out.printf("%-10s %-15s%n", "Type", "Size (bytes)");
       System.out.println("-------------------------------------------");
       System.out.printf("%-10s %-15d%n", "byte", Byte.BYTES);
       System.out.printf("%-10s %-15d%n", "short", Short.BYTES);
       System.out.printf("%-10s %-15d%n", "int", Integer.BYTES);
       System.out.printf("%-10s %-15d%n", "long", Long.BYTES);
       System.out.printf("%-10s %-15d%n", "float", Float.BYTES);
       System.out.printf("%-10s %-15d%n", "double", Double.BYTES);
       System.out.printf("%-10s %-15d%n", "char", Character.BYTES);
       System.out.printf("%-10s %-15s%n", "boolean", "1 bit (JVM-dependent)");
       System.out.println("\n");
       // 4. Display minimum and maximum values
       System.out.println("3. MINIMUM & MAXIMUM VALUES FOR EACH PRIMITIVE TYPE");
       System.out.println("--------------------------------------------------------------");
       System.out.printf("%-10s %-25s %-25s%n", "Type", "Minimum Value", "Maximum Value");
       System.out.println("--------------------------------------------------------------");
       System.out.printf("%-10s %-25d %-25d%n", "byte", Byte.MIN_VALUE, Byte.MAX_VALUE);
       System.out.printf("%-10s %-25d %-25d%n", "short", Short.MIN_VALUE, Short.MAX_VALUE);
       System.out.printf("%-10s %-25d %-25d%n", "int", Integer.MIN_VALUE, Integer.MAX_VALUE);
       System.out.printf("%-10s %-25d %-25d%n", "long", Long.MIN_VALUE, Long.MAX_VALUE);
       System.out.printf("%-10s %-25e %-25e%n", "float", Float.MIN_VALUE, Float.MAX_VALUE);
       System.out.printf("%-10s %-25e %-25e%n", "double", Double.MIN_VALUE, Double.MAX_VALUE);
       System.out.printf("%-10s U+%04X to U+%04X%n", "char", (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
       System.out.printf("%-10s %-25s %-25s%n", "boolean", "false", "true");
       System.out.println("\n=======================================");
       System.out.println("   END OF JAVA PRIMITIVE DATA TYPES DEMO");
       System.out.println("=======================================");
   }
}