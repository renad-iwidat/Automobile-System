package models;

import enums.GearType;
import java.time.LocalDate;

public class Motorcycle extends Automobile {
    private double tierDiameter;
    private double length;

    // Default constructor
    public Motorcycle() {
        super();
        this.tierDiameter = 0.0;
        this.length = 0.0;
    }

    // Full argument constructor
    public Motorcycle(String manufactureCompany, LocalDate manufactureDate, String model, Engine engine, int plateNum, GearType gearType, int bodySerialNum, double tierDiameter, double length) {
        super(manufactureCompany, manufactureDate, model, engine, plateNum, gearType, bodySerialNum);
        this.tierDiameter = tierDiameter;
        this.length = length;
    }

    // Getters
    public double getTierDiameter() {
        return tierDiameter;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tier Diameter: " + tierDiameter + ", Length: " + length;
    }
}
