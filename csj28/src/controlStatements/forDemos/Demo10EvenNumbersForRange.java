package controlStatements.forDemos;

import java.util.Scanner;

public class Demo10EvenNumbersForRange {
    public static void main(String[] args) {
        System.out.println("Enter the range ");
        Scanner scanner = new Scanner(System.in);
        int startRange = scanner.nextInt();
        int endRange = scanner.nextInt();

        for (int i = startRange; i <= endRange; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
