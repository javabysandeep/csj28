package controlStatements.ifElse;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("please enter budget");
        Scanner scanner = new Scanner(System.in);
        int budget = scanner.nextInt();
        if (budget > 50000) {
            System.out.println("Goa");
        }
        //System.out.println("indepedent statement");
        else {
            System.out.println(10/0);
            System.out.println("stay home stay safe");
        }
    }
}
