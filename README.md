
# Automobile System

The **Automobile System** is a Java-based project designed to manage different types of vehicles such as cars, motorcycles, and trucks. The system allows you to create and manage vehicle details, such as the manufacture company, model, engine details, and various other attributes. The project also supports managing these vehicles with features such as adding, modifying, and displaying vehicle information.

## Features

- **Vehicle Types**: Supports Cars, Motorcycles, Trucks, and General Vehicles.
- **Engine Details**: Manage engine information such as manufacture, model, capacity, fuel type, etc.
- **Vehicle Management**: Store and manage vehicle details, including the body serial number, engine, and manufacture dates.
- **Display Vehicle Information**: Print detailed information about each vehicle type.
- **Color and Dimensions**: Manage vehicle dimensions and color.

## Classes and Inheritance

- **Automobile**: Base class for all vehicles, containing common attributes like `manufacture company`, `model`, `engine`, and `plate number`.
- **Engine**: Contains details about the engine such as `manufacture`, `capacity`, `fuel type`, and `cylinders`.
- **Vehicle**: Inherits from `Automobile` and adds attributes like `length`, `width`, and `color`.
- **Car**: Inherits from `Vehicle` and adds attributes like `chair number` and whether the furniture is leather.
- **Motorcycle**: Inherits from `Automobile` and includes attributes such as `tier diameter` and `length`.
- **Truck**: Inherits from `Vehicle` and adds attributes like `free weight` and `full weight`.

## Setup Instructions

### Requirements
- Java 11 or higher
- IDE (e.g., IntelliJ IDEA or Eclipse)

### Steps to Run

1. **Clone the Repository**:
   Open a terminal and clone the repository to your local machine:
   ```bash
   git clone https://github.com/renad-iwidat/Automobile-System.git
   ```

2. **Open the Project**:
   Open the project in your preferred IDE (e.g., IntelliJ IDEA or Eclipse).

3. **Build the Project**:
   If you are using an IDE, the project should build automatically. Otherwise, ensure you have configured Java properly and build the project using your IDE's build options.

4. **Run the Project**:
   Navigate to the `Main` class (located in the `main` package) and run the program. The output will display detailed information about the vehicles such as Cars, Motorcycles, Trucks, and other vehicles.

   Sample output:
   ```
   Car Details:
   Automobile [Manufacture Company: Toyota, Manufacture Date: 2022-01-10, Model: Corolla, Engine: Engine [Manufacture: Toyota, Manufacture Date: 2020-05-12, Model: V7, Capacity: 3000, Cylinders: 6, Fuel Type: GASOLINE], Plate Number: 1234, Gear Type: NORMAL, Body Serial Number: 9876], Length: 4000, Width: 1800, Color: java.awt.Color[r=0,g=0,b=0], Chair Number: 5, Is Furniture Leather: true

   Motorcycle Details:
   Automobile [Manufacture Company: Honda, Manufacture Date: 2021-04-05, Model: CBR600RR, Engine: Engine [Manufacture: Honda, Manufacture Date: 2021-03-15, Model: Inline 6, Capacity: 600, Cylinders: 4, Fuel Type: GASOLINE], Plate Number: 2345, Gear Type: NORMAL, Body Serial Number: 6789], Tier Diameter: 18.5, Length: 2000.0

   Truck Details:
   Automobile [Manufacture Company: Ford, Manufacture Date: 2020-07-15, Model: F-150, Engine: Engine [Manufacture: Ford, Manufacture Date: 2019-08-20, Model: V8, Capacity: 5000, Cylinders: 8, Fuel Type: DIESEL], Plate Number: 3456, Gear Type: AUTOMATIC, Body Serial Number: 7890], Length: 6000, Width: 2500, Color: java.awt.Color[r=255,g=0,b=0], Free Weight: 2000.0, Full Weight: 3500.0

   Vehicle Details:
   Automobile [Manufacture Company: Tesla, Manufacture Date: 2022-09-30, Model: Model 3, Engine: Engine [Manufacture: Toyota, Manufacture Date: 2020-05-12, Model: V7, Capacity: 3000, Cylinders: 6, Fuel Type: GASOLINE], Plate Number: 4567, Gear Type: AUTOMATIC, Body Serial Number: 1234], Length: 4800, Width: 1900, Color: java.awt.Color[r=0,g=0,b=255]
   ```

## GitHub Repository

- [Automobile System GitHub Repository](https://github.com/renad-iwidat/Automobile-System.git)

