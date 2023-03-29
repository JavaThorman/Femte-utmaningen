import java.sql.SQLOutput;
import java.util.zip.DeflaterInputStream;

public abstract class Vehicle {

    public Vehicle(){
        getBrand();
        getModel();
        getYear();
        getMaxSpeed();
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    String brand;
    String model;
    int year;
    int maxSpeed;
    double tripPrice;
    double fuelConsumption;
    int distance = 200;
    int divider = 100;
    double fuelNeeded;
    double literPris = 21.42;
    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    public double getFuelConsumption() {

        return fuelConsumption;
    }
    public double getFuelNeeded() {
        this.fuelNeeded = this.fuelConsumption * distance / divider;
        return fuelNeeded;
    }
    public double getTripPrice() {
         tripPrice = this.fuelNeeded * literPris;
        return tripPrice;
    }
    public double testDriveToMalmo() {


        System.out.println("DRIVING TO MALMÖ IN A BRAND NEW --> "+getYear()+" "+getBrand()+" "+getModel());
        System.out.println("Distance: "+distance+" Km");
        System.out.println("Fuel consumption: "+getFuelConsumption() +" l/100km");
        System.out.println("Price of fuel: "+literPris+" kr/l");

        System.out.println("amount of fuel need for the trip: "+getFuelNeeded()+" Liter");

        System.out.println("The cost for your trip will be: "+getTripPrice()+" kronor");
        newPage();
        return tripPrice;


    }

    public void newPage() {
        System.out.println("\n\n\n\n\n");
    }










}