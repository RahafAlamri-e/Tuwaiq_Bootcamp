package week02;

import java.util.Scanner;

public class day02_tasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q1
        System.out.println("======Smallest Number Program======");
        double num1, num2, num3;

        System.out.println("Please enter first number");
        num1 = input.nextDouble();

        System.out.println("Please enter second number");
        num2 = input.nextDouble();

        System.out.println("Please enter third number");
        num3 = input.nextDouble();

        System.out.println("The smallest value is " + findSmallNum(num1, num2, num3));
        System.out.println("---------------------------");


        // Q2.
        System.out.println("======Check if Positive or Negative Program======");
        int numToCheck;

        System.out.println("Please enter number");
        numToCheck = input.nextInt();

        System.out.println("The number is: " + checkNumberSign(numToCheck));
        System.out.println("---------------------------");


        // Q3.
        System.out.println("======Check Password Validate Program======");
        String password;

        System.out.println("A password must have at least 8 characters.");
        System.out.println("A password consist of only letters and digits.");
        System.out.println("A password must contain at least 2 digits.");
        System.out.println("\nPlease enter your password: ");
        input.nextLine();
        password = input.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Password is invalid.");
        }
        System.out.println("---------------------------");

    }


    public static double findSmallNum(double num1 ,double num2, double num3){
        double smallNum = num1;

        if (num2 < smallNum && num2 < num3){
            smallNum = num2;
        } else if (num3 < smallNum && num3 < num2) {
            smallNum = num3;
        }

        return smallNum;
    }

    public static String checkNumberSign(int num){
        String sign;
        if (num < 0){
            sign = "Negative";
        } else if (num > 0) {
            sign = "Positive";
        } else {
            sign = "Zero";
        }

        return sign;
    }

    public static boolean isValidPassword(String pass){
        boolean isValid = true;
        boolean onlyLettersAndDigits = true;
        int digitCount = 0;


        if (pass.length() <= 8) {
            System.out.println("Password must be at least 8 characters.");
            isValid = false;
        }

        for (char c : pass.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
            if (!Character.isLetterOrDigit(c)) {
                onlyLettersAndDigits = false;
            }
        }

        if (!onlyLettersAndDigits) {
            System.out.println("Password must consist of only letters and digits.");
            isValid = false;
        }

        if (digitCount < 2) {
            System.out.println("Password must contain at least 2 digits.");
            isValid = false;
        }

        return isValid;
    }
}
