package week04.day01_task;

public class Car implements Vehicle{
    private String model;
    private int days;
    private final double dailyRate = 50.0;

    public Car() {
    }

    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }

    @Override
    public double calculateRentalCost() {
        return days * dailyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Daily Rental Rate: $" + dailyRate);
        System.out.println("Rental Cost: $" + calculateRentalCost());
    }
}
