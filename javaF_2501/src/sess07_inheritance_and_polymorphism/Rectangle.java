
package sess07_inheritance_and_polymorphism;

/**
 *The {@code Rectangle} class represents a 2-dimensional rectangle with its
 * length and width. it provides methods to compute its area
 * @author user
 */
public class Rectangle extends Shape {
    
    // instance fields
    /**
     * The length of the rectangle (in units)
     **/
    
    protected int length;
    /**
     * The width of the rectangle (in units)
     **/
    protected int width;

    // getters and setters
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
  
    
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    //constructors

    public Rectangle() {
        this.length = 0;
        this.width = 0;
        this.name = "Rectangle";
        
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
        this.name = "Rectangle";
    }
    
    // instance methods
     protected long calcArea() {
        return length * width;
    }
    protected long calcPerimeter() {
        return 2 *(length + width);
    }
    
    // overridden methods
    @Override
    public String getName()
    {
     return this.name;
    }
    
   public Rectangle(int length, int width, String name) {
        this.length = length;
        this.width = width;
        this.name = name;
    }
    
    
    @Override
    public String toString() {
        return this.getName() + "Details"
                + "\n" + "-".repeat(50)
                + "\n Length: " + this.length
                + "\n LWidth: " + this.width
                + "\n Area: " + this.calcArea()
                + "\n Perimeter: " + this.calcPerimeter()
                + "\n" + "-".repeat(50); 
    }

   
    
}
