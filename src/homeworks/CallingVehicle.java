package homeworks;

import java.util.Scanner;

public class CallingVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Haw many liters of fuel do you have in the tank?");
        float fuel = scanner.nextFloat();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What is your normal fuel usage without passengers per 100 km?");
        float fuelUsage = scanner1.nextFloat();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("How many passengers do you have?");
        int passengers = scanner2.nextInt();

        Vehicle vehicle = new Vehicle(fuel, fuelUsage, passengers);
        System.out.printf("Max distance is %.2f kilometers", vehicle.maxDistance());
    }
}
