package controlStatements.forDemos;

import java.util.Scanner;

public class Demo22ArmstrongNumber {
    public static void main(String[] args) {
        //armstrong: if sum of cube of digits = original number itself
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int originalNumber = number;
        int sumOfDigits = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            sumOfDigits = sumOfDigits + lastDigit * lastDigit * lastDigit; // sum +=digit;
            number = number / 10;
        }
        System.out.println("Sum of digit cube " + sumOfDigits);
        System.out.println(originalNumber == sumOfDigits ? "armstrong" : "not a armstrong");
    }
}
