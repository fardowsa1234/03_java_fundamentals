package sess05_strings_and_arrays;

import java.util.ArrayList;
import sess04_class_objects_and_methods.Person;

/**
 * Java program to demonstrate the ArrayList class and some of its methods.
 * @author user
 */
public class PersonArrayList {

    public void displayPerson(ArrayList<Person> pers) {
        System.out.println("The persons in the list are");
        System.out.printf("%-12s %-7s %-3s%n", "Name", "Gender", "Age");

        // use the enhanced for loop to display each person
        for (Person p : pers) {
            System.out.printf("%-12s %-7s %-3d%n",
                    p.getName(),
                    (p.getGender() == 'M') ? "Male" : "Female",
                    p.getAge());
        }

        // display the number of people in the arraylist
        System.out.println("The number of persons in the list is: " + pers.size());
    }

    // Main method begins program execution
    public static void main(String[] args) {
        // Create an ArrayList of persons
        ArrayList<Person> psn = new ArrayList<>();

        // Create an object of the PersonArrayList
        PersonArrayList pal = new PersonArrayList();

        // Add persons to the psn ArrayList
        psn.add(new Person("Jon", 'M', (byte) 22));
        psn.add(new Person("Claire", 'F', (byte) 19));
        psn.add(new Person("Mary", 'F', (byte) 32));
        psn.add(new Person("Johnson", 'M', (byte) 44));
        psn.add(new Person("Joe", 'M', (byte) 25));
        psn.add(new Person("Sally", 'F', (byte) 21));

        // Display the persons added to the PersonArrayList
        pal.displayPerson(psn);
    }
}
