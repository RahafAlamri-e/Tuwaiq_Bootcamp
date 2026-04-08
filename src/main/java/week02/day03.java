package week02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class day03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPrice;
        String answer;

        System.out.println("Welcome to our store");
        System.out.println("Please enter the total price for your purchases");
            totalPrice = input.nextInt();

            System.out.println("Are you Student? y or n");
            answer = input.next();

                try {
                    checkTotalPrice(totalPrice);

                } catch (InputMismatchException e) {
                    System.out.println(e.getMessage());
                }

                checkEligibility(totalPrice, answer);


    }

    public static void checkEligibility(int totalPrice, String answer) {
       try {
        if (totalPrice <= 500 && answer.equalsIgnoreCase("n") && totalPrice == 0){
            throw new Exception("Unfortunately, you are not eligible for the 10% discount.");
        }
         } catch (Exception e) {
           System.out.println(e.getMessage());
       }
        if (totalPrice >= 500 && answer.equalsIgnoreCase("y")) {
            System.out.println("Congratulations! You have a 10% discount on your purchase.");
            totalPrice -= (totalPrice * 10/100);
            System.out.println("your updated total price is: " + totalPrice);
        }
    }

    public static void checkTotalPrice(int totalPrice) throws InputMismatchException {
        if (totalPrice < 0) {
            throw new InputMismatchException("Total price cannot be negative.");
        }
    }
}
