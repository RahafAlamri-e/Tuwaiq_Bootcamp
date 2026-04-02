import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers , takes two numbers as input
        System.out.println("======Calculator Program======");
        int num1, num2, sum, difference, product, remainder;
        double quotient;

        System.out.println("Please enter first number: ");
        num1 =  input.nextInt();

        System.out.println("Please enter second number: ");
        num2 = input.nextInt();

        sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);

        difference = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + difference);

        product = num1 * num2;
        System.out.println(num1 + " x " + num2 + " = " + product);

        while (num2 == 0){
            System.out.println("Cannot divide by zero. Please enter a non-zero number: ");
            num2 = input.nextInt();
        }

        quotient = (double) num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + quotient);

        remainder = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + remainder);

        System.out.println("------------------------------");


        // 2. Write a Java program that takes a number as input and prints its multiplication table up to 10.
        System.out.println("======Multiplication Table Program======");
        int number;

        System.out.println("Please enter a number to print its multiplication table: ");
        number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
        System.out.println("------------------------------");


        // 3. Write a Java program to print the area and perimeter of a circle.
        System.out.println("======Circle Area and Perimeter Program======");
        double radius, area, perimeter;

        System.out.println("Please enter the radius of the circle: ");
        radius = input.nextDouble();

        perimeter = 2 *  3.14 * radius;
        System.out.println("Perimeter of the circle: " + perimeter);

        area =  3.14 * radius * radius;
        System.out.println("Area of the circle: " + area);
        System.out.println("------------------------------");


        // 4. Java program to find out the average of a set of integers
        System.out.println("======Average of a Set of Integers Program======");
        int count, sumOfIntegers = 0, numberInput;
        double average;

        System.out.println("Please enter the count of numbers: ");
        count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println("Please enter an integer: ");
            numberInput = input.nextInt();
            sumOfIntegers += numberInput;
        }
        average = (double) sumOfIntegers / count;
        System.out.println("The average is: " + average);
        System.out.println("------------------------------");


        // 5. Write a Java program that accepts three integers as input, adds the first two integers together, and then determines whether the sum is equal to the third integer.
        System.out.println("======Sum Comparison Program======");
        int number1, number2, number3, sumOfFirstTwo;

        System.out.println("Please enter the first integer: ");
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
        System.out.println("------------------------------");


        // 6. Write a Java program to reverse a word.
        System.out.println("======Word Reversal Program======");
        String word;

        System.out.println("Please enter a word to reverse: ");
        input.nextLine();
        word = input.nextLine();

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
        System.out.println("\n------------------------------");


        // 7. Java program to check whether the given number is even or odd
        System.out.println("======Even or Odd Program======");
        int numberToCheck;

        System.out.println("Please enter a number to check if it is even or odd: ");
        numberToCheck = input.nextInt();

        if(numberToCheck % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
        System.out.println("------------------------------");


        // 8. Java program to convert the temperature in Centigrade to Fahrenheit
        System.out.println("======Temperature Conversion Program======");
        double tempInCelsius, tempInFahrenheit;

        System.out.println("Please enter the temperature in Celsius: ");
        tempInCelsius = input.nextDouble();

        tempInFahrenheit = (tempInCelsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit is: "+ tempInFahrenheit);
        System.out.println("------------------------------");


        // 9. Write a Java program that takes a string and a number from the user,then prints the character in the given index.
        System.out.println("======Character at Index Program======");
        String inputString;
        int index;
        char letterAtIndex;

        System.out.println("Please enter string: ");
        input.nextLine();
        inputString = input.nextLine();

        System.out.println("Please enter index: ");
        index = input.nextInt();

        while (index < 0 || index >= inputString.length()) {
            System.out.println("Invalid index. Please enter a number between 0 and " + (inputString.length() - 1) + ": ");
            index = input.nextInt();
        }

        letterAtIndex = inputString.charAt(index);
        System.out.println("The letter is: " + letterAtIndex);
        System.out.println("------------------------------");


        // 10. Write a Java program to print the area and perimeter of a rectangle.
        System.out.println("======Rectangle Area and Perimeter Program======");
        double Height, width, areaOfRectangle, perimeterOfRectangle;

        System.out.println("Please enter the height: ");
        Height = input.nextDouble();

        System.out.println("Please enter the width: ");
        width = input.nextDouble();

        areaOfRectangle = Height * width;
        System.out.println("Area is: " + areaOfRectangle);

        perimeterOfRectangle = 2 * (Height + width);
        System.out.println("Perimeter is: " + perimeterOfRectangle);
        System.out.println("------------------------------");


        // 11. Write a Java program to compare two numbers.
        System.out.println("======Number Comparison Program======");
        double firstNumber, secondNumber;

        System.out.println("Please enter first number: ");
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

        System.out.println("------------------------------");


        // 12. Write a Java program to convert seconds to hours, minutes and seconds.
        System.out.println("======Seconds Conversion Program======");
        int totalSeconds, hours, minutes, seconds;

        System.out.println("Please enter the total seconds: ");
        totalSeconds = input.nextInt();

        hours = totalSeconds / 3600;
        minutes = (totalSeconds % 3600) / 60;
        seconds = totalSeconds % 60;

        System.out.printf("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println("\n------------------------------");

        // 13. Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.
        System.out.println("======Four Number Equality Program======");
        int numA, numB, numC, numD;

        System.out.println("Please enter first number: ");
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

        System.out.println("------------------------------");


        // 14. Write a Java program that reads an integer and check whether it is negative, zero, or positive.
        System.out.println("======Number Sign Check Program======");
        int numberToCheckSign;

        System.out.println("Please enter a number: ");
        numberToCheckSign = input.nextInt();

        if (numberToCheckSign > 0) {
            System.out.println("Number is positive");
        } else if (numberToCheckSign < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
        System.out.println("------------------------------");


        // 15. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered (End loop use -1 , Don’t count -1).
        System.out.println("======Positive, Negative and Zero Count Program======");
        int countPositive = 0, countNegative = 0, countZero = 0, userInput;

        do {
            System.out.println("Please enter a number (or -1 to stop): ");
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

        System.out.println("------------------------------");


        // 16. Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
        System.out.println("======Digit Reversal Program======");
        int numberToReverse;

        System.out.println("Please enter an integer to reverse: ");
        numberToReverse = input.nextInt();

        String str = String.valueOf(numberToReverse);

        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        System.out.println("Reversed: " + reversed);
        System.out.println("------------------------------");


        // 17. Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.
        System.out.println("======Largest and Smallest Number Program======");
        int num, max = 0, min = 0;
        char choice;
        boolean first = true;

        do {
            System.out.print("Enter the number: ");
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
                System.out.println("Invalid choice. Please enter 'y' or 'n'.");
                choice = input.next().charAt(0);
            }

        } while (choice == 'y' || choice == 'Y');

        System.out.println("The large number: " + max);
        System.out.println("The small number: " + min);

        System.out.println("------------------------------");


        // 18. Determine and print the number of times the character ‘a’ appears in the input entered by the user.
        System.out.println("======Character Count Program======");
        String userString;
        int countA = 0;

        System.out.println("Please enter a string: ");
        input.nextLine();
        userString = input.nextLine();

        for (int i = 0; i < userString.length(); i++) {
            if (userString.toLowerCase().charAt(i)=='a') {
                countA++;
            }
        }
        System.out.println("Number of a's: " + countA);
        System.out.println("------------------------------");

    }
}
