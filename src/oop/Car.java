package oop;

public class Car {

    //Fields
    String color;
    String brand;
    int maxSpeed;

    //Method
    public void printCarInfo(){
        System.out.println("Car info:");
        System.out.println("Brand " + brand);
        System.out.println("Color " + color);
        System.out.println("Max speed " + maxSpeed);
    }
}
