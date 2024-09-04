package exercise3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;

        System.out.println("This is basic calculator function");
        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        number1 = num1.nextDouble();

        Scanner num2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        number2 = num2.nextDouble();

        Scanner input = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        switch (operator) {

            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

    input.close();



    }
}
