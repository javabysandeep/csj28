package accpetInput;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Enter two boolean values ");

        Scanner scanner = new Scanner(System.in);
        boolean value1 = scanner.nextBoolean();
        boolean value2 = scanner.nextBoolean();
        System.out.println("Logical and operation " + (value1 && value2));
    }
}
