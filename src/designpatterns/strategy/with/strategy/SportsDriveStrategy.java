package designpatterns.strategy.with.strategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sport Vehicle from Strategy is calling");
    }
}
