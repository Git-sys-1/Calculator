import java.util.Scanner;

public class Calculator {

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        System.out.println("Welcome to the Simple Calculator!");

        while (keepRunning) {
            System.out.print("\nEnter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Choose operation: +  -  *  /");
            char operator = scanner.next().charAt(0);

            double result;

            switch (operator) {
                case '+':
                    result = add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    result = divide(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid operator!");
            }

            System.out.print("\nDo you want to perform another calculation? (yes/no or y/n): ");
            String choice = scanner.next();

            if (!(choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("y"))) {
                keepRunning = false;
                System.out.println("Thank you for using the calculator!");
            }
        }

        scanner.close();
    }
}
