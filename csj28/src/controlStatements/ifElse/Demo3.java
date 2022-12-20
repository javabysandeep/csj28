package controlStatements.ifElse;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("Enter the length and breadth");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        if(breadth==length){
            System.out.println("its square");
        } else {
            System.out.println("its rectangle");
        }
    }
}
