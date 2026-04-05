package week01;

import java.util.Scanner;

public class day03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter first number: ");
//        int firstNum = input.nextInt();
//
//        System.out.println("Enter second number: ");
//        int secondNum = input.nextInt();
//
//        System.out.println("the odd numbers is: ");
//        int sum = 0;
//        for (int i = firstNum; i <= secondNum ; i++){
//            if(i%2 != 0){
//                System.out.println(i);
//                sum += i;
//            }
//        }
//        System.out.println("The sum of the odd numbers between them is: " + sum);
//        System.out.println("Enter the number at which you want to stop the counter (1–10):");
//        int num = input.nextInt();
//        for (int i = 1; i <= 10; i++) {
//                if (i == num) {
//                    break;
//                }
//                System.out.println(i);
//        }
//
//        System.out.println("Enter the number you want to skip in the counter from 1 to 10 when it is reached: ");
//        int skippedNum = input.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            if (i == skippedNum) {
//                continue;
//            }
//            System.out.println(i);
//        }

//        System.out.println("Enter the number up to which you want to find the sum of odd numbers (from 1 to that number):");
//        int finalNmu = input.nextInt();
//
//        System.out.println("the odd numbers is: ");
//        int sum = 0;
//        int i = 1;
//        while ( i <= finalNmu ){
//            if(i%2 != 0){
//                System.out.println(i);
//                sum += i;
//            }
//            i++;
//        }
//        System.out.println("The sum of the odd numbers is: " + sum);
        String name = "Rahaf";
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.println(name.charAt(i));
        }
    }
}
