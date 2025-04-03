package models;

import enums.FuelType;
import java.time.LocalDate;

public class Engine {
    private String manufacture;
    private LocalDate manufactureDate;  // Changed to LocalDate
    private String model;
    private int capacity;
    private int cylinders;
    private FuelType fuelType;

    // Default constructor
    public Engine() {
        this.manufacture = "Unknown";
        this.manufactureDate = LocalDate.now();  // Default to current date
        this.model = "Unknown";
        this.capacity = 0;
        this.cylinders = 0;
        this.fuelType = FuelType.GASOLINE;  // Default to Gasoline
    }

    // Full argument constructor
    public Engine(String manufacture, LocalDate manufactureDate, String model, int capacity, int cylinders, FuelType fuelType) {
        this.manufacture = manufacture;
        this.manufactureDate = manufactureDate != null ? manufactureDate : LocalDate.now();  // Default to current date if null
        this.model = model;
        this.capacity = capacity;
        this.cylinders = cylinders;
        this.fuelType = fuelType;
    }

    // Getters and setters
    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Engine [Manufacture: " + manufacture +
                ", Manufacture Date: " + manufactureDate +
                ", Model: " + model +
                ", Capacity: " + capacity +
                ", Cylinders: " + cylinders +
                ", Fuel Type: " + fuelType + "]";
    }
}
