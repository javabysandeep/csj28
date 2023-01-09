package controlStatements.ifElse;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        System.out.println("Enter the two numbers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if(number1 >number2){
            System.out.println("number1 is greater "+number1);
        } else {
            System.out.println("number2 is greater "+number2);
        }
    }
}
