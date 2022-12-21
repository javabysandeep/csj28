package controlStatements.forDemos;

import java.util.Scanner;

public class Demo14 {
    public static void main(String[] args) {
        //print the table of any number
        System.out.println("enter the number ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * number);
        }
    }
}
