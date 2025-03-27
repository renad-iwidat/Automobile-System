package models;

import enums.GearType;
import java.util.Date;

public class Motorcycle extends Automobile {
    private double tierDiameter;
    private double length;

    public Motorcycle() {
        super();
    }

    public Motorcycle(String manufactureCompany, Date manufactureDate, String model, Engine engine, int plateNum, GearType gearType, int bodySerialNum, double tierDiameter, double length) {
        super(manufactureCompany, manufactureDate, model, engine, plateNum, gearType, bodySerialNum);
        this.tierDiameter = tierDiameter;
        this.length = length;
    }

    public double getTierDiameter() { return tierDiameter; }
    public double getLength() { return length; }

    @Override
    public String toString() {
        return super.toString() + ", Tier Diameter: " + tierDiameter + ", Length: " + length;
    }
}
