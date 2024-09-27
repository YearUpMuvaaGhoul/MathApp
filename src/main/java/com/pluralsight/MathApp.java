package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // Question 1: Create two variables to represent salary. Determine who salary is greater
        // Set initial salaries for Bob and Gary

        double bobSalary = 54000;
        double garySalary = 88000;

        // Determine the highest salary using Math.max()
        double highestSalary = Math.max(bobSalary, garySalary);

        // Print the result
        System.out.println("Bob's salary: $" + bobSalary);
        System.out.println("Gary's salary: $" + garySalary);
        System.out.println("The highest salary is $" + highestSalary);

        // Question 2: Find and display the smallest of two variables named carPrice and truckPrice. Set the variables to any value you want

//PriceComparison

        // Set prices
        double carPrice = 25000;
        double truckPrice = 32000;

        // Compare and show the smallest price
        double smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is: $" + smallestPrice);


//-----------------------------------------------------------------

// Question 3- Find and display the area of a circle whose radius is 7.25

        // Given radius
        double radius = 7.25;

        // Calculate the area
        double area = Math.PI * Math.pow(radius, 2);

        // Show the result
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

// Question 4- Find and display the square root a variable after it is set to 5

        double number = 5;
        double squareRoot = Math.sqrt(number);

        System.out.println("The square root of " + number + " is " + squareRoot);


// Question 5- Find and display the distance between the points (5, 10) and (85, 50)

        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;

        double distanceFormula = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow(y2-y1, 2));
        System.out.println("Distance between points: " + distanceFormula);


        // calculateDistance ( int x1, int y1, int x2, int y2)
            int deltaX = x2 - x1;
            int deltaY = y2 - y1;
            System.out.println(deltaX * deltaX + deltaY * deltaY);


// Question 6 - Find and display the absolute (positive) value of variable set to -3.8

            double variable = -3.8;
            double absoluteValue = Math.abs(variable);
            System.out.println("The absolute value of " + variable + " is " + absoluteValue);


// Question 7 - find a random number

            // Create a Random number
            double randNum = Math.random();
            System.out.println("Here is a random number between 0 and 1: " + randNum);

        }
    }


