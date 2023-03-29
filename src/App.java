public class App {
    private Vehicle vehicle;
    public App() {
        Motorcycle mc = new Motorcycle();
        mc.testDriveToMalmo();
        Truck truck = new Truck();
        truck.testDriveToMalmo();

        Car car = new Car();
        car.testDriveToMalmo();

        double cheapestPrice = findCheapest(car.getTripPrice(), truck.getTripPrice(), mc.getTripPrice());

        if (cheapestPrice == car.getTripPrice()) {
            System.out.println(car.getBrand() + " is the cheapest option at: " + cheapestPrice);
        } else if (cheapestPrice == truck.getTripPrice()) {
            System.out.println(truck.getBrand() + " is the cheapest option at: " + cheapestPrice);
        } else if (cheapestPrice == mc.getTripPrice()) {
            System.out.println(mc.getBrand() + " is the cheapest option at: " + cheapestPrice);
        }
    }

    public double findCheapest(double a, double b, double c) {
        double lowest = a;
        if (b < lowest) {
            lowest = b;
        }
        if (c < lowest) {
            lowest = c;
        }
        return lowest;
    }
}
