package models;

import enums.GearType;
import java.awt.Color;
import java.time.LocalDate;

public class Car extends Vehicle {
    private int chairNum;
    private boolean isFurnitureLeather;

    // Default constructor
    public Car() {
        super();
        this.chairNum = 0;
        this.isFurnitureLeather = false;
    }

    // Full argument constructor
    public Car(String manufactureCompany, LocalDate manufactureDate, String model, Engine engine, int plateNum, GearType gearType, int bodySerialNum, int length, int width, Color color, int chairNum, boolean isFurnitureLeather) {
        super(manufactureCompany, manufactureDate, model, engine, plateNum, gearType, bodySerialNum, length, width, color);
        this.chairNum = chairNum;
        this.isFurnitureLeather = isFurnitureLeather;
    }

    // Getters
    public int getChairNum() {
        return chairNum;
    }

    public boolean isFurnitureLeather() {
        return isFurnitureLeather;
    }

    @Override
    public String toString() {
        return super.toString() + ", Chair Number: " + chairNum + ", Is Furniture Leather: " + isFurnitureLeather;
    }
}
