package sess06_modifiers_and_packages;

/**
 * Java program to demonstrate the "final" keyword in Java.
 *
 * Features of final:
 * 1. final field  ---> cannot be reassigned after initialization.
 * 2. final method ---> cannot be overridden in subclasses.
 * 3. final class  ---> cannot be extended.
 *
 * Author: user
 */
public class FinalKeywordDemo {
    public static void main(String[] args) {

        // -------------------------
        // Example 1: final field
        // -------------------------
        PersonWithFinalField p = new PersonWithFinalField(101, "James", 25);
        p.setAge(30);
        System.out.println(p);

        // -------------------------
        // Example 2: final method
        // -------------------------
        Employee emp = new Employee(75000, "Alice");
        System.out.println(emp.getDetails());
        
        // -------------------------
        // Example 3: final class
        // -------------------------
        MathUtils.add(5, 7);
        MathUtils.multiply(4, 6);
    }
}

/* -----------------------------------------------------------
 * 1. CLASS WITH FINAL FIELD
 * ----------------------------------------------------------- */
class PersonWithFinalField {

    private final int id;      // final field
    private String name;
    private int age;

    public PersonWithFinalField(int id, String name, int age) {
        this.id = id;          // final field assigned once
        this.name = name;
        this.age = age;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return "User Details"
                + "\n" + "-".repeat(50)
                + "\nID No   : " + id
                + "\nName    : " + name
                + "\nAge     : " + age
                + "\n" + "-".repeat(50);
    }
}

/* -----------------------------------------------------------
 * 2. CLASS WITH FINAL METHOD
 * ----------------------------------------------------------- */
class PersonWithFinalMethod {

    private int id;
    private String name;

    public PersonWithFinalMethod(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // final method → cannot be overridden
    public final String getDetails() {
        return "Employee Details"
                + "\n" + "-".repeat(50)
                + "\nID No   : " + id
                + "\nName    : " + name
                + "\n" + "-".repeat(50);
    }
}

class Employee extends PersonWithFinalMethod {

    private double salary;

    public Employee(double salary, String name) {
        super((int)(Math.random() * 1000), name); // random ID
        this.salary = salary;
    }
}

/* -----------------------------------------------------------
 * 3. FINAL CLASS (cannot be extended)
 * ----------------------------------------------------------- */
final class MathUtils {

    public static final double PI = 3.14159265359; // constant

    public static void add(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public static void multiply(int a, int b) {
        System.out.println(a + " × " + b + " = " + (a * b));
    }
}
// This would cause a compile-time error:
// class AdvancedMath extends MathUtils { }  // Cannot inherit from final 'MathUtils'


// it should display id no, name, age and salary