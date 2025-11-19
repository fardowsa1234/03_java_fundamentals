/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sess04_class_objects_and_methods;

/**
 * Represents a student with ID, name, age, and gender.
 * Demonstrates class, object, and method usage.
 * 
 * @author user
 */
public class Student {
    String studentID;
    String name;
    int age;
    char gender;

    // No-argument constructor
    public Student() {
        this.studentID = "";
        this.name = "";
        this.age = 0;
        this.gender = 'U'; // U = Unknown
    }

    // Student initializer
    public void initialiseStudent() {
        this.studentID = "Student0001";
        this.name = "Student One";
        this.age = 18;
        this.gender = 'M'; // Example gender
    }

    // Method to display the student's details
    public void displayDetails() {
        System.out.println("Student Details");
        System.out.println("-".repeat(50));
        System.out.println("Student ID: " + this.studentID);
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Age: " + this.age);
        System.out.println("Student Gender: " + 
            ((this.gender == 'M' || this.gender == 'm') ? "Male" : "Female"));
        System.out.println("-".repeat(50));
    }

    @Override
    public String toString() {
        return "Student Details" +"-".repeat(50)
                +"Student ID: " + this.name
                + "Student age: " + this.age
                + "Student's gender: " + (this.gender == 'm' || 
                this.gender == 'f'? "male\n":"Female\n");
    }
    
    
}
