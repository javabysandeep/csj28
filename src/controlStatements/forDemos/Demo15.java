package controlStatements.forDemos;

import java.util.Scanner;

public class Demo15 {
    public static void main(String[] args) {
        //multiply to numbers without using *
        System.out.println("enter two numbers ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = 0;
        for (int i = 1; i<=number1;i++){
            result = result + number2;
        }
        System.out.println("multiplication is "+result);
    }
}
