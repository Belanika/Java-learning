package homeworks;

import java.util.Scanner;

public class Vehicle {
    private float fuel;
    private float fuelUsage;
    private int passengers;

        public Vehicle (float fuel, float fuelUsage, int passengers){
            this.fuel = fuel;
            this.fuelUsage = fuelUsage;
            this.passengers = passengers;
        }

        public float maxDistance () {
            return fuel / (fuelUsage * (1 + 0.05f * passengers)) * 100;
        }
    }
