package designPatterns.strategyDesignPattern.strategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public  void drive(){
        System.out.println("Inside Normal Drive Strategy");
    }
}
