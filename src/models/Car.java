package models;

import enums.GearType;
import java.awt.Color;

public class Car extends Vehicle {
    private int chairNum;
    private boolean isFurnitureLeather;

    public Car() {}

    public Car(String manufactureCompany, int length, int width, int chairNum, boolean isFurnitureLeather) {
        super(manufactureCompany, null, null, 0, GearType.NORMAL, 0, length, width, Color.BLACK);
        this.chairNum = chairNum;
        this.isFurnitureLeather = isFurnitureLeather;
    }

    public int getChairNum() { return chairNum; }
    public boolean isFurnitureLeather() { return isFurnitureLeather; }

    @Override
    public String toString() {
        return super.toString() + ", Chair Number: " + chairNum + ", Is Furniture Leather: " + isFurnitureLeather;
    }
}
