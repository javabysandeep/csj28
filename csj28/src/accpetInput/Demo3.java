package accpetInput;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("Enter two float values ");
        Scanner scanner = new Scanner(System.in);
        float floatValue1 = scanner.nextFloat();
        float floatValue2 = scanner.nextFloat();
        System.out.println(floatValue1+floatValue2);

    }
}
