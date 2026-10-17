package designpatterns.strategy.without;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportVehicle();
        vehicle.drive();
    }
}
