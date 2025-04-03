package models;

import enums.GearType;
import java.awt.Color;
import java.time.LocalDate;

public class Vehicle extends Automobile {
    private int length;
    private int width;
    private Color color;

    // Default constructor
    public Vehicle() {
        super();
        this.length = 0;
        this.width = 0;
        this.color = Color.BLACK;
    }

    // Full argument constructor
    public Vehicle(String manufactureCompany, LocalDate manufactureDate, String model, Engine engine, int plateNum, GearType gearType, int bodySerialNum, int length, int width, Color color) {
        super(manufactureCompany, manufactureDate, model, engine, plateNum, gearType, bodySerialNum);
        this.length = length;
        this.width = width;
        this.color = color != null ? color : Color.BLACK; // Default to black if color is null
    }

    // Getters
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + ", Length: " + length + ", Width: " + width + ", Color: " + color;
    }
}
