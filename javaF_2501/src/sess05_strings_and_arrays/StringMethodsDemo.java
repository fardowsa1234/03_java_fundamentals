package sess05_strings_and_arrays;
/**
* The {@code StringMethodsDemo} class demonstrates some commonly used methods
* of the {@link java.lang.String} class in Java.
*
* @author a.n.
*/
public class StringMethodsDemo {
   // main method begins program execution
   public static void main(String[] args) {
       // Sample strings
       String s1 = "Java", s2 = "programming";
       String s3 = "hamburger", s4 = "urge";
       String s5 = "   Hello World   ";
       System.out.println("---------- STRING CLASS METHODS DEMO ----------");
       // 1. length()
       System.out.println("\n1. length()");
       System.out.println("\"" + s1 + "\" has " + s1.length() + " characters.");
       System.out.println("\"" + s2 + "\" has " + s2.length() + " characters.");
       // 2. charAt()
       System.out.println("\n2. charAt()");
       System.out.println("The first character of \"" + s3 + "\" is " + s3.charAt(0));
       System.out.println("The 4th character of \"" + s3 + "\" is " + s3.charAt(3));
       // 3. substring()
       System.out.println("\n3. substring()");
       System.out.println("Substring of \"" + s3 + "\" from index 4: " + s3.substring(4));
       System.out.println("Substring from index 0 to 4: " + s3.substring(0, 4));
       // 4. indexOf()
       System.out.println("\n4. indexOf()");
       System.out.println("Index of 'b' in \"" + s3 + "\": " + s3.indexOf('b'));
       System.out.println("Index of \"gram\" in \"" + s2 + "\": " + s2.indexOf("gram"));
       // 5. equals() and equalsIgnoreCase()
       System.out.println("\n5. equals() and equalsIgnoreCase()");
       System.out.println("\"Java\" equals \"java\"? " + s1.equals("java"));
       System.out.println("\"Java\" equalsIgnoreCase \"java\"? " + s1.equalsIgnoreCase("java"));
       // 6. compareTo()
       System.out.println("\n6. compareTo()");
       System.out.println("\"apple\" compared to \"banana\": " + "apple".compareTo("banana"));
       System.out.println("\"Java\" compared to \"Java\": " + s1.compareTo("Java"));
       // 7. toUpperCase() / toLowerCase()
       System.out.println("\n7. toUpperCase() and toLowerCase()");
       System.out.println(s2 + " in uppercase: " + s2.toUpperCase());
       System.out.println(s2 + " in lowercase: " + s2.toLowerCase());
       // 8. concat()
       System.out.println("\n8. concat()");
       System.out.println(s1.concat(" Programming"));
       System.out.println(s4.concat(s3));
       // 9. replace()
       System.out.println("\n9. replace()");
       System.out.println(s3.replace('a', 'o'));
       System.out.println(s2.replace("program", "code"));
       // 10. startsWith() and endsWith()
       System.out.println("\n10. startsWith() and endsWith()");
       System.out.println("\"" + s2 + "\" starts with \"pro\"? " + s2.startsWith("pro"));
       System.out.println("\"" + s3 + "\" ends with \"ger\"? " + s3.endsWith("ger"));
       // 11. trim()
       System.out.println("\n11. trim()");
       System.out.println("Before trim: \"" + s5 + "\"");
       System.out.println("After trim: \"" + s5.trim() + "\"");
       System.out.println("\n---------- END OF DEMO ----------");
   }
}