package week02;

import java.util.ArrayList;
import java.util.Arrays;

public class day01_tasks {
    public static void main(String[] args) {
        //1. Write a Java program to test if the first and the last element of an array of integers is same.
        //The length of the array must be greater than or equal to 2.
        //Test Data: array = 50, -20, 0, 30, 40, 60, 10
        //Sample Output: false
        int[] array1 = {50, -20, 0, 30, 40, 60, 10};

        if (array1.length >= 2) {
            if (array1[0] == array1[array1.length - 1]) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        System.out.println("-----------------------");

        //2. Write a Java program to find the numbers greater than the average of the numbers of a given array.
        //Original Array: [1, 4, 17, 7, 25, 3, 100]
        int[] array2 = {1, 4, 17, 7, 25, 3, 100};

        int sum = 0;
        for (int num : array2) {
            sum += num;
        }

        double avg = (double) sum / array2.length;

        ArrayList<Integer> greater = new ArrayList<>();

        for (int num : array2) {
            if (num > avg) {
                greater.add(num);
            }
        }

        System.out.println("Average: " + avg);
        System.out.println("Greater than average: " + greater);
        System.out.println("\n-----------------------");


        //3. Write a Java program to get the larger value between first and last element of an array of integers.
        //Original Array: [20, 30, 40]
        //Sample Output: Larger value between first and last element: 40
        int[] array3 = {20, 30, 40};

        int first = array3[0];
        int last = array3[array3.length - 1];
        int larger;

        if (first > last) {
            larger = first;
        } else {
            larger = last;
        }

        System.out.println("Larger value between first and last element is: " + larger);
        System.out.println("-----------------------");


        //4. Write a Java program to swap the first and last elements of an array and create a new array.
        //Original Array: [20, 30, 40]
        //Sample Output: New array after swapping the first and last elements: [40, 30, 20]
        int[] array4 = {20, 30, 40};
        int[] newArray = new int[array4.length];

        System.arraycopy(array4, 0, newArray, 0, array4.length);

        int firstIndex = newArray[0];
        newArray[0] = newArray[newArray.length - 1];
        newArray[newArray.length - 1] = firstIndex;

        System.out.println("New array after swapping the first and last elements: " + Arrays.toString(newArray));
        System.out.println("-----------------------");


        //5. Write a program that places the odd elements of an array before the even elements.
        //Original Array: [2,3,40,1,5,9,4,10,7]
        //Sample Output: [3,1,5,9,7,2,40,4,10]
        int[] array5 = {2, 3, 40, 1, 5, 9, 4, 10, 7};

        ArrayList<Integer> result = new ArrayList<>();

        for (int num : array5) {
            if (num % 2 != 0) {
                result.add(num);
            }
        }

        for (int num : array5) {
            if (num % 2 == 0) {
                result.add(num);
            }
        }

        System.out.println(result);
        System.out.println("-----------------------");


        //6. Write a program that test the equality of two arrays.
        //Original Arrays: [2,3,6,6,4] [2,3,6,6,4]
        //Sample Output: true
        int[] array6 = {2, 3, 6, 6, 4};
        int[] array7 = {2, 3, 6, 6, 4};

        boolean isEqual = Arrays.equals(array6, array7);
        System.out.println(isEqual);
        System.out.println("-----------------------");

    }
}
