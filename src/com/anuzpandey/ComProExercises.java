package com.anuzpandey;

import java.util.Arrays;

public class ComProExercises {

    public static void main(String[] args) {
        // int result1 = exerciseOne(new int[]{1, 2, 3, 4, 5});
        // int resultTwo1 = exerciseTwo(new int[]{1});

        //exerciseThree(new char[]{'a', 'b', 'c'}, 0, 3)
        // System.out.println(exerciseFour(-14513));
        // System.out.println(Arrays.toString(exerciseFive(
        //        new int[]{1, 3},
        //        new int[]{7, 9, 3}
        // )));

        // System.out.println(Arrays.toString(reverseArray(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1})));

        // System.out.println(searchChar("Hello World", 'W'));
    }


    /**
     * An array with an odd number of elements is said to be centered if all elements (except the middle one)
     * are strictly greater than the value of the middle element. Note that only arrays with an odd number
     * of elements have a middle element. Write a function that accepts an integer array and returns 1
     * if it is a centered array, otherwise it returns 0.
     */
    public static int exerciseOne(int[] centeredArray) {
        if (centeredArray.length % 2 == 0) {
            return 0;
        }

        int centerIndex = (centeredArray.length / 2);
        int centerValue = centeredArray[centerIndex];

        for (int i = 0; i < centeredArray.length; i++) {
            if (centerValue >= centeredArray[i] && i != centerIndex) {
                return 0;
            }
        }
        return 1;
    }


    /**
     * Write a function that takes an array of integers as an argument and
     * returns a value based on the sums of the even and odd numbers in
     * the array. Let X = the sum of the odd numbers in the array and
     * let Y = the sum of the even numbers. The function should
     * return X – Y
     *
     * @function signature : int f(int[ ] a)
     */
    public static Integer exerciseTwo(int[] a) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                y += a[i];
            } else {
                x += a[i];
            }
        }

        return x - y;
    }


    /**
     * Write a function that accepts a character array,
     * a zero-based start position and a length.
     * It should return a character array containing
     * length characters starting with the start character of the input array.
     * The function should do error checking on the start position and the length and
     * return null if the either value is not legal.
     * The function signature is:
     * char[ ] f(char[ ] a, int start, int len)
     */
    public static char[] exerciseThree(char[] a, int start, int len) {
        if (
                a.length < 0 ||
                        a.length < len ||
                        a.length < start ||
                        a.length <= (len + start - 1)
        ) {
            return null;
        }

        char[] newArray = new char[len];

        try {
            for (int i = start, j = 0; j < len; i++, j++) {
                newArray[j] = a[i];
            }

            return newArray;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


    /**
     * Write a function to reverse an integer using numeric operators and
     * without using any arrays or other data structures.
     * The signature of the function is:
     * int f(int n)
     */
    public static int exerciseFour(int n) {
        if (n == 0) return 0;

        int reverse = 0;
        while (n != 0) {
            reverse = (reverse * 10) + (n % 10);
            n = n / 10;
        }

        return reverse;
    }

    /**
     * Write a function to return an array containing all elements common
     * to two given arrays containing distinct positive integers.
     * You should not use any inbuilt methods. You are
     * allowed to use any number of arrays.
     * The signature of the function is:
     * int[] f(int[] first, int[] second)
     */
    public static int[] exerciseFive(int[] first, int[] second) {
        if (first == null || second == null) return null;
        if (first.length == 0 || second.length == 0) return new int[0];

        int firstArrayLength = first.length;
        int secondArrayLength = second.length;

        int minLength = firstArrayLength < secondArrayLength ? firstArrayLength : secondArrayLength;

        int[] bigArray;
        int[] smallArray;

        if (minLength == first.length) {
            bigArray = second;
            smallArray = first;
        } else {
            bigArray = first;
            smallArray = second;
        }

        int[] temporaryMinArray = new int[minLength];
        int counter = 0;
        for (int i = 0; i < bigArray.length; i++) {
            for (int j = 0; j < smallArray.length; j++) {
                if (bigArray[i] == smallArray[j]) {
                    temporaryMinArray[counter] = bigArray[i];
                    counter++;
                }
            }
        }

        int[] resultArray = new int[counter];

        for (int z = 0; z < counter; z++) {
            resultArray[z] = temporaryMinArray[z];
        }


        return resultArray;
    }


    static int[] reverseArray(int[] a) {

        int[] newArray = new int[a.length];
        int counter = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            newArray[counter] = a[i];
            counter++;
        }

        return newArray;
    }

    static int searchChar(String str, char c) {
        char[] characters = str.toCharArray();
        int lengthOfCharacters = characters.length;

        int count = 0;

        for (int i = 0; i < lengthOfCharacters; i++) {
            if (characters[i] == c) {
                count++;
            }
        }

        return count;

    }


}
