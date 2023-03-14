package com.anuzpandey;

import java.util.Arrays;

public class ArraysConditionalAndMethods {

    public static void main(String[] args) {
        exerciseOne("Anuj");
        exerciseTwo();
        exerciseThree();
    }


    /**
     * Write a method that reverses any String and print to console
     * Input should be a string
     * Output should be reversed input
     */
    public static void exerciseOne(String input) {
        System.out.println(" ");
        System.out.println("----- Exercise One -----");
        String reverseString = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverseString += input.charAt(i);
        }

        System.out.println(reverseString);
    }


    /**
     * Given the following String input
     * String input = "   amig os cod e  "
     * Write a method that transforms input into: Amigoscode
     */
    public static void exerciseTwo() {
        System.out.println(" ");
        System.out.println("----- Exercise Two -----");
        String input = "   amig os cod e  ";

        char[] characters = input.toCharArray();
        String result = "";

        for (int i = 0; i <= characters.length - 1; i++) {
            if (!String.valueOf(characters[i]).equals(" ")) {
                result += characters[i];
            }
        }

        result = result.substring(0, 1).toUpperCase() + result.substring(1);

        System.out.println(result);
    }


    /**
     * Write a method that finds the longest string in any given array.
     * i.e. [] -> ""
     * i.e. ["hello", "ola", "bye", "ciao"] -> hello
     * i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
     * i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
     */
    public static void exerciseThree() {
        System.out.println(" ");
        System.out.println("----- Exercise Three -----");

        String[] input = {"hello", "bingo", "ola", "bye", "ciao", "namaste", "tamaste"};

        String results = "";
        String temporaryPlaceholder = "";

        for(int i = 0; i <= input.length - 1; i++) {
            if (input[i].length() > temporaryPlaceholder.length()) {
                temporaryPlaceholder = input[i];
                results = temporaryPlaceholder + ", ";
            } else if (input[i].length() == temporaryPlaceholder.length()) {
                temporaryPlaceholder = input[i];
                results += temporaryPlaceholder + ", ";
            }
        }

        System.out.println(results.substring(0, results.length() - 2));
    }
}
