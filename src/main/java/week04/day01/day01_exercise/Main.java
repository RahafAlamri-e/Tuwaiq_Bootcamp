package week04.day01.day01_exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String email;
        String password;
        boolean isEnterd;

        Scanner input = new Scanner(System.in);
        System.out.println("Choose login method:");
        System.out.println("1. Email");
        System.out.println("2. Google");
        System.out.println("3. Fingerprint");
        int choice = input.nextInt();
        Login login; // Polymorphism

        switch (choice) {
            case 1:
                System.out.print("Enter email: ");
                email = input.nextLine();

                System.out.print("Enter password: ");
                password = input.nextLine();

                login = new EmailLogin();
                isEnterd= login.authenticate(email,password);
                break;
            case 2:
                System.out.print("Enter email: ");
                email = input.nextLine();

                login = new GoogleLogin();
                isEnterd= login.authenticate(email);
                break;
            case 3:
                System.out.print("Enter email: ");
                email = input.nextLine();

                System.out.print("Enter password: ");
                password = input.nextLine();
                login = new FingerLogin();
                isEnterd= login.authenticate(email,password);
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        if(isEnterd){
            System.out.println("You login successfully!");
        } else {
            System.out.println("Sorry try again");
        }

    }
}
