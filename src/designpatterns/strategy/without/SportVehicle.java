package designpatterns.strategy.without;

public class SportVehicle extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Sport Vehicle is calling");
    }
}
