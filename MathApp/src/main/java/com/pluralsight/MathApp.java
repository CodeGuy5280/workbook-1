package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //Question 1:
        //declare variables
        double bobSalary = 50000;
        double garySalary = 2000000.99;
        //code solution
        double highestSalary = Math.max(bobSalary, garySalary);
        //print out result
        System.out.println("The answer is " + highestSalary);

    //Question 2:
        //declare variables
        double carPrice = 24000;
        double truckPrice = 48000;
        //code solution
        double minimumPrice = Math.min(carPrice, truckPrice);
        //print out result
        System.out.println("The answer is " + minimumPrice);

        //Question 3:
        //declare variables
        double pi = 3.14;
        double radius = 7.25;

        //code solution
        double area = pi * radius * radius;
        //print solution
        System.out.println("The answer is " + area);


        //Question 4:
        //declare variables
        double rootNum = 5.0;
        //code solution
        double squareRoot = Math.sqrt(rootNum);
        //print solution
        System.out.println("The square root is " + squareRoot);

        //Question 5:
        //declare variables
        double x1 = 5, y1 = 10;
        double x2 = 85, y2 = 50;
        //code solution
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance: " + distance);

        //Question 6
        //declare variables
        double num = -3.8;

        //code solution
        double positive = Math.abs(num);

        System.out.println("The positive is " + positive);

        //Question 7
        //declare variables & code solution
        double randomNum = Math.random();

        //print solution
        System.out.println("The random number is " + randomNum);

    };
}