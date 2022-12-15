package accpetInput;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        float floatValue = scanner.nextFloat();
        double nextDouble = scanner.nextDouble();
        long longValue = scanner.nextLong();
        boolean booleanValue = scanner.nextBoolean();

        System.out.println("Addition of two numbers is "+(number1+number2));
    }
}
