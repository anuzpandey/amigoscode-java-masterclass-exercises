package com.anuzpandey;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Calculator
        // calculator(input);

        // Favourite Number
        // favouriteNumber(input);

        // Read User's name and age, then display the message
        // readUserNameAndAge(input);

        // Even or Odd Number
        // evaluateEvenOrOddNumber(input);

        // Lucky Number Evaluator
        // luckyNumberEvaluator(input);

        // Lucky Number without spaces or enters
        // luckyNumberEvaluatorAdvanced(input);

        // Calculate Rental Yield
        calculateRentalYield(input);
    }


    public static void favouriteNumber(Scanner input) {
        System.out.print("Please enter you favourite number : ");
        int favouriteNumber = input.nextInt();
        System.out.println("Your favourite number is " + favouriteNumber + ".");
    }

    public static void readUserNameAndAge(Scanner input) {
        System.out.print("Please enter your first name and age.");
        String name = input.next();
        int age = input.nextInt();
        System.out.println("Hello " + name + "! You are " + age + " years old!");
    }

    public static void evaluateEvenOrOddNumber(Scanner input) {
        System.out.print("Please enter your number : ");
        int userNumber = input.nextInt();
        if (userNumber % 2 == 0) {
            System.out.println("The number " + userNumber + " is Even Number.");
        } else {
            System.out.println("The number " + userNumber + " is Odd Number.");
        }
    }

    public static void calculator(Scanner input) {
        System.out.print("Please enter your name : ");
        System.out.println("Hello! " + input.nextLine());
        System.out.println("Please choose a number of the operation you would like to perform: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int operator = input.nextInt();
        if (operator == 1) {
            System.out.println("============= Addition =============");
            System.out.print("Please enter your first number : ");
            int firstValue = input.nextInt();
            System.out.print("Please enter you second number : ");
            int secondValue = input.nextInt();
            int sumOfValues = firstValue + secondValue;
            System.out.println("The sum of " + firstValue + " and " + secondValue + " is : " + sumOfValues);
            System.out.println("Thank you!!!");
        } else if (operator == 2) {
            System.out.println("============= Subtraction =============");
            System.out.print("Please enter your first number : ");
            int firstValue = input.nextInt();
            System.out.print("Please enter you second number : ");
            int secondValue = input.nextInt();
            int diffOfValues = firstValue - secondValue;
            System.out.println("The difference of " + firstValue + " and " + secondValue + " is : " + diffOfValues);
            System.out.println("Thank you!!!");
        } else if (operator == 3) {
            System.out.println("============= Multiplication =============");
            System.out.print("Please enter your first number : ");
            int firstValue = input.nextInt();
            System.out.print("Please enter you second number : ");
            int secondValue = input.nextInt();
            int multiplicationOfValues = firstValue * secondValue;
            System.out.println("The multiplication of " + firstValue + " and " + secondValue + " is : " + multiplicationOfValues);
            System.out.println("Thank you!!!");
        } else if (operator == 4) {
            System.out.println("============= Division =============");
            System.out.print("Please enter your first number : ");
            double firstValue = input.nextDouble();
            System.out.print("Please enter you second number : ");
            double secondValue = input.nextDouble();
            double divisionOfValues = firstValue / secondValue;
            System.out.println("The division of " + firstValue + " and " + secondValue + " is : " + divisionOfValues);
            System.out.println("Thank you!!!");
        } else {
            System.out.println("Wrong value chosen.");
        }
    }

    public static void luckyNumberEvaluator(Scanner input) {
        System.out.println("Please enter your numbers separated with space/enter [1 2 3 4] : ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        int forthNumber = input.nextInt();

        if ((firstNumber + secondNumber) == (thirdNumber + forthNumber)) {
            System.out.println("[" + firstNumber + ", " + secondNumber + ", " + thirdNumber + " and " + forthNumber + "] are Lucky Numbers.");
        } else {
            System.out.println("[" + firstNumber + ", " + secondNumber + ", " + thirdNumber + " and " + forthNumber + "] are not Lucky Numbers.");
        }
    }

    public static void luckyNumberEvaluatorAdvanced(Scanner input) {
        System.out.println("Please enter your four digit number [eg: 1221] : ");
        int userInput = input.nextInt();

        if (userInput > 999 && userInput < 10000) {
            int forthNumber = (userInput) % 10;
            int thirdNumber = (userInput / 10) % 10;
            int secondNumber = (userInput / 100) % 10;
            int firstNumber = (userInput / 1000) % 10;

            if (firstNumber + secondNumber == thirdNumber + forthNumber) {
                System.out.println("[" + firstNumber + ", " + secondNumber + ", " + thirdNumber + " and " + forthNumber + "] are Lucky Numbers.");
            } else {
                System.out.println("[" + firstNumber + ", " + secondNumber + ", " + thirdNumber + " and " + forthNumber + "] are not Lucky Numbers.");
            }
        } else {
            System.out.println("Invalid Number");
        }
    }


    private static void calculateRentalYield(Scanner input) {
        System.out.print("Please enter your monthly rental income : Rs. ");
        float monthlyRentalIncome = input.nextFloat();
        System.out.print("Please enter your price of the property : Rs. ");
        float priceOfTheProperty = input.nextFloat();

        float rentalYield = calculateRentalYield(monthlyRentalIncome, priceOfTheProperty);

        System.out.println("Your annual Rental Yield is " + rentalYield + "%.");
    }

    private static float calculateRentalYield(float monthlyRentalIncome, float priceOfTheProperty) {
        float annualRentalIncome = monthlyRentalIncome * 12;

        return (annualRentalIncome / priceOfTheProperty) * 100;
    }
}