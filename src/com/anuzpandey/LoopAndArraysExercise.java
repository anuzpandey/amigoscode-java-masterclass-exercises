package com.anuzpandey;

import java.util.Arrays;

public class LoopAndArraysExercise {

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
        exerciseTen();
        exerciseEleven();
        exerciseTwelve();
        exerciseThirteen();
        exerciseFourteen();
        exerciseFifteen();
    }

    /**
     * Exercise One
     * declare an empty integer array of length = 3
     * print the contents to the console
     */
    public static void exerciseOne() {
        System.out.println("----- Exercise One -----");
        Integer[] integerArray = new Integer[3];
        System.out.println(Arrays.toString(integerArray));
    }

    /**
     * fill it with the number `4`
     * print the array to the console
     */
    public static void exerciseTwo() {
        System.out.println("----- Exercise Two -----");
        Integer[] integerArray = new Integer[3];
        integerArray[0] = 4;
        integerArray[1] = 4;
        integerArray[2] = 4;
        System.out.println(Arrays.toString(integerArray));
    }

    /**
     * reassign the second value in the array to the number `17`
     * print the array to the console
     */
    public static void exerciseThree() {
        System.out.println("----- Exercise Three -----");
        Integer[] integerArray = new Integer[3];
        integerArray[0] = 4;
        integerArray[1] = 4;
        integerArray[2] = 4;

        integerArray[1] = 17;
        System.out.println(Arrays.toString(integerArray));
    }

    /**
     * What happens when you try to re-assign index 5 to any integer?
     *
     * @answer - ArrayIndexOutOfBoundsException is thrown
     */
    public static void exerciseFour() {
        System.out.println("----- Exercise Four -----");
        int[] numbers = {1, 2, 3, 4, 5};
        // numbers[5] = 1;
        // System.out.println(Arrays.toString(numbers));
        System.out.println("Throws ArrayIndexOutOfBoundsException");
    }

    /**
     * declare and initialize a String array which holds the values "a", "b", "c" and "d"
     * print the array to the console
     */
    public static void exerciseFive() {
        System.out.println("----- Exercise Five -----");
        String[] strings = {"a", "b", "c", "d"};
        System.out.println(Arrays.toString(strings));
    }


    /**
     * using your answer from Q5 above, create a second array which is initialized using your original array
     * hint: instead of using the `new` keyword, try simply giving the name of your original array
     * change the value at index 0 of the new array to "z"
     * print both of your arrays and compare
     */
    public static void exerciseSix() {
        System.out.println("----- Exercise Six -----");
        String[] strings = {"a", "b", "c", "d"};
        String[] newStrings = strings;
        newStrings[0] = "z";
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(newStrings));
    }

    /**
     * using your answer to Q6, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
     * NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied and second being the length of the new array
     * change the value at index 0 of the new array to "z"
     * print both of the arrays and compare
     */
    public static void exerciseSeven() {
        System.out.println("----- Exercise Seven -----");
        String[] strings = {"a", "b", "c", "d"};
        String[] newStrings = strings;
        String[] newCopyStrings = Arrays.copyOf(strings, 4);
        newCopyStrings[0] = "z";
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(newCopyStrings));
    }


    /**
     * create a for loop which goes from 0 to 10
     * print each value
     */
    public static void exerciseEight() {
        System.out.println("----- Exercise Eight -----");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }

    /**
     * create a for loop which goes from 10 down to 0
     * print each value
     */
    public static void exerciseNine() {
        System.out.println("----- Exercise Nine -----");
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }

    /**
     * create an array. Remember to manually set the size
     * create a for loop which goes from 0 to 10, adding each value to an array
     * print our array
     */
    public static void exerciseTen() {
        System.out.println("----- Exercise Ten -----");
        int[] numbersArray = new int[11];
        for (int i = 0; i <= 10; i++) {
            numbersArray[i] = i;
        }
        System.out.println(Arrays.toString(numbersArray));
    }

    /**
     * create an array of n numbers
     * create a sum variable
     * create a loop
     * add each item to the sum value
     * outside the loop print the total sum
     */
    public static void exerciseEleven() {
        System.out.println("----- Exercise Eleven -----");
        int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            sum += arrayOfNumbers[i];
        }
        System.out.println("Sum of the array of numbers is : " + sum);
    }


    /**
     * Create a loop that makes all words in an array uppercase, print the array
     * Start with the array: ["i", "sure", "do", "love", "bees"].
     * Create a for loop which makes each word uppercase in the array.
     * Print the contents of the array in the terminal.
     * Hint: You could achieve this by either creating a second array which you add to,
     * or by reassigning the values in the initial array.
     */
    public static void exerciseTwelve() {
        System.out.println("----- Exercise Twelve -----");
        String[] arrayOfString = {"i", "sure", "do", "love", "bees"};
        for (int i = 0; i < arrayOfString.length; i++) {
            arrayOfString[i] = arrayOfString[i].toUpperCase();
        }
        System.out.println(Arrays.toString(arrayOfString));
    }


    /**
     * Create a loop that capitalises each word in an array, prints the new array
     * Start with the array: ["i", "sure", "do", "love", "bees"].
     * Create a for loop which makes each word uppercase in the array.
     * Print the contents of the array in the terminal.
     * Hint: You could make use of the .charAt() method to grab a specific
     * character (letter) at the specified index
     * Hint: You could make use of the .substring() method which works on
     * strings to grab the part of a given string forward from the
     * specified index
     */
    public static void exerciseThirteen() {
        System.out.println("----- Exercise Thirteen -----");
        String[] arrayOfString = {"i", "sure", "do", "love", "bees"};
        for (int i = 0; i < arrayOfString.length; i++) {
            String temporaryValue = "";
            String stringValue = arrayOfString[i];
            for (int j = 0; j < stringValue.length(); j++) {
                char character = stringValue.charAt(j);
                temporaryValue += Character.toString(character).toUpperCase();
            }
            arrayOfString[i] = temporaryValue;
        }
        System.out.println(Arrays.toString(arrayOfString));
    }

    /**
     * Write a program that reverses an array of Strings
     * String[] content = {"you", "are", "how", "hello"}
     * Tip. Use for loop and you to start at highest index.
     * Output should be: hello how are you?. Note question mark at the end
     */
    public static void exerciseFourteen() {
        System.out.println("----- Exercise Fourteen -----");
        String[] arrayOfStrings = {"you", "are", "how", "hello"};
        String copyArray = "";
        for (int i = arrayOfStrings.length - 1; i >= 0; i--) {
            if (i == 0) {
                copyArray += arrayOfStrings[i];
            } else {
                copyArray += arrayOfStrings[i] + " ";
            }

        }
        System.out.println(copyArray + "?");
    }


    /**
     * Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".
     * Tip:
     * - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
     * - create variable to store result. double result = 0;
     * - convert string to array by using the String[] numbers = input.slip(", ")
     * - then loop.
     * - convert each string to decimal and add to current result
     * - use Double.parseDouble(string) to convert a string to double
     */
    public static void exerciseFifteen() {
        System.out.println("----- Exercise Fifteen -----");
        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        double result = 0;
        String[] numbers = input.split(", ");
        for (int i = 0; i < numbers.length; i++) {
            result += Double.parseDouble(numbers[i]);
        }

        System.out.println("The sum of given numbers is : " + result);
    }

}
