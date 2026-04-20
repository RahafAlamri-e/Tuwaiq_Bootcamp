package week04.Project2;

public abstract class Passenger {
    private String name;
    private int id;
    private Car reservedCar;
    private double tripCost;

    public Passenger() {
    }

    public Passenger(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Passenger(String name, int id, Car reservedCar, double tripCost) {
        this.name = name;
        this.id = id;
        this.reservedCar = reservedCar;
        this.tripCost = tripCost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public double getTripCost() {
        return tripCost;
    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public abstract void reserveCar(Car car) throws Exception;

    public abstract void displayInfo();

}
