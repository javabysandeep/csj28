package controlStatements.switchDemos;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("Enter the month in number format");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        if (month == 1) {
            System.out.println("Jan");
        } else if (month == 2) {
            System.out.println("Feb");
        } else if (month == 3) {
            System.out.println("Mar");
        } else if (month == 4) {
            System.out.println("April");
        } else if (month == 5) {
            System.out.println("May");
        } else if (month == 6) {
            System.out.println("June");
        } else if (month == 7) {
            System.out.println("July");
        } else if (month == 8) {
            System.out.println("Aug");
        } else if (month == 9) {
            System.out.println("Sept");
        } else if (month == 10) {
            System.out.println("Oct");
        } else if (month == 11) {
            System.out.println("Nov");
        } else if (month == 12) {
            System.out.println("Dec");
        } else {
            System.out.println("Invalid input");
        }
    }
}
