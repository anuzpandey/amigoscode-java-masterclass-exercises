package com.anuzpandey;

import java.util.Arrays;

public class ArraysConditionalAndMethods {

    public static void main(String[] args) {
        exerciseOne("AppleMando");
        exerciseTwo();
    }


    /**
     * Write a method that reverses any String and print to console
     * Input should be a string
     * Output should be reversed input
     */
    public static void exerciseOne(String input) {
        System.out.println("----- Exercise One -----");
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }
        System.out.println(reverse);
    }


    /**
     * Given the following String input
     * String input = "   amig os cod e  "
     * Write a method that transforms input into: Amigoscode
     */
    public static void exerciseTwo() {
        System.out.println("----- Exercise Two -----");
        String input = "   amig os cod e  ";
        char[] characters = input.toCharArray();
        String result = "";

        for (int i = 0; i <= input.length() - 1; i++) {
            if (!String.valueOf(characters[i]).equals(" ")) {
                result = result + characters[i];
            }
        }

        System.out.println(result.substring(0, 1).toUpperCase() + result.substring(1));
    }
}
