public class Truck extends Vehicle {


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
    int capacity;
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }

    String capacity2;
    public Truck() {

        setBrand("MAN");
        setModel("TGX");
        setMaxSpeed(90);
        setYear(2022);
        setFuelConsumption(34.75);
        setCapacity(40000);

        System.out.println("Brand:            "+brand);
        System.out.println("Model:            "+model);
        System.out.println("Year:             "+year);
        System.out.println("Max Speed:        "+maxSpeed);
        System.out.println("Doors:            "+doors);
        System.out.println("Fuel consumption: "+fuelConsumption);
        System.out.println("Truck capacity:   "+capacity);
        System.out.println("");


    }

}


