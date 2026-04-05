package week01;

import java.util.Scanner;

public class day01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, welcome to our park");

        System.out.println("Please enter your full name: ");
        String name = input.nextLine();
        System.out.println("Welcome " + name + ", Good to see you here");

        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        System.out.println("Please enter your height: ");
        double height = input.nextDouble();

        System.out.println("Are you a Tuwaiq student? true or false");
        String isTuwaiqStudent = input.next();

        System.out.println("Please enter your blood type: ");
        String bloodType = input.next().toUpperCase();


        if ((age > 20) && (height > 160)) {
            System.out.println(name.split(" ")[0] + ", You are eligible for entering the park");
        } else {
            System.out.println(name.split(" ")[0] + ", You are not eligible for entering the park");
        }

        if (isTuwaiqStudent.equalsIgnoreCase( "true")) {
            System.out.println(name.split(" ")[0] + ", You are eligible for discount");
        } else {
            System.out.println(name.split(" ")[0] + ", You are not eligible for discount");
        }

    }
}
