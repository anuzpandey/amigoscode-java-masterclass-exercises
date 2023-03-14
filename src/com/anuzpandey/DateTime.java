package com.anuzpandey;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class DateTime {

    public static void main(String[] args) {
        // exerciseOne();
        // exerciseTwo();
        exerciseThree();
    }


    // Print today Date and Time using LocalDate and LocalDateTime
    public static void exerciseOne() {
        System.out.println("----- Exercise One -----");
        LocalDate localDate = LocalDate.now();
        System.out.println("Today date is : " + localDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm a");
        LocalDateTime localDateTime = LocalDateTime.now();
        String formattedDateTime = localDateTime.format(formatter);
        System.out.println("Today date and time is : " + localDateTime);
        System.out.println("Formatted Today date and time is : " + formattedDateTime);
    }


    /**
     * Add 100 days to your date of birth and print it
     */
    public static void exerciseTwo() {
        System.out.println("----- Exercise Two -----");
        LocalDate myDateOfBirth = LocalDate.of(1995, 4, 22);
        String result = String.valueOf(myDateOfBirth.plusDays(100));
        System.out.println(result);
    }


    /**
     * Write a method that calculate age on any given date
     */
    public static void exerciseThree() {
        System.out.println("----- Exercise Three -----");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your Birth Year (YYYY) : ");
        if (input.hasNext()) {
            String userYear = input.nextLine();
            LocalDate todayDate = LocalDate.now();
            int userYearInt = Integer.parseInt(userYear);
            int currentYear = todayDate.getYear();
            if (userYearInt == currentYear) {
                System.out.println("You were born in this year. :)");
            } else if (userYearInt > currentYear) {
                System.out.println("You are not born yet. :(");
            } else {
                int age = currentYear - userYearInt;
                System.out.println("Your age is " + age + " :E");
            }
        }
    }

}
