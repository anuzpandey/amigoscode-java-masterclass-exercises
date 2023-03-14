package com.anuzpandey;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ScannersTakingUserInput {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // exerciseOne(input);
        // exerciseTwo(input);
        // exerciseThree(input);
        exerciseFour(input);
    }

    /**
     * Take an input string from the user (from the terminal)
     * and print it back out all in upper case
     */
    public static void exerciseOne(Scanner input) {
        System.out.println("----- Exercise One -----");
        System.out.print("Please some text : ");
        if (input.hasNext()) {
            System.out.println(input.nextLine().toUpperCase());
        } else {
            System.out.println("No value entered.");
        }
    }


    /**
     * Write a program that receives numbers as program arguments and prints to console if numbers are even or odd
     * You might compile and run the program via command line or by editing configuration and pass program arguments
     */
    public static void exerciseTwo(Scanner input) {
        System.out.println("----- Exercise Two -----");
        System.out.print("Please enter a positive number : ");

        if (input.hasNextInt()) {
            int userInput = input.nextInt();

            if (userInput % 2 == 0) {
                System.out.println("Given number is even.");
            } else {
                System.out.println("Given Number is Odd");
            }
        }
    }


    /**
     * Write a program that takes an input number from the console
     * and prints if number is prime
     * Create a method to check if number is prime then use against the input
     */
    public static void exerciseThree(Scanner input) {
        System.out.println("----- Exercise Three -----");
        System.out.print("Please enter a positive number : ");
        if (input.hasNextInt()) {
            int userInput = input.nextInt();
            if (checkIsPrimeNumber(userInput)) {
                System.out.println("The given number is a prime number");
            } else {
                System.out.println("The given number is not a prime number.");
            }
        }
    }


    /**
     * Write a method that displays random joke to the user.
     * Your program should stop displaying jokes when use inputs no.
     * For e.g
     * Want to hear a joke? Yes/No
     * if yes then display joke and repeat same question
     * if no then program should exit
     */
    public static void exerciseFour(Scanner input) {
        System.out.println("----- Exercise Four -----");
        System.out.print("Want to read a joke? Type Yes/No : ");
        if (input.hasNext()) {
            String userInput = input.nextLine();
            if (userInput.toLowerCase().equals("yes")) {
                System.out.println(" ");
                System.out.println("--------------------------------------------");
                System.out.println(getRandomJoke());
                System.out.println("--------------------------------------------");
            } else {
                exerciseFour(input);
            }
        }
    }

    private static String getRandomJoke() {
        String[] jokes = {
                "What did one pirate say to the other when he beat him at chess?\n.....\nCheckmatey",
                "Why did I quit my job at the coffee shop the other day?\n.....\nIt was just the same old grind over and over.",
                "Why did the two Java methods get a divorce?\n.....\nBecause they had constant arguments.",
                "Why did the edge server go bankrupt?\n.....\nBecause it ran out of cache",
                "How many developers does it take to screw in a lightbulb?\n.....\nNone. It’s a hardware problem.",
                "Why did the Java developer teach his young kids about single quotes?\n.....\nBecause they build character."
        };

        Random random = new Random();
        int randomNumber = random.nextInt(jokes.length - 1);

        return jokes[randomNumber];
    }

    ;

    private static boolean checkIsPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
