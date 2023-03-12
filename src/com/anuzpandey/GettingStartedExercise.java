package com.anuzpandey;

public class GettingStartedExercise {

    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
        exerciseFive();
    }

    /**
     * Write a program that compares two numbers. Use any comparison operator
     * Create 3 variables.
     * 2 variables to store both numbers and 1 variable store the result
     * Print the result
     */
    public static void exerciseOne() {
        int numberOne = 2;
        int numberTwo = 1;
        boolean result = numberOne == numberTwo;
        System.out.println("The Result is : " + result);
    }

    /**
     * Write a program that compares two String contents.
     * Create 3 variables.
     * 2 to store both strings and 1 to store the result
     * Print the result
     */
    public static void exerciseTwo() {
        String stringOne = "Hello";
        String stringTwo = "Hello";
        boolean comparisonResult = stringOne.equals(stringTwo);
        System.out.println("The Result is : " + comparisonResult);
    }


    // Write a program that transform "Amigoscode" to "AMIGOSCODE"
    public static void exerciseThree() {
        String brand = "Amigoscode";
        System.out.println(brand.toUpperCase());
    }

    /**
     * Write a program that compares two numbers. i.e x > y
     * Create 3 variables.
     * 2 to store both numbers and 1 to store the result
     * Print the result
     */
    public static void exerciseFour() {
        int x = 5;
        int y = 2;
        boolean result = x > y;
        System.out.println("The result is : " + result);
    }


    /**
     * Fix the Error
     * ```
     * static void main(String args) {
     *         System.out.println("Fixed");
     * ```
     */
    public static void exerciseFive() {
        System.out.println("Fixed");
    }

}
