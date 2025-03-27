package models;

import enums.GearType;
import java.awt.Color;

public class Vehicle extends Automobile {
    private int length;
    private int width;
    private Color color;

    public Vehicle() {
        super();
    }

    public Vehicle(String manufactureCompany, String model, Engine engine, int plateNum, GearType gearType, int bodySerialNum, int length, int width, Color color) {
        super(manufactureCompany, null, model, engine, plateNum, gearType, bodySerialNum);
        this.length = length;
        this.width = width;
        this.color = color != null ? color : Color.BLACK; // Default to black if color is null
    }

    public int getLength() { return length; }
    public int getWidth() { return width; }
    public Color getColor() { return color; }

    @Override
    public String toString() {
        return super.toString() + ", Length: " + length + ", Width: " + width + ", Color: " + color;
    }
}
