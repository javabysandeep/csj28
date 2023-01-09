package controlStatements.forDemos;

import java.util.Scanner;

public class Demo19PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum =0;
        for (int i = 1; i <=number/2 ; i++) {
            if(number%i==0){
                System.out.println("factor "+i);
                sum +=i;
            }
        }
        System.out.println("Number :"+number);
        System.out.println("Sum of its factors: "+sum);
        System.out.println(sum==number?"its perfect number":"its not a perfect number");
    }
}
