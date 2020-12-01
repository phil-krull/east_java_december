// OOP - Encapsulation and Inheritance
// Classes and Objects
// Member variables and methods
// Constructors and method overloading
// this

public class Vehicle {
    // member variables
    private String color;
    private String type;
    // constructor
    public Vehicle() {
        color = "blue";
        type = "truck";
    }
    // method overloading
    public Vehicle(String type) {
        this.type = type;
    }
    public Vehicle(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public void setColor(String n_color) {
        color = n_color;
        // ==
        // this.color = n_color;
    }
    public String getColor() {
        return color;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}