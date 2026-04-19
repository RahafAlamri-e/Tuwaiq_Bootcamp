package week04.day01_task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Vehicle> rentedVehicles = new ArrayList<>();
        int choice;

        do {
            System.out.println("\nVehicle Rental System");
            System.out.println("1.Rent a Car");
            System.out.println("2.Rent a Bike");
            System.out.println("3.Rent a Truck");
            System.out.println("4.View Rented Vehicles");
            System.out.println("5.Exit");
            System.out.println("\nEnter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Car Model: ");
                    String carModel = input.nextLine();
                    System.out.println("Enter Rental Days: ");
                    int days = input.nextInt();
                    input.nextLine();

                    Vehicle car = new Car(carModel, days);
                    rentedVehicles.add(car);

                    System.out.println("\nRental Details:");
                    car.displayDetails();
                    break;

                case 2:
                    System.out.println("Enter Bike Brand: ");
                    String bikeBrand = input.nextLine();

                    System.out.println("Enter Rental Hours: ");
                    int rentalHours = input.nextInt();
                    input.nextLine();

                    Vehicle bike = new Bike(bikeBrand,rentalHours);
                    rentedVehicles.add(bike);

                    System.out.println("\nRental Details: ");
                    bike.displayDetails();
                    break;

                case 3:
                    System.out.println("Enter Truk Type: ");
                    String truckType = input.nextLine();

                    System.out.println("Enter Rental Weeks: ");
                    int rentalWeeks = input.nextInt();
                    input.nextLine();

                    Vehicle truck = new Truck(truckType, rentalWeeks);
                    rentedVehicles.add(truck);

                    System.out.println("\nRental Details: ");
                    truck.displayDetails();
                    break;

                case 4:
                    if (rentedVehicles.isEmpty()){
                        System.out.println("No vehicles rented yet");
                    }else {
                        System.out.println("\nRented Vehicles:");
                        for (Vehicle vehicle: rentedVehicles){
                            vehicle.displayDetails();
                            System.out.println();
                        }
                    }

                    break;

                case 5:
                    System.out.println("Thank you for using the Vehicle Rental System!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

    }
}
