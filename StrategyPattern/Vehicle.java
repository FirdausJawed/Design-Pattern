package StrategyPattern;

public class Vehicle {
    private DrivingStrategy drivingStrategy;

    public Vehicle(DrivingStrategy drivingStrategy) {
        this.drivingStrategy = drivingStrategy;
    }

    //set driving strategy
    public void setDrivingStrategy(DrivingStrategy drivingStrategy) {
        this.drivingStrategy = drivingStrategy;
    }
    
    public String drive() {
        return drivingStrategy.drive();
    }
}
