package accpetInput;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        System.out.println("Enter the length and breadth of a rectangle  ");
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        System.out.println("Area : " + (int)(length * breadth));
    }
}
