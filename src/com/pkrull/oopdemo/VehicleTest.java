package com.pkrull.oopdemo;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// calling a different constructor
//        Vehicle v = new Vehicle();
//        System.out.println("v color is:" + v.getColor());
//        v.setColor("black");
//        System.out.println("v color is:" + v.getColor());
//        // calling a different constructor
//        Vehicle vw = new Vehicle("Car");
//        System.out.println("vw type is:" + vw.getType());
//        // calling a different constructor
//        Vehicle bike = new Vehicle("Bike", "Red");
//        System.out.println("bike color is:" + bike.getColor());
//        System.out.println("bike type is:" + bike.getType());
		Car volvo = new Car(4);
		System.out.println(volvo.getType());
		System.out.println(volvo.getColor());
		System.out.println(volvo.getNumWheels());
		System.out.println("----------------------------------------");
		Plane pl = new Plane(true, "plane");
		System.out.println(pl.getColor());
		System.out.println(pl.getType());
		pl.changePlaneColor("red");
		System.out.println(pl.getColor());
}

}
