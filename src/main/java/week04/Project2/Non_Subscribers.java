package week04.Project2;

public class Non_Subscribers extends Passenger{
    private boolean hasCoupon;

    public Non_Subscribers(String name, int id, boolean hasCoupon) {
        super(name, id);
        this.hasCoupon = hasCoupon;
    }

    public void reserveCar(Car car) throws Exception {
        if (car.getMaxCapacity() == 0) {
            throw new Exception("Car is full");
        }

        setReservedCar(car);
        if (hasCoupon) {
            setTripCost(car.getRoute().getPrice() - (car.getRoute().getPrice() * 0.1));
        } else {
            setTripCost(car.getRoute().getPrice());
        }
        car.setMaxCapacity(car.getMaxCapacity() - 1);
    }

    public void displayInfo() {
        System.out.println("Non-Subscriber Passenger=======");
        System.out.println("Name: " + getName());
        System.out.println("Car Code: " + getReservedCar().getCode());
        System.out.println("Route Price: " + getReservedCar().getRoute().getPrice());
        System.out.println("Trip Cost: " + getTripCost());
    }
}
