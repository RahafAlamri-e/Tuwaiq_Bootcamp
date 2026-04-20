package week04.Project2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Route r1 = new Route("Riyadh", "Jeddah", 100);
        Route r2 = new Route("Dammam", "Khobar", 80);

        Car c1 = new Car("C1", r1, 2);
        Car c2 = new Car("C2", r2, 0);
        Car c3 = new Car("C3", r1, 1);
        Car c4 = new Car("C4", r1, 2);
        Car c5 = new Car("C5", r2, 2);
        Car c6 = new Car("C6", r2, 2);
        Car[] cars = {c1, c2, c3, c4, c5, c6};

        Passenger[] passengers = new Passenger[6];
        passengers[0] = new Subscribers("Ahmed", 1);
        passengers[1] = new Non_Subscribers("Ali", 2, true);
        passengers[2] = new Non_Subscribers("Khalid", 3, false);
        passengers[3] = new Non_Subscribers("Omer", 3, true);
        passengers[4] = new Non_Subscribers("Abdullah", 4, false);
        passengers[5] = new Non_Subscribers("Saleh", 5, true);

        for (int i = 0; i < passengers.length; i++) {
            try {
                passengers[i].reserveCar(cars[i]);
                System.out.println(passengers[i].getName() + " Reserve Trip Successfully");
                passengers[i].displayInfo();
                System.out.println("--------------------");
            } catch (Exception e) {
                System.out.println("Sorry " + passengers[i].getName() + " " + e.getMessage());
                System.out.println("--------------------");
            }
        }

        //========================extra==============================
//
//        Scanner input = new Scanner(System.in);
//
//        // Routes
//        Route r1 = new Route("Riyadh", "Jeddah", 200);
//        Route r2 = new Route("Dammam", "Khobar", 80);
//        Route r3 = new Route("Makkah", "Madinah", 120);
//
//        // Cars
//        Car c1 = new Car("C1", r1, 2);
//        Car c2 = new Car("C2", r2, 1);
//        Car c3 = new Car("C3", r3, 2);
//        Car[] cars = {c1, c2, c3};
//
//        int numberOfPassengers;
//        while (true) {
//            System.out.print("How many passengers? ");
//            if (input.hasNextInt()) {
//                numberOfPassengers = input.nextInt();
//                if (numberOfPassengers > 0) break;
//            }
//            System.out.println("Invalid number, try again");
//            input.next();
//        }
//        input.nextLine();
//
//        Passenger[] passengers = new Passenger[numberOfPassengers];
//        for (int i = 0; i < numberOfPassengers; i++) {
//
//            System.out.println("\nPassenger " + (i + 1));
//
//            System.out.print("Enter name: ");
//            String name = input.nextLine();
//
//            boolean isSubscriber;
//            while (true) {
//                System.out.print("Are you a subscriber? (true/false): ");
//                if (input.hasNextBoolean()) {
//                    isSubscriber = input.nextBoolean();
//                    break;
//                }
//                System.out.println("Invalid input");
//                input.next();
//            }
//
//            boolean hasCoupon = false;
//            if (!isSubscriber) {
//                while (true) {
//                    System.out.print("Do you have a coupon? (true/false): ");
//                    if (input.hasNextBoolean()) {
//                        hasCoupon = input.nextBoolean();
//                        break;
//                    }
//                    System.out.println("Invalid input");
//                    input.next();
//                }
//            }
//
//            int choice;
//            while (true) {
//                System.out.println("\nChoose a trip:");
//                System.out.println("1. Riyadh -> Jeddah (100)");
//                System.out.println("2. Dammam -> Khobar (80)");
//                System.out.println("3. Makkah -> Madinah (120)");
//                System.out.print("Enter choice: ");
//
//                if (input.hasNextInt()) {
//                    choice = input.nextInt();
//                    if (choice >= 1 && choice <= 3) {
//                        break;
//                    } else {
//                        System.out.println("Invalid choice, try again");
//                    }
//                }
//
//            }
//            input.nextLine();
//
//            if (isSubscriber) {
//                passengers[i] = new Subscribers(name, i+1);
//            } else {
//                passengers[i] = new Non_Subscribers(name, i+1, hasCoupon);
//            }
//
//            Car selectedCar = cars[choice - 1];
//
//            try {
//                passengers[i].reserveCar(selectedCar);
//                System.out.println("Reservation successful");
//            } catch (Exception e) {
//                System.out.println("Sorry, the car is full for this trip");
//            }
//        }
//
//        System.out.println("\n--- Passenger Info ---");
//
//        for (Passenger p : passengers) {
//            if (p.getReservedCar() != null) {
//                p.displayInfo();
//                System.out.println();
//            }
//        }
    }
}
