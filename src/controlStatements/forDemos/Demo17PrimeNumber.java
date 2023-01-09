package controlStatements.forDemos;

import java.util.Scanner;

public class Demo17PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();//100
        boolean isPrime = true;
        for (int i = 2; i <=number/2 ; i++) {
            if(number%i==0){
                isPrime=false;
                break;
            }
        }
        System.out.println(isPrime?"Prime":"not a prime");

    }
}
