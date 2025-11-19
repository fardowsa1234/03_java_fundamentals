/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sess04_class_objects_and_methods;

/**
 * Demonstrates creating and using the Student class.
 * 
 * @author user
 */
public class StudentDemo {

    // main method
    public static void main(String[] args) {
        Student s1 = new Student();  // declare and instantiate a Student object

        // initialise the student object 
        s1.initialiseStudent();

        // display the student's details
        s1.displayDetails();
    }
}
