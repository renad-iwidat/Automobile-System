package models;

import enums.GearType;
import java.time.LocalDate;

public class Automobile {
    private String manufactureCompany;
    private LocalDate manufactureDate;  // Using LocalDate
    private String model;
    private Engine engine;
    private int plateNum;
    private GearType gearType;
    private int bodySerialNum;

    // Default constructor
    public Automobile() {
        this.manufactureCompany = "Unknown";
        this.manufactureDate = LocalDate.now();  // Default to current date
        this.model = "Unknown";
        this.engine = new Engine();  // Default engine
        this.plateNum = 0;
        this.gearType = GearType.NORMAL;
        this.bodySerialNum = 0;
    }

    // Full argument constructor
    public Automobile(String manufactureCompany, LocalDate manufactureDate, String model, Engine engine, int plateNum, GearType gearType, int bodySerialNum) {
        this.manufactureCompany = manufactureCompany;
        this.manufactureDate = manufactureDate != null ? manufactureDate : LocalDate.now();
        this.model = model;
        this.engine = engine;
        this.plateNum = plateNum;
        this.gearType = gearType;
        this.bodySerialNum = bodySerialNum;
    }

    // Getters and setters
    public String getManufactureCompany() {
        return manufactureCompany;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getPlateNum() {
        return plateNum;
    }

    public GearType getGearType() {
        return gearType;
    }

    public int getBodySerialNum() {
        return bodySerialNum;
    }

    public void setBodySerialNum(int bodySerialNum) {
        this.bodySerialNum = bodySerialNum;
    }

    @Override
    public String toString() {
        return "Automobile [Manufacture Company: " + manufactureCompany +
                ", Manufacture Date: " + manufactureDate +
                ", Model: " + model +
                ", Engine: " + engine +
                ", Plate Number: " + plateNum +
                ", Gear Type: " + gearType +
                ", Body Serial Number: " + bodySerialNum + "]";
    }
}
