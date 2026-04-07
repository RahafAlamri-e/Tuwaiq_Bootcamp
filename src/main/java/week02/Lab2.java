package week02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab2 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        // Q1
        System.out.println("====Longest word Program====");
        String[] word = {"cat", "dog", "red", "is", "am"};
        ArrayList<String> longest = new ArrayList<>();
        int letterCount = 0;

        for (String w : word) {
            if (w.length() > letterCount) {
                longest.clear();
                longest.add(w);
                letterCount = w.length();
            } else if (w.length() == letterCount) {
                longest.add(w);
            }
        }
        System.out.println("Longest word is: " + longest);
        System.out.println("---------------------------");


        // Q2
        System.out.println("====Number of occurrences of an element====");
        int[] numArr =  {1, 1, 1,3, 3, 5};

        for (int i = 0; i < numArr.length; i++) {

            boolean firstTime = true;
            for (int k = 0; k < i; k++) {
                if (numArr[i] == numArr[k]) {
                    firstTime = false;
                    break;
                }
            }

            int count = 0;
            for (int j = 0; j < numArr.length; j++) {
                if (numArr[i] == numArr[j]) {
                    count++;
                }
            }

            if (firstTime) {
                System.out.println(numArr[i] + " occurs " + count + " times");
            }
        }
        System.out.println("---------------------------");


        // Q3
        System.out.println("==== 3 largest element in array====");
        int[] ElementArray = {1, 4, 17, 7, 25, 3, 100};

        Arrays.sort(ElementArray);
        System.out.println("3 largest element in array:");

        for (int i = ElementArray.length - 1; i >= ElementArray.length - 3; i--) {
            System.out.println(ElementArray[i]);
        }
        System.out.println("---------------------------");


        // َQ4 create method to reverse array of integer without create new array
        System.out.println("====Reverse Array of integer====");
        int [] intArr = {5, 4, 3, 2, 1};
        reverseArr(intArr);

        System.out.println("Reversed Array: "+ Arrays.toString(intArr));
        System.out.println("---------------------------");


        //Q5
        System.out.println("====Menu Driven Program====");
        int[] arr = {};
        int size;
        boolean exit = false;

        while (!exit) {
            System.out.println("\n1. Add elements");
            System.out.println("2. Display elements");
            System.out.println("3. Search element");
            System.out.println("4. Sort array");
            System.out.println("5. Exit\n");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the number of elements you want to add: ");
                    size = input.nextInt();
                    arr = new int[size];
                    System.out.println("Enter the elements: ");
                    for (int i = 0; i < size; i++) {
                        System.out.println("element "+(i+1) + ": ");
                        arr[i]= input.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Elements in the array: " + Arrays.toString(arr));
                    break;
                case 3:
                    System.out.println("Enter the element you want to search: ");
                    int searchElement = input.nextInt();
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] == searchElement) {
                            System.out.println("Element found");
                            break;
                        }
                        if (i == arr.length - 1) {
                            System.out.println("Element not found in the array.");
                        }
                    }
                    break;
                case 4:
                    for (int i = 0; i < arr.length - 1; i++) {
                        for (int j = 0; j < arr.length - i - 1; j++) {
                            if (arr[j] > arr[j + 1]) {
                                int big = arr[j];
                                arr[j] = arr[j + 1];
                                arr[j + 1] = big;
                            }
                        }
                    }
                    System.out.println("Sorted array: " + Arrays.toString(arr));
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("---------------------------");

        }


        //Q6
        System.out.println("====Generate Random Numbers====");
        System.out.print("Enter min: ");
        int min = input.nextInt();

        System.out.print("Enter max: ");
        int max = input.nextInt();

        System.out.print("How many numbers: ");
        int count = input.nextInt();

        System.out.println("Random numbers within the specified range:  ");
        generateRandom(min, max, count);
        System.out.println();
        System.out.println("---------------------------");


        // Q7
        System.out.println("====Check Password Strength====");
        System.out.print("Enter password: ");
        input.nextLine();
        String password = input.nextLine();

        int score = 0;

        score += checkLength(password);
        score += checkSpecialCharacters(password);
        score += checkUpperCaseLowerCase(password);

        if (score >= 8) {
            System.out.println("Strong");
        } else if (score >= 5) {
            System.out.println("Moderate");
        } else {
            System.out.println("Weak");
        }
        System.out.println("---------------------------");

        // Q8
        System.out.println("====Fibonacci Sequence====");
        System.out.print("Enter number of terms: ");
        int n ;
        n = input.nextInt();

        fibonacci(n);

        System.out.println();
        System.out.println("---------------------------");
    }

    public static void fibonacci(int n) {
        int a = 0, b = 1;
        while ( n == 0 ){
            System.out.println("Please enter another number: ");
            n = input.nextInt();
        }
        if (n==1){
            System.out.println("0");
        } else {
            System.out.print(a + ", " + b + ", ");

            for (int i = 2; i < n; i++) {
                int next = a + b;
                System.out.print(next + ", ");
                a = b;
                b = next;
            }
        }
    }

    public static int checkLength(String pass) {
        if (pass.length() >= 8) {
            return 3;
        } else if (pass.length() >= 6){
            return 2;
        } else {
            return 0;
        }
    }

    public static int checkSpecialCharacters(String pass) {
        for (char c : pass.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return 2;
            }
        }
        return 0;
    }

    public static int checkUpperCaseLowerCase(String pass) {
        boolean hasUpper = false, hasLower = false;

        for (char c : pass.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            }
            if (Character.isLowerCase(c)) {
                hasLower = true;
            }
        }

        if(hasUpper && hasLower){
            return 3;
        } else {
            return 0;
        }
    }

    public static void reverseArr(int[] arr){
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }


    public static void generateRandom(int min, int max, int count) {
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            int num = rand.nextInt(min,(max+1));
            System.out.print(num + " ");
        }
    }

}
