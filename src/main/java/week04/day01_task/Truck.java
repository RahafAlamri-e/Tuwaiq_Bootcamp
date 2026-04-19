package week04.day01_task;

public class Truck implements Vehicle{
    private String type;
    private int weeks;
    private final double weeklyRate = 500.0;

    public Truck() {
    }

    public Truck(String type, int weeks) {
        this.type = type;
        this.weeks = weeks;
    }

    @Override
    public double calculateRentalCost() {
        return weeks * weeklyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Type: " + type);
        System.out.println("Weekly Rental Rate: $" + weeklyRate);
        System.out.println("Rental Cost: $" + calculateRentalCost());
    }
}
