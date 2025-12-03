package sess07_inheritance_and_polymorphism;

/**
 * The {@code Cuboid} class represents a 3-dimensional cuboid
 * with its length, width, and breadth.
 * Author: user
 */
public class Cuboid extends Rectangle {

    protected int breadth;

    // Constructors
    public Cuboid() {
        super();
        this.breadth = 0;
        this.name = "Cuboid";
    }

    public Cuboid(int length, int width, int breadth) {
        super(length, width);
        this.breadth = breadth;
        this.name = "Cuboid";
    }

    // Getters and Setters
    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
   // instance methods
     protected long calcSurfaceArea() {
        return 2 * (this.calcArea() + width * breadth + length * breadth); // 2 (lw + wb +lb)
    }
     protected long calcVolume() {
        return this.calcArea() * this.breadth; // 2 (lw + wb +lb)
    }
//    // Optional: calculate volume
//    public int getVolume() {
//        return getLength() * getWidth() * breadth;
//    }

    @Override
    public String toString() {
        return this.getName() + "Details"
                + "\n" + "-".repeat(50)
                + "\n Length: " + this.length
                + "\n Width: " + this.width
                + "\n Breath: " + this.breadth
                + "\n Surface Area: " + this.calcSurfaceArea()
                + "\n Volume: " + this.calcVolume()
                + "\n" + "-".repeat(50); 
    }
}
