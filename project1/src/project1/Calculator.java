package project1;

import java.util.Scanner;

public class Calculator {
    private double num1;
    private double num2;
    private double result;
    private boolean continueCalculation;
    
    public void add() {
        result = num1 + num2;
    }
    
    public void subtract() {
        result = num1 - num2;
    }
    
    public void multiply() {
        result = num1 * num2;
    }
    
    public void divide() {
        if (num2 != 0) {
            result = num1 / num2;
        } else {
            System.out.println("Error: Cannot divide by zero");
        }
    }
    
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();
    }
    
    public void displayResult() {
        System.out.println("Result: " + result);
    }
    
    public boolean getContinueOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to perform another calculation? (Y/N): ");
        String input = scanner.next();
        return input.equalsIgnoreCase("Y");
    }
    
    public void reset() {
        num1 = 0;
        num2 = 0;
        result = 0;
    }
    
    public void run() {
        continueCalculation = true;
        while (continueCalculation) {
            getInput();
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch(choice) {
                case 1:
                    add();
                    break;
                case 2:
                    subtract();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                default:
                    System.out.println("Error: Invalid choice");
            }
            displayResult();
            continueCalculation = getContinueOption();
            reset();
        }
    }
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.run();
    }
}
