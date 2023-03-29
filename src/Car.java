import java.util.Scanner;

public class Car extends Vehicle {
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }








    String brand;
    String model;
    int maxSpeed;
    int year;
    int doors;


    public Car() {
        setBrand("BMW");
        setModel("M5");
        setYear(2022);
        setMaxSpeed(305);
        setDoors(5);
        setFuelConsumption(10.5);

        System.out.println("Brand:            "+brand);
        System.out.println("Model:            "+model);
        System.out.println("Year:             "+year);
        System.out.println("Max Speed:        "+maxSpeed);
        System.out.println("Doors:            "+doors);
        System.out.println("Fuel consumption: "+fuelConsumption);
        System.out.println("");

    }







}
