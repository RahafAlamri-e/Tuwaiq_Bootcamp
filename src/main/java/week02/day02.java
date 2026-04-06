package week02;

import java.util.ArrayList;
import java.util.Scanner;

public class day02 {
    static Scanner input =  new Scanner(System.in);
    static ArrayList <String> results = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("======Quiz program======");
        System.out.println("Welcome to our quiz");
        System.out.println("please enter your name: ");
        String name = input.nextLine();

        System.out.println("please enter your age: ");
        int age = input.nextInt();
        checkAge(name, age);

    }

    public static void checkAge(String name, int age){
        System.out.println("welcome " + name);
        if (age<10){
            System.out.println("you will start now level 1 questions: ");
            quizLevel1();
        } else {
            System.out.println("you will start now level 2 questions: ");
            quizLevel2();
        }

    }

    public static void quizLevel1(){

        for (int i = 0; i < 5; i++){
            int random1 = (int) (Math.random()*11);
            int random2 = (int) (Math.random()*11);
            System.out.println("What is the result of "+ random1 + " + " + random2);
            int userInput = input.nextInt();
            int result = sum(random1,random2);
            if (userInput == result) {
                results.add("correct");
            } else {
                results.add("incorrect");
            }
        }

        for (int i = 0; i < 5; i++){
            int random1 = (int) (Math.random()*11);
            int random2 = (int) (Math.random()*11);
            System.out.println("What is the result of "+ random1 + " - " + random2);
            int userInput = input.nextInt();
            int result = sub(random1,random2);
            if (userInput == result) {
                results.add("correct");
            } else {
                results.add("incorrect");
            }
        }
        checkTheResult();

    }


    public static void quizLevel2(){

        for (int i = 0; i < 5; i++){
            int random1 = (int) (Math.random()*11);
            int random2 = (int) (Math.random()*11);
            System.out.println("What is the result of "+ random1 + " x " + random2);
            int userInput = input.nextInt();
            int result = multi(random1,random2);
            if (userInput == result) {
                results.add("correct");
            } else {
                results.add("incorrect");
            }
        }

        for (int i = 0; i < 5; i++){
            int random1 = (int) (Math.random()*11);
            int random2 = (int) (Math.random()*11);
            while (random2==0){
                random2 = (int) (Math.random()*11);
            }
            System.out.println("What is the result of "+ random1 + " / " + random2);
            double userInput = input.nextDouble();
            double result = div(random1,random2);
            if (userInput == result) {
                results.add("correct");
            } else {
                results.add("incorrect");
            }
        }
        checkTheResult();
    }

    public static void checkTheResult(){

        int correctAnswers = 0;
        for (String res : results) {
            if (res.equals("correct")) {
                correctAnswers++;
            }

        }
        if (correctAnswers >= 7) {
            System.out.println("Congratulations! you passed the quiz with " + correctAnswers + " correct answers");
        } else {
            System.out.println("Sorry! you failed the quiz you got " + correctAnswers + " out of 10");
        }

    }

    public static int sum(int num1, int num2){
        return num1+num2;
    }

    public static int sub(int num1, int num2){
        return num1-num2;
    }

    public static int multi(int num1, int num2){
        return num1*num2;
    }

    public static double div(int num1, int num2){
        return (double) num1 /num2;
    }
}
