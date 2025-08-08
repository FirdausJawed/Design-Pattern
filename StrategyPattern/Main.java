package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        // Create a driving strategy
        DrivingStrategy normalDriving = new NormalDriving();
        DrivingStrategy sportsDriving = new RashDriving();

        // Create vehicles with different driving strategies
        Vehicle normalCar = new NormalCar(normalDriving);
        Vehicle sportsCar = new SportsCar(sportsDriving);

        // Drive the vehicles
        System.out.println("Normal Car: " + normalCar.drive());
        System.out.println("Sports Car: " + sportsCar.drive());

        // Change the driving strategy of the normal car
        normalCar.setDrivingStrategy(sportsDriving);
        System.out.println("Normal Car after changing strategy: " + normalCar.drive());
    }
}
