// OOP - Encapsulation and Inheritance
// Classes and Objects
// Member variables and methods
// Constructors and method overloading
// this

public class VehicleTest {
    public static void main(String[] args) {
        // calling a different constructor
        Vehicle v = new Vehicle();
        System.out.println("v color is:" + v.getColor());
        v.setColor("black");
        System.out.println("v color is:" + v.getColor());
        // calling a different constructor
        Vehicle vw = new Vehicle("Car");
        System.out.println("vw type is:" + vw.getType());
        // calling a different constructor
        Vehicle bike = new Vehicle("Bike", "Red");
        System.out.println("bike color is:" + bike.getColor());
        System.out.println("bike type is:" + bike.getType());
    } 
}