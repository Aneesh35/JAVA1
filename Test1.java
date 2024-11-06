package JAVA1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        double value1 = sc.nextDouble();

        System.out.println("Enter an operator (+, -, *, /):");
        char operator = sc.next().charAt(0);

        System.out.println("Enter second number:");
        double value2 = sc.nextDouble();

        double result;
        switch (operator) {
            case '+':
                result = value1 + value2;
                break;
            case '-':
                result = value1 - value2;
                break;
            case '*':
                result = value1 * value2;
                break;
            case '/':
                if (value2 != 0)
                    result = value1 / value2;
                else {
                    System.out.println("Error: Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
    }
}
