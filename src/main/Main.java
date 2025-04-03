package main;

import models.*;
import enums.GearType;
import enums.FuelType;
import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Create the engine instances
        Engine carEngine = new Engine("Toyota", new Date(), "V7", 3000, 6, FuelType.GASOLINE);
        Engine motorcycleEngine = new Engine("Honda", new Date(), "Inline 6", 600, 4, FuelType.GASOLINE);
        Engine truckEngine = new Engine("Ford", new Date(), "V8", 5000, 8, FuelType.DIESEL);

        // Create the vehicles
        Car car = new Car("Toyota", 4000, 1800, 5, true);
        Motorcycle motorcycle = new Motorcycle("Honda", new Date(), "CBR600RR", motorcycleEngine, 2345, GearType.NORMAL, 6789, 18.5, 2000.0);
        Truck truck = new Truck("Ford", new Date(), "F-150", truckEngine, 3456, GearType.AUTOMATIC, 7890, 6000, 2500, Color.RED, 2000.0, 3500.0);
        Vehicle vehicle = new Vehicle("Tesla", "Model 3", carEngine, 4567, GearType.AUTOMATIC, 1234, 4800, 1900, Color.BLUE);

        // Print details of each vehicle
        System.out.println("Car Details:");
        System.out.println(car);
        System.out.println("\nMotorcycle Details:");
        System.out.println(motorcycle);
        System.out.println("\nTruck Details:");
        System.out.println(truck);
        System.out.println("\nVehicle Details:");
        System.out.println(vehicle);
    }
}
