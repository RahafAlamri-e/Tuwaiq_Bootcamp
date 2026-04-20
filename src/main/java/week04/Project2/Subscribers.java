package week04.Project2;

public class Subscribers extends Passenger{

    public Subscribers(String name, int id) {
        super(name, id);
    }

    public void reserveCar(Car car) throws Exception {
        if (car.getMaxCapacity() == 0) {
            throw new Exception("Car is full");
        }

        setReservedCar(car);
        setTripCost(car.getRoute().getPrice() * 0.5);
        car.setMaxCapacity(car.getMaxCapacity() - 1);
    }

    public void displayInfo() {
        System.out.println("Subscriber Passenger=======");
        System.out.println("Name: " + getName());
        System.out.println("Car Code: " + getReservedCar().getCode());
        System.out.println("Route Price: " + getReservedCar().getRoute().getPrice());
        System.out.println("Trip Cost: " + getTripCost());
    }
}
