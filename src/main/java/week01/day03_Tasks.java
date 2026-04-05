package week01;

import java.util.Scanner;

public class day03_Tasks {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        //1. Write a program that prints the numbers from 1 to 100 such that:
        //If the number is a multiple of 3, you need to print "Fizz" instead of that number.
        //If the number is a multiple of 5, you need to print "Buzz" instead of that number.
        //If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
        System.out.println("-----------------------");


        //2. Write a Java program to reverse a string.
        //Test Data: Input a string: The quick brown fox
        //Expected Output: Reverse string: xof nworb kciuq ehT
        System.out.println("Enter text to reverse it: ");
        String text = input.nextLine();
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
        System.out.println();
        System.out.println("-----------------------");


        //3. Write a program to find the factorial value of any number entered through the keyboard.
        System.out.print("Enter a number to find the factorial value: ");
        int number = input.nextInt();

        while (number < 0) {
            System.out.println("Please enter positive number:");
            number = input.nextInt();
        }
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial is " + factorial);
        System.out.println("-----------------------");


        //4. Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
        System.out.println("Enter two number to find 1st number power of 2ed number");
        System.out.print("Enter first number: ");
        int firstNum = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = input.nextInt();

        int result = 1;

        for (int i = 1; i <= secondNum; i++) {
            result = result * firstNum;
        }
        System.out.println("Result is: " + result);
        System.out.println("-----------------------");


        //5. Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        System.out.print("How many numbers do you want to enter? ");
        int n = input.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();

            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        System.out.println("Sum of even numbers = " + evenSum);
        System.out.println("Sum of odd numbers = " + oddSum);
        System.out.println("-----------------------");


        //6. Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.
        int num;
        System.out.print("Enter a positive number: ");
        num = input.nextInt();
        while (num <= 0) {
            System.out.println("The number is not positive. Please try again");
            num = input.nextInt();
        }

        boolean isPrime = true;

        if (num == 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        System.out.println("-----------------------");


        //7. Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use another for loop to print the days (Days 1 -7) for each week.
        for (int week = 1; week <= 4; week++) {
            System.out.println("\nWeek " + week);

            for (int day = 1; day <= 7; day++) {
                System.out.println("Day " + day);
            }
        }
        System.out.println("-----------------------");


        //8. Write a program that's check if the word is a palindrome or not. hint: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.
        input.nextLine();
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
        System.out.println("-----------------------");
    }
}
