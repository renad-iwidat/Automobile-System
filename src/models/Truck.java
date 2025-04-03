package models;

import enums.GearType;
import java.awt.Color;
import java.time.LocalDate;

public class Truck extends Vehicle {
    private double freeWeight;
    private double fullWeight;

    // Default constructor
    public Truck() {
        super();
        this.freeWeight = 0.0;
        this.fullWeight = 0.0;
    }

    // Full argument constructor
    public Truck(String manufactureCompany, LocalDate manufactureDate, String model, Engine engine, int plateNum, GearType gearType, int bodySerialNum, int length, int width, Color color, double freeWeight, double fullWeight) {
        super(manufactureCompany, manufactureDate, model, engine, plateNum, gearType, bodySerialNum, length, width, color);
        this.freeWeight = freeWeight;
        this.fullWeight = fullWeight;
    }

    // Getters
    public double getFreeWeight() {
        return freeWeight;
    }

    public double getFullWeight() {
        return fullWeight;
    }

    @Override
    public String toString() {
        return super.toString() + ", Free Weight: " + freeWeight + ", Full Weight: " + fullWeight;
    }
}
