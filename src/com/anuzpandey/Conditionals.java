package com.anuzpandey;

public class Conditionals {

    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
        exerciseFive();
        exerciseSix();
        exerciseSeven();
        exerciseEight();
        exerciseNine();
    }


    /**
     * create an integer variable
     * create a second integer variable
     * create an `if` statement which compares the two variables and prints to the console if they are equal
     */
    public static void exerciseOne() {
        System.out.println("----- Exercise One -----");
        int firstIntVariable = 1;
        int secondIntVariable = 1;
        if (firstIntVariable == secondIntVariable) {
            System.out.println("Values are equal");
        }
    }


    /**
     * create a string variable
     * create a second string variable which has the same value as the first
     * create an `if` statement which compares the two variables and prints to the console if they are equal
     */
    public static void exerciseTwo() {
        System.out.println("----- Exercise Two -----");
        String firstVariable = "AnuzPandey";
        String secondVariable = "AnuzPandey";
        if (firstVariable == secondVariable) {
            System.out.println("Values are Equal");
        }
    }


    /**
     * create a string variable using the `new` keyword
     * create a second string variable which has the same value as the first, again using the `new` keyword
     * create an `if` statement which compares the two variables and prints to the console if they are equal
     */
    public static void exerciseThree() {
        System.out.println("----- Exercise Three -----");
        String variableOne = new String("AnuzPandey");
        String variableTwo = new String("AnuzPandey");
        if (variableOne.equals(variableTwo)) {
            System.out.println("Value are Same");
        }
    }


    /**
     * create two `int` variables. Assign them values
     * create an `if` statement which compares whether one value is greater than the other
     * print something to the console if the condition is met
     * create an `else` statement which prints to the console if the above condition is NOT met
     */
    public static void exerciseFour() {
        System.out.println("----- Exercise Four -----");
        int variableOne = 5;
        int variableTwo = 2;
        if (variableOne > variableTwo) {
            System.out.println(variableOne + " is greater than " + variableTwo);
        } else {
            System.out.println(variableTwo + " is greater than " + variableOne);
        }
    }


    /**
     * create three `int` variables. Assign them values with the first value sitting between the other two
     * create an `if` statement which compares whether the first value is greater than the second AND less than the third
     * print something to the console if the condition is met
     * create an `else` statement which prints to the console if the above condition is NOT met
     */
    public static void exerciseFive() {
        System.out.println("----- Exercise Five -----");
        int firstValue = 2;
        int secondValue = 1;
        int thirdValue = 3;
        if (firstValue > secondValue && firstValue < thirdValue) {
            System.out.println(firstValue + " is greater than " + secondValue + " and less than " + thirdValue);
        } else {
            System.out.println("Condition doesn't match");
        }
    }


    /**
     * Modify your answer to Question 5 to instead use an OR operator.
     * Play about with the values assigned to your three variables,
     * noting how the behaviour changes.
     */
    public static void exerciseSix() {
        System.out.println("----- Exercise Six -----");
        int firstValue = 2;
        int secondValue = 1;
        int thirdValue = 3;
        if (firstValue > secondValue || firstValue < thirdValue) {
            System.out.println(firstValue + " is greater than " + secondValue + " and less than " + thirdValue);
        } else {
            System.out.println("Condition doesn't match");
        }
    }


    /**
     * create a String variable and assign it a value
     * create an `if` statement which grabs the first letter of your word and compares it against a Character value
     * print something to the console if the condition is met
     */
    public static void exerciseSeven() {
        System.out.println("----- Exercise Seven -----");
        String firstVariable = "AnuzPandey";
        if (firstVariable.charAt(0) == 'A') {
            System.out.println("Matched!");
        } else {
            System.out.println("Didnt Match.");
        }
    }


    /**
     * create a String variable and assign it a value
     * create a `for` loop which wraps around your answer from Question 7
     * modify your `if` statement to check the character at each index
     * Hint: use your internal, incrementing value of your `for` loop within the `.charAt()` method
     * print something to the console if the condition is met
     */
    public static void exerciseEight() {
        System.out.println("----- Exercise Eight -----");
        String firstValue = "AnuzPandey";
        for (int i = 0; i < firstValue.length(); i++) {
            if (firstValue.charAt(i) == 'A') {
                System.out.println("Matched!");
            }
        }
    }


    /**
     * create a for loop which goes from 0 to 20
     * print each even value
     */
    public static void exerciseNine() {
        System.out.println("----- Exercise Nine -----");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number");
            }
        }
    }
}
