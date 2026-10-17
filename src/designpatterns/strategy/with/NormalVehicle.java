package designpatterns.strategy.with;

import designpatterns.strategy.with.strategy.NormalDriveStrategy;

public class NormalVehicle extends Vehicle {
    public NormalVehicle() {super (new NormalDriveStrategy());}
}
