package controlStatements.forDemos;

import java.util.Scanner;

public class Demo18Factors {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <=number/2 ; i++) {
            if(number%i==0){
                System.out.println("factor "+i);
            }
        }
    }
}
