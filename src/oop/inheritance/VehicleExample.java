package oop.inheritance;

class Vehicle{
    protected String brand;

    public void honk(){
        System.out.println("Beep-beep");
        System.out.println("My brand is " + brand);
    }
}

class Bike extends Vehicle{
    public void honk(){
        System.out.println("Urr-urr");
        System.out.println("My brand is " + brand);
    }
        }

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.brand = "Tesla";
        vehicle.honk();

        Bike bike = new Bike();
        bike.brand = "Cube";
        bike.honk();
    }
}
