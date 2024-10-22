package designPatterns.strategyDesignPattern.strategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive(){
        System.out.println("Inside Sports Drive Strategy");
    }
}
