package sess06_modifiers_and_packages;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Java program to demonstrate the transient keyword/modifier to prevent the
 * user's password from being serialized
 * @author user
 */
public class TransietExample {

    // main method
    public static void main(String[] args) {

        // create a user object
        User user1 = new User("f_janoyy", "fardosaabdullahi991@gmail.com", "Fardowsa223#");

        // display the details of the user before serialization
        System.out.println("The user's details before serialization:\n" + user1);

        // serialize the user1 object to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"))) {

            oos.writeObject(user1);

        } catch (IOException ioe) {
            System.err.println("The error: " + ioe.getLocalizedMessage() + " occurred!");
        }

        // modify the object by changing the user's password
        user1.password = "NewPassword123!";

        // deserialize the object from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"))) {

            User deserializedUser = (User) ois.readObject();

            // display the details of the user after deserialization
            System.out.println("The user's details after deserialization:\n" + deserializedUser);

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("The error: " + e.getLocalizedMessage() + " occurred!");
        }

    }

}

class User implements Serializable {

    // regular fields will be serialized
    String username, email;

    // transient field will not be serialized
    transient String password;

    // parameterised constructor
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // override the toString method
    @Override
    public String toString() {
        return "User Details"
                + "------------------------------\n"
                +"\n" + "-".repeat(50)
                + "Username : " + this.username
                + "\nEmail    : " + this.email
                + "\nPassword : " + (this.password == null ? "*******" : this.password)
                +"\n" + "-".repeat(50);
    }
}
