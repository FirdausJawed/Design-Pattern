package StrategyPattern;

public class NormalDriving implements DrivingStrategy {
    @Override
    public String drive() {
        return "Driving normally, following the traffic rules and regulations.";
    }
    
}
