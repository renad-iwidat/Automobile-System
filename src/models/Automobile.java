package models;

import enums.GearType;
import java.util.Date;

public class Automobile {
    private String manufactureCompany;
    private Date manufactureDate;
    private String model;
    private Engine engine;
    private int plateNum;
    private GearType gearType;
    private int bodySerialNum;

    public Automobile() {}

    public Automobile(String manufactureCompany, Date manufactureDate, String model, Engine engine, int plateNum, GearType gearType, int bodySerialNum) {
        this.manufactureCompany = manufactureCompany;
        this.manufactureDate = manufactureDate;
        this.model = model;
        this.engine = engine;
        this.plateNum = plateNum;
        this.gearType = gearType;
        this.bodySerialNum = bodySerialNum;
    }

    public String getManufactureCompany() { return manufactureCompany; }
    public Date getManufactureDate() { return manufactureDate; }
    public String getModel() { return model; }
    public Engine getEngine() { return engine; }
    public int getPlateNum() { return plateNum; }
    public GearType getGearType() { return gearType; }
    public int getBodySerialNum() { return bodySerialNum; }

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
