package designPatterns.strategyDesignPattern.strategy.vehicle;

import designPatterns.strategyDesignPattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveobj;
    Vehicle(DriveStrategy driveobj){
        this.driveobj = driveobj;
    }
    public void drive(){
        driveobj.drive();
    }
}
