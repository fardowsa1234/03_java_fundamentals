/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sess04_class_objects_and_methods;

/**
 *
 * @author user
 */
public class Person {
    
    // instance fields
    protected String name;
    protected char gender;
    protected byte age;

    public Person() {
    }

    public Person(String name, char gender, byte age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person Details" +"-".repeat(50)
                +"\nPerson name: " + this.name
                + "\nPerson age: " + this.age
                + "\nPerson's gender: " + (this.gender == 'm' || 
                this.gender == 'f'? "male\n":"Female\n")
                +"-".repeat(50) ;
    }
    
    
}
