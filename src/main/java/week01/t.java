package week01;

import java.util.Random;
import java.util.Scanner;

public class t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        int num = number.nextInt(1,10);

        System.out.println("Enter number: ");
        int numA = input.nextInt();

        if (numA > num) {
            System.out.println("entered number is greater than the Generated number");
        }
        if (numA < num) {
            System.out.println("entered number is less than the Generated number");
        }
        if (numA == num) {
            System.out.println("entered number is equal ");
        }
        System.out.println("Generated number is: " + num);


    }
}
