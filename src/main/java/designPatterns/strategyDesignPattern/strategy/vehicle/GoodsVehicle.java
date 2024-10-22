package designPatterns.strategyDesignPattern.strategy.vehicle;

import designPatterns.strategyDesignPattern.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    GoodsVehicle(){
        super(new NormalDriveStrategy());
    };
}
