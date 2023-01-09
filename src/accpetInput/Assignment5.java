package accpetInput;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        System.out.println("Enter side of an square");
        Scanner scanner = new Scanner(System.in);
        int side = scanner.nextInt();
        System.out.println("area of square " + side * side);
        System.out.println("perimeter of square " + 4 * side);

    }
}
