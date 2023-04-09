public class Main {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();
        Bicycle bicycle = new Bicycle("Sport", 2);
        Car car = new Car("Mercedes E", 4);
        Truck truck = new Truck("Volkswagen", 8);
        serviceStation.check(bicycle);
        serviceStation.check(car);
        serviceStation.check(truck);

    }
}