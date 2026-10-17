package designpatterns.strategy.with;

import designpatterns.strategy.with.strategy.SportsDriveStrategy;

public class SportVehicle extends Vehicle {
    public SportVehicle() {
        super(new SportsDriveStrategy());
    }
}
