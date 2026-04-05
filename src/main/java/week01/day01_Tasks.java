package week01;

import java.util.Scanner;

public class day01_Tasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1. Develop a program that takes the weight (in kilograms) and height (in meters) as input and calculates the BMI, then prints it.
        // • Input: Weight (kg) = 70, Height (m) = 1.75
        // • Expected Output: BMI = 22.86
        System.out.println("=== BMI Calculator ===");
        System.out.println("Please enter your weight in kilograms: ");
        double weight = input.nextDouble();
        System.out.println("Please enter your height in meters: ");
        double height = input.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("-----------------------------------");

        //2. Write a program that takes the obtained marks and total marks as input and calculates the percentage, then prints it.
        //• Input: Obtained Marks = 85, Total Marks = 100
        //• Expected Output: Percentage = 85.0%
        System.out.println("=== Percentage Calculator ===");
        System.out.println("Please enter the obtained marks: ");
        double obtainedMarks = input.nextDouble();

        System.out.println("Please enter the total marks: ");
        double totalMarks = input.nextDouble();

        double percentage = (obtainedMarks / totalMarks) * 100;
        System.out.println("Your percentage is: " + percentage + "%");
        System.out.println("-----------------------------------");

        //3. Create a program that takes an amount in one currency and an exchange rate as input, then converts and prints the amount in another currency.
        //• Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
        //• Expected Output: Amount in EUR = 85.0
        System.out.println("=== Currency Converter ===");
        System.out.println("Please enter the amount in USD that you want convert to EUR: ");
        double amountUSD = input.nextDouble();

        double exchangeRate = 0.85;
        double amountEUR = amountUSD * exchangeRate;
        System.out.println("The amount in EUR is: " + amountEUR);
        System.out.println("-----------------------------------");

        //4. Create a program that takes a string as input, calculates its length, and then reverses the string using the StringBuilder class, finally printing both the length and reversed string.
        //• Input: "Hello, World!"
        //• Expected Output: Length of the string: 13 And Reversed string: "!dlroW,olleH"
        System.out.println("=== String Manipulator ===");
        System.out.println("Please enter a string: ");
        input.nextLine();
        String word = input.nextLine();

        int length = word.length();
        String reversed = new StringBuilder(word).reverse().toString();
        System.out.println("Length of the string: " + length + " And Reversed string: \"" + reversed + "\"");
        System.out.println("-----------------------------------");


        //5. Develop a program that takes a sentence as input and extracts a substring from it, then prints the extracted substring.
        //• Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index= 10, End Index = 20
        //• Expected Output: "brown fox"
        System.out.println("=== Substring Extractor ===");
        System.out.println("Please enter a sentence: ");
        String sentence = input.nextLine();

        System.out.println("Please enter start index: ");
        int startIndex = input.nextInt();

        System.out.println("Please enter end index: ");
        int endIndex = input.nextInt();

        String substring = sentence.substring(startIndex, endIndex);
        System.out.println("Extracted substring: " + substring);
        System.out.println("-----------------------------------");

        //6. Write a program that takes a sentence and a keyword as input, then check if the keyword is present in the sentence and prints the result.
        //• Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword ="jumps"
        //• Expected Output: Keyword "jumps" is present in the sentence.
        System.out.println("=== Keyword Checker ===");
        System.out.println("Please enter a sentence: ");
        String sentence2 = input.nextLine();

        System.out.println("Please enter a keyword: ");
        String keyword = input.nextLine();

        if (sentence2.contains(keyword)) {
            System.out.println("Keyword \"" + keyword + "\" is present in the sentence.");
        } else {
            System.out.println("Keyword \"" + keyword + "\" is not present in the sentence.");
        }

        System.out.println("-----------------------------------");

        //7. Develop a program that takes a sentence and a word to replace as input, then replace all occurrences of the word with another word and prints the modified sentence.
        //• Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to Replace = "fox", Replacement Word = "cat"
        //• Expected Output: "The quick brown cat jumps over the lazy dog"
        System.out.println("=== Word Replacer ===");
        System.out.print("Please enter a sentence: ");
        String sentence3 = input.nextLine();

        System.out.print("Please enter word to replace: ");
        String wordToReplace = input.nextLine();

        System.out.print("Please enter replacement word: ");
        String replacementWord = input.nextLine();

        String modified = sentence3.replace(wordToReplace, replacementWord);
        System.out.println("Result: " + modified);
        System.out.println("-----------------------------------");

        //8. Write a program that takes two strings as input and check if they are equal, ignoring the case, then prints whether they are equal or not.
        //• Input: String 1 = "Hello", String 2 = "hello"
        //• Expected Output: Strings are equal (ignoring case).
        System.out.println("=== String Comparator ===");
        System.out.print("Please enter first string: ");
        String s1 = input.nextLine();

        System.out.print("Please enter second string: ");
        String s2 = input.nextLine();

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        System.out.println("-----------------------------------");

    }
}
