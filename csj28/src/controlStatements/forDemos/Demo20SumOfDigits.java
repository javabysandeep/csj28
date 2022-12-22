package controlStatements.forDemos;

import java.util.Scanner;

public class Demo20SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sumOfDigits =0;

        while (number>0){
            int lastDigit = number%10;
            sumOfDigits = sumOfDigits + lastDigit; // sum +=digit;
            number = number/10;
        }
        System.out.println("Sum of digits "+sumOfDigits);
    }
}
