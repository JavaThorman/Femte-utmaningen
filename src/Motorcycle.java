public class Motorcycle extends Vehicle {

    public boolean getWindshield() {
        return windshield;
    }

    public void setWindshield(boolean windshield) {
        this.windshield = windshield;
    }

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

    boolean windshield;
    String brand;
    String model;
    int maxSpeed;
    int year;

    public int getWindshieldAmount() {
        return windshieldAmount;
    }

    public void setWindshieldAmount(int windshieldAmount) {
        this.windshieldAmount = windshieldAmount;
    }

    int windshieldAmount;


    // Detect if Motorcycle has a windshield



    public Motorcycle() {
        setBrand("Suzuki");
        setModel("GSX-R1000");
        setYear(2022);
        setMaxSpeed(330);
        setFuelConsumption(7);
        setWindshield(true);
        setWindshieldAmount(1);
        System.out.println("Brand:            "+brand);
        System.out.println("Model:            "+model);
        System.out.println("Year:             "+year);
        System.out.println("Max Speed:        "+maxSpeed);
        System.out.println("Has windshield?:  "+windshield+ " - Amount: "+windshieldAmount);
        System.out.println("Fuel consumption: "+fuelConsumption);
        System.out.println("");
    }

}
