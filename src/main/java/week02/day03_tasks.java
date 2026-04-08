package week02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class day03_tasks {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        // 1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers , takes two numbers as input
        System.out.println("======Calculator Program======");
        int num1, num2, sum, difference, product, remainder;
        double quotient;

        System.out.println("Please enter first number: ");
        try {
            num1 =  input.nextInt();
            System.out.println("Please enter second number: ");
            num2 = input.nextInt();

            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + sum);

            difference = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + difference);

            product = num1 * num2;
            System.out.println(num1 + " x " + num2 + " = " + product);

            quotient = (double) num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + quotient);

            remainder = num1 % num2;
            System.out.println(num1 + " % " + num2 + " = " + remainder);

        }catch (InputMismatchException e){
            System.out.println("Invalid input, it should be number ");
        } catch (ArithmeticException e){
        System.out.println(e.getMessage());
         }

        System.out.println("------------------------------");



        // 2. Write a Java program that takes a number as input and prints its multiplication table up to 10.
        System.out.println("======Multiplication Table Program======");
        int number;

        System.out.println("Please enter a number to print its multiplication table: ");
        try {
            input.nextLine();
            number = input.nextInt();
            if (number < 0){
                throw new Exception("You should enter positive number");
            }
            for (int i = 1; i <= 10; i++) {
                int result = number * i;
                System.out.println(number + " x " + i + " = " + result);
            }

         } catch (InputMismatchException e){
                System.out.println("Invalid input, you should enter number");
         } catch (Exception e){
                 System.out.println(e.getMessage());
         }

        System.out.println("------------------------------");


        // 3. Write a Java program to print the area and perimeter of a circle.
        System.out.println("======Circle Area and Perimeter Program======");
        double radius, area, perimeter;

        System.out.println("Please enter the radius of the circle: ");
        try {
            input.nextLine();
            radius = input.nextDouble();
            if(radius < 0) {
                throw new Exception("Sorry! radius can not be negative please enter positive");
            }
            perimeter = 2 * 3.14 * radius;
            area = 3.14 * radius * radius;

            System.out.println("Perimeter of the circle: " + perimeter);
            System.out.println("Area of the circle: " + area);

        } catch (InputMismatchException e){
            System.out.println("You should enter number");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("------------------------------");


        // 4. Java program to find out the average of a set of integers
        System.out.println("======Average of a Set of Integers Program======");
        int count, sumOfIntegers = 0, numberInput;
        double average;

        System.out.println("Please enter the count of numbers: ");
        try {
            input.nextLine();
            count = input.nextInt();

            if (count <= 0) {
                throw new Exception("Count should be greater than 0");
            }

            for (int i = 1; i <= count; i++) {
                System.out.println("Please enter an integer: ");
                numberInput = input.nextInt();
                sumOfIntegers += numberInput;
            }

            average = (double) sumOfIntegers / count;
            System.out.println("The average is: " + average);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input, you should enter integer number");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------");


        // 5. Write a Java program that accepts three integers as input, adds the first two integers together, and then determines whether the sum is equal to the third integer.
        System.out.println("======Sum Comparison Program======");
        int number1, number2, number3, sumOfFirstTwo;

        try {
            System.out.println("Please enter the first integer: ");
            input.nextLine();
            number1 = input.nextInt();

            System.out.println("Please enter the second integer: ");
            number2 = input.nextInt();

            System.out.println("Please enter the third integer(sum of the two number above): ");
            number3 = input.nextInt();

            sumOfFirstTwo = number1 + number2;

            if (sumOfFirstTwo == number3) {
                System.out.println("The sum of the first two numbers is equal to the third number");
            } else {
                System.out.println("The sum of the first two numbers is not equal to the third number");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input, you should enter integer number");
        }
        System.out.println("------------------------------");


        // 6. Write a Java program to reverse a word.
        System.out.println("======Word Reversal Program======");
        String word;

        System.out.println("Please enter a word to reverse: ");
        try {
            input.nextLine();
            word = input.nextLine();

            if (word.isEmpty()) {
                throw new NullPointerException("Word can not be empty");
            }

            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.println();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------");


        // 7. Java program to check whether the given number is even or odd
        System.out.println("======Even or Odd Program======");
        int numberToCheck;

        System.out.println("Please enter a number to check if it is even or odd: ");
        try {
            input.nextLine();
            numberToCheck = input.nextInt();

            if (numberToCheck % 2 == 0) {
                System.out.println("The number is Even");
            } else {
                System.out.println("The number is Odd");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input, you should enter number");
        }
        System.out.println("------------------------------");


        // 8. Java program to convert the temperature in Centigrade to Fahrenheit
        System.out.println("======Temperature Conversion Program======");
        double tempInCelsius, tempInFahrenheit;

        System.out.println("Please enter the temperature in Celsius: ");
        try {
            input.nextLine();
            tempInCelsius = input.nextDouble();

            tempInFahrenheit = (tempInCelsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit is: " + tempInFahrenheit);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input, you should enter number");
        }
        System.out.println("------------------------------");


        // 9. Write a Java program that takes a string and a number from the user, then prints the character in the given index.
        System.out.println("======Character at Index Program======");
        String inputString;
        int index;
        char letterAtIndex;

        try {
            System.out.println("Please enter string: ");
            input.nextLine();
            inputString = input.nextLine();

            if (inputString.isEmpty()) {
                throw new NullPointerException("String can not be empty");
            }

            System.out.println("Please enter index: ");
            index = input.nextInt();

            if (index < 0 || index >= inputString.length()) {
                throw new ArrayIndexOutOfBoundsException("Invalid index. number should be between 0 and " + (inputString.length() - 1));
            }

            letterAtIndex = inputString.charAt(index);
            System.out.println("The letter is: " + letterAtIndex);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input, index should be integer number");
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------");


        // 10. Write a Java program to print the area and perimeter of a rectangle.
        System.out.println("======Rectangle Area and Perimeter Program======");
        double height, width, areaOfRectangle, perimeterOfRectangle;

        try {
            System.out.println("Please enter the height: ");
            input.nextLine();
            height = input.nextDouble();

            System.out.println("Please enter the width: ");
            width = input.nextDouble();

            if (height < 0 || width < 0) {
                throw new Exception("Height and width can not be negative");
            }

            areaOfRectangle = height * width;
            perimeterOfRectangle = 2 * (height + width);

            System.out.println("Area is: " + areaOfRectangle);
            System.out.println("Perimeter is: " + perimeterOfRectangle);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input, you should enter number");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------");


        // 11. Write a Java program to compare two numbers.
        System.out.println("======Number Comparison Program======");
        double firstNumber, secondNumber;

        try {
            System.out.println("Please enter first number: ");
            input.nextLine();
            firstNumber = input.nextDouble();

            System.out.println("Please enter second number: ");
            secondNumber = input.nextDouble();

            if (firstNumber == secondNumber) {
                System.out.println(firstNumber + " == " + secondNumber);
            }
            if (firstNumber != secondNumber) {
                System.out.println(firstNumber + " != " + secondNumber);
            }
            if (firstNumber > secondNumber) {
                System.out.println(firstNumber + " > " + secondNumber);
            }
            if (firstNumber < secondNumber) {
                System.out.println(firstNumber + " < " + secondNumber);
            }
            if (firstNumber >= secondNumber) {
                System.out.println(firstNumber + " >= " + secondNumber);
            }
            if (firstNumber <= secondNumber) {
                System.out.println(firstNumber + " <= " + secondNumber);
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input, you should enter number");
        }
        System.out.println("------------------------------");


// 12. Write a Java program to convert seconds to hours, minutes and seconds.
        System.out.println("======Seconds Conversion Program======");
        int totalSeconds, hours, minutes, seconds;

        System.out.println("Please enter the total seconds: ");
        try {
            input.nextLine();
            totalSeconds = input.nextInt();

            if (totalSeconds < 0) {
                throw new Exception("Seconds can not be negative");
            }

            hours = totalSeconds / 3600;
            minutes = (totalSeconds % 3600) / 60;
            seconds = totalSeconds % 60;

            System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input, you should enter integer number");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------");


        // 13. Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.
        System.out.println("======Four Number Equality Program======");
        int numA, numB, numC, numD;

        try {
            System.out.println("Please enter first number: ");
            input.nextLine();
            numA = input.nextInt();

            System.out.println("Please enter second number: ");
            numB = input.nextInt();

            System.out.println("Please enter third number: ");
            numC = input.nextInt();

            System.out.println("Please enter fourth number: ");
            numD = input.nextInt();

            if (numA == numB && numB == numC && numC == numD) {
                System.out.println("Numbers are equal!");
            } else {
                System.out.println("Numbers are not equal!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input, you should enter integer number");
        }
        System.out.println("------------------------------");


        // 14. Write a Java program that reads an integer and check whether it is negative, zero, or positive.
        System.out.println("======Number Sign Check Program======");
        int numberToCheckSign;

        try {
            System.out.println("Please enter a number: ");
            input.nextLine();
            numberToCheckSign = input.nextInt();

            if (numberToCheckSign > 0) {
                System.out.println("Number is positive");
            } else if (numberToCheckSign < 0) {
                System.out.println("Number is negative");
            } else {
                System.out.println("Number is zero");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input, you should enter integer number");
        }
        System.out.println("------------------------------");


        // 15. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered (End loop use -1, Don’t count -1).
        System.out.println("======Positive, Negative and Zero Count Program======");
        int countPositive = 0, countNegative = 0, countZero = 0, userInput;

        try {
            do {
                System.out.println("Please enter a number (or -1 to stop): ");
                input.nextLine();
                userInput = input.nextInt();

                if (userInput > 0) {
                    countPositive++;
                } else if (userInput < 0 && userInput != -1) {
                    countNegative++;
                } else if (userInput == 0) {
                    countZero++;
                }

            } while (userInput != -1);

            System.out.println("Count of positive numbers: " + countPositive);
            System.out.println("Count of negative numbers: " + countNegative);
            System.out.println("Count of zeros: " + countZero);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input, you should enter integer number");
        }
        System.out.println("------------------------------");


        // 16. Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
        System.out.println("======Digit Reversal Program======");
        int numberToReverse;

        try {
            System.out.println("Please enter an integer to reverse: ");
            input.nextLine();
            numberToReverse = input.nextInt();

            String str = String.valueOf(numberToReverse);
            StringBuilder reversed = new StringBuilder();

            for (int i = str.length() - 1; i >= 0; i--) {
                reversed.append(str.charAt(i));
            }

            System.out.println("Reversed: " + reversed);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input, you should enter integer number");
        }
        System.out.println("------------------------------");

        // 17. Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.
        System.out.println("======Largest and Smallest Number Program======");
        int num, max = 0, min = 0;
        char choice;
        boolean first = true;

        try {
            do {
                System.out.print("Enter the number: ");
                input.nextLine();
                num = input.nextInt();

                if (first) {
                    max = num;
                    min = num;
                    first = false;
                } else {
                    if (num > max) {
                        max = num;
                    }
                    if (num < min) {
                        min = num;
                    }
                }

                System.out.print("Do you want to continue? (y/n): ");
                choice = input.next().charAt(0);

                if (choice != 'y' && choice != 'Y' && choice != 'n' && choice != 'N') {
                    throw new Exception("Invalid choice, please enter y or n");
                }

            } while (choice == 'y' || choice == 'Y');

            System.out.println("The large number: " + max);
            System.out.println("The small number: " + min);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input, you should enter integer number");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------");


        // 18. Determine and print the number of times the character ‘a’ appears in the input entered by the user.
        System.out.println("======Character Count Program======");
        String userString;
        int countA = 0;

        try {
            System.out.println("Please enter a string: ");
            input.nextLine();
            userString = input.nextLine();

            if (userString.isEmpty()) {
                throw new Exception("String can not be empty");
            }

            for (int i = 0; i < userString.length(); i++) {
                if (userString.toLowerCase().charAt(i) == 'a') {
                    countA++;
                }
            }

            System.out.println("Number of a's: " + countA);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------");
    }
}
