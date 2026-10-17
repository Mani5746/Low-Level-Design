package designpatterns.strategy.with.strategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal vehicle from Stratgey is calling");
    }
}
