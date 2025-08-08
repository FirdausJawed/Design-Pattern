package StrategyPattern;

public class RashDriving implements DrivingStrategy {
    @Override
    public String drive() {
        return "Driving recklessly, ignoring traffic rules and endangering lives.";
    }
}
