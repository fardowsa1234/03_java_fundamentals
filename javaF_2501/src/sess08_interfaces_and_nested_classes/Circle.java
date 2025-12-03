package sess08_interfaces_and_nested_classes;

import sess07_inheritance_and_polymorphism.Shape;

/**
 * Represents a 2D circle shape with a given radius.
 * Implements I2DShape and extends the Shape base class.
 * 
 */
public class Circle extends Shape implements I2DShape
{
    //============================================
    // Instance Fields
    //============================================

    /** Radius of the circle (units). */
    protected int radius;

    //============================================
    // Getters & Setters
    //============================================

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    //============================================
    // Constructors
    //============================================

    public Circle()
    {
        this(0); // Reuse constructor
    }

    public Circle(int radius)
    {
        this.radius = radius;
        this.name = "Circle";
    }

    //============================================
    // Overridden Methods
    //============================================

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public float calcArea()
    {
        return (float)(Math.PI * radius * radius);
    }

    @Override
    public String toString()
    {
        return this.getName() + " Details"
                + "\n" + "-".repeat(50)
                + "\n Radius: " + this.radius
                + "\n Area: " + this.calcArea()
                + "\n Circumference: " + this.calcCircumference()
                + "\n" + "-".repeat(50);
    }

    //============================================
    // Additional Methods
    //============================================

    /**
     * Computes the circumference (perimeter) of the circle.
     * @return the circumference
     */
    public float calcCircumference()
    {
        return (float)(2 * Math.PI * radius);
    }
}
