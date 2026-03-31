import java.util.Scanner;

public class day02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int totalPrice;
//
//        System.out.println("Welcome to our store");
//        System.out.println("Please enter the total price for your purchases");
//        totalPrice = input.nextInt();
//
//        if (totalPrice >= 500){
//            System.out.println("Congratulations! You have a 10% discount on your purchase.");
//            totalPrice -= (totalPrice * 10/100);
//            System.out.println("your updated total price is: " + totalPrice);
//        } else {
//            System.out.println("Unfortunately, you are not eligible for the 10% discount.");
//            int addAmount = 500 - totalPrice;
//            System.out.println("You can add purchases worth " + addAmount + " SAR to get the discount");
//        }

        double num1, num2, result;
        char operation;

        System.out.println("Please enter first number: ");
        num1 = input.nextDouble();

        System.out.println("Please enter second number: ");
        num2 = input.nextDouble();

        System.out.println("Choose operation (+, -, *, /): ");
        operation = input.next().charAt(0);

        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;

            default:
                System.out.println("Invalid operation");
        }

    }
}
