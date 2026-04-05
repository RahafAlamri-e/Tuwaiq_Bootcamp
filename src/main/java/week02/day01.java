package week02;

import java.util.Scanner;

public class day01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        String[] names = new String[5];
//        names[0] = "sara";
//        names[1] = "reema";
//        names[2] = "nuha";
//        names[3] = "majd";
//        names[4] = "nour";

//        String longName = names[0];
//        int max = longName.length();
//        for (int i = 0; i <= names.length-1; i++) {
//            if (names[i].length() > max) {
//                max = names[i].length();
//                longName = names[i];
//            }
//        }
//        System.out.println("The longest name is: " + longName);

//        for(String name : names) {
//            if (name.length() > 4) {
//                System.out.println(name);
//            }
//        }

//        for (int i = 0; i < names.length; i++) {
//            if (names[i].startsWith("n")) {
//                System.out.println(names[i]);
//            }
//        }

//        for (String name : names) {
//            if (name.startsWith("n")) {
//                System.out.println(name);
//            }
//        }

//        ArrayList<String> color = new ArrayList<>();
//        color.add("red");
//        color.add("black");
//        color.add("green");
//        color.add("blue");
//
//
//        color.set(1, "white");
//        color.remove(2);
//
//        for (String c : color) {
//            System.out.println(c);
//        }

//        ArrayList<Integer> num = new ArrayList<>();
//        num.add(5);
//        num.add(10);
//        num.add(15);
//        num.add(1);
//        num.add(30);
//
//        ArrayList<Integer> even = new ArrayList<>();
//        ArrayList<Integer> odd = new ArrayList<>();
//
//        for (Integer n : num) {
//            if (n % 2 == 0) {
//                even.add(n);
//            } else {
//                odd.add(n);
//            }
//        }
//        System.out.println("even numbers: " + even);
//        System.out.println("odd numbers: " + odd);


//        ArrayList<String> namesList = new ArrayList<>();
//        String name;
//        while (true) {
//            System.out.println("Enter name (or -1 to stop): ");
//            name = input.nextLine();
//            if (!name.equals("-1")) {
//                namesList.add(name);
//            } else {
//                break;
//            }
//        }
//        ArrayList<String> threeLetter = new ArrayList<>();
//        ArrayList<String> fourLetter = new ArrayList<>();
//        ArrayList<String> otherLetter = new ArrayList<>();
//        for (String n : namesList) {
//            if (n.length() == 3) {
//                threeLetter.add(n);
//            } else if (n.length() == 4) {
//                fourLetter.add(n);
//            } else {
//                otherLetter.add(n);
//            }
//        }
//        System.out.println("3 letters name: " + threeLetter);
//        System.out.println("4 letters name: " + fourLetter);
//        System.out.println("other: " + otherLetter);


        int num;
        int sum = 0;
        System.out.println("Enter positive number: ");
        num = input.nextInt();
        while (num < 0) {
            System.out.println("Please enter positive number: ");
            num = input.nextInt();
        }

        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("sum: "+ sum);

//

//        int sum = 0;
//        int number;
//        while (true) {
//            System.out.println("Enter a number (or 0 to stop): ");
//            number = input.nextInt();
//            if (number != 0) {
//                sum += number;
//            } else {
//                break;
//            }
//        }
//        System.out.println("sum is: " + sum);
//




    }
}
