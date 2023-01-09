package controlStatements.forDemos;

import java.util.Scanner;

public class Assignment01 {
    public static void main(String[] args) {
        //wap to accept 10 values and print the average
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many numbers you want to calculate average");
        int numbers = scanner.nextInt();
        System.out.println("Enter the values");
        float sum = 0;
        for (int i = 1; i <=numbers ; i++) {
            sum += scanner.nextInt();
        }
        float average = sum/numbers;
        System.out.println("Average "+average);
    }
}
