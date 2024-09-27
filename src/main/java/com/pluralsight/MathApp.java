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
            }
        }

        //-----------------------------------------------------------------
        // Question 2: Find and display the smallest of two variables named carPrice and truckPrice. Set the variables to any value you want
 //PriceComparison
    public static void main(String[] args) {
        // Set some example prices
        double carPrice = 25000;
        double truckPrice = 32000;

        // Compare and display the smallest price
        double smallestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is: $" + smallestPrice);
    }


        //-----------------------------------------------------------------






