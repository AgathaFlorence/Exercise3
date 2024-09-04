package exercise3;
import java.util.Scanner;

public class Sumdigit {
    public static void sumdigitnumber() {
        int number, digit, sum = 0;
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number = num.nextInt();
        while(number > 0)
        {
//finds the last digit of the given number
            digit = number % 10;

//adds last digit to the variable sum
            sum = sum + digit;

//removes the last digit from the number
            number = number / 10;
        }
//prints the result
        System.out.println("Sum of Digits: "+sum);

    }
}

