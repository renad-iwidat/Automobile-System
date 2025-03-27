package models;

import enums.GearType;
import java.awt.Color;
import java.util.Date;

public class Truck extends Vehicle {
    private double freeWeight;
    private double fullWeight;

    public Truck() {
        super();
    }

    public Truck(String manufactureCompany, Date manufactureDate, String model, Engine engine, int plateNum, GearType gearType, int bodySerialNum, int length, int width, Color color, double freeWeight, double fullWeight) {
        super(manufactureCompany, model, engine, plateNum, gearType, bodySerialNum, length, width, color);
        this.freeWeight = freeWeight;
        this.fullWeight = fullWeight;
    }

    public double getFreeWeight() { return freeWeight; }
    public double getFullWeight() { return fullWeight; }

    @Override
    public String toString() {
        return super.toString() + ", Free Weight: " + freeWeight + ", Full Weight: " + fullWeight;
    }
}
