package com.Naveen_Patil.Program1;

import java.util.Scanner;

public class Program1 {
    double a;
    double b;

    public Program1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculate(String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error: Division by zero.");
                    return Double.NaN;
                }
            default:
                System.out.println("Invalid operation.");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = sc.nextLine();
        Program1 calc = new Program1(a, b);
        double result = calc.calculate(operation);
        System.out.println("Result: " + result);
        sc.close();
    }
}
