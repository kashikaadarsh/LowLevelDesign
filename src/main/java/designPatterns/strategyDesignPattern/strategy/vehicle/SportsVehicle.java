package designPatterns.strategyDesignPattern.strategy.vehicle;

import designPatterns.strategyDesignPattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
