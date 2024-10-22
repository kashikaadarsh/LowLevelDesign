package designPatterns.strategyDesignPattern.strategy.vehicle;


import designPatterns.strategyDesignPattern.strategy.vehicle.SportsVehicle;
import designPatterns.strategyDesignPattern.strategy.vehicle.Vehicle;

public  class Main {
    public static void main(String[] args){
        Vehicle vehicle = new SportsVehicle();
        vehicle.drive();

        Vehicle vehicle2 = new GoodsVehicle();
        vehicle2.drive();


    }



}
