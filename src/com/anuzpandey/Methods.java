package com.anuzpandey;

import java.util.Locale;

public class Methods {

    public static void main(String[] args) {
        exerciseOne(10, 12);
        exerciseTwo(123);
        System.out.println(exerciseThree(2, 2));
        exerciseFour(12, 12);
        System.out.println(exerciseFive("applE"));
        System.out.println(exerciseSix(new String[]{"A", "An", "Anu", "Anuz"}));
        exerciseSeven("Hello, I am Anuj Pandey.");
    }


    /**
     * Write a method which takes two numbers as arguments
     * and prints their sum to the terminal.
     */
    public static void exerciseOne(double numberOne, double numberTwo) {
        System.out.println("----- Exercise One -----");
        double result = numberOne + numberTwo;
        System.out.println("The sum is : " + result);
    }


    /**
     * Write a method which takes a number as an argument and returns that number negated,
     * e.g. passing 5 as an argument should return -5; passing -10 should return 10.
     */
    public static void exerciseTwo(int input) {
        System.out.println("----- Exercise Two -----");
        System.out.println(-input);
    }


    /**
     * Write a method which takes two numbers as arguments,
     * checks if they are the same and returns the
     * appropriate boolean value.
     * You should check both possible outcomes here,
     * i.e. that it returns true when it is supposed to
     * and false when it is supposed to.
     */
    public static boolean exerciseThree(int inputOne, int inputTwo) {
        System.out.println("----- Exercise Three -----");

        // if (inputOne == inputTwo) {
        //     return true;
        // }
        // return false;

        return inputOne == inputTwo;
    }


    /**
     * Write a method which takes two numbers as arguments and prints one of:
     * "The first number is larger"
     * "The second number is larger"
     * "The numbers are equal"
     * as appropriate.
     */
    public static void exerciseFour(int inputOne, int inputTwo) {
        System.out.println("----- Exercise Four -----");
        if (inputOne == inputTwo) {
            System.out.println("The numbers are equal.");
        } else if (inputOne > inputTwo) {
            System.out.println("The first number is larger.");
        } else {
            System.out.println("The second number is larger.");
        }
    }


    /**
     * Write a method which takes a string as an argument,
     * capitalizes the first letter and returns the capitalized string.
     * HINT: The .toUpperCase() method will capitalize the whole string.
     * Investigate how to split the first letter from the string,
     * capitalize that, then join the pieces back together
     */
    public static String exerciseFive(String input) {
        System.out.println("----- Exercise Five -----");

        String result = input.toLowerCase();

        return result.substring(0, 1).toUpperCase() + result.substring(1);
    }


    /**
     * Write a method which takes an array of strings as an argument
     * and returns the number of items in the array.
     */
    public static int exerciseSix(String[] input) {
        System.out.println("----- Exercise Six -----");
        return input.length;
    }


    /**
     * Write a method which takes a sentence as an argument,
     * counts the number of words in the array and
     * prints "The sentence contains X words".
     */
    public static void exerciseSeven(String sentence) {
        System.out.println("----- Exercise Seven -----");
        String[] words = sentence.split(" ");
        System.out.println(
            "The sentence contains " + words.length +
            ((words.length <= 1) ? " word." : " words.")
        );
    }

}
