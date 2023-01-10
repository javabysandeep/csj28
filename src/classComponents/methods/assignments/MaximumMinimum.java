package classComponents.methods.assignments;

import java.util.Scanner;

public class MaximumMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter three numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println("Maximum " + getMaximum(number1, number2, number3));
        System.out.println("Minimum " + getMinimum(number1, number2, number3));

    }

    static int getMaximum(int number1, int number2, int number3) {
        return (number1 >= number2) && (number1 >= number3)
                ? number1
                : (number2 >= number1) && (number2 >= number3) ? number2 : number3;
    }

    static int getMinimum(int number1, int number2, int number3) {
        return (number1 <= number2) && (number1 <= number3)
                ? number1
                : (number2 <= number1) && (number2 <= number3) ? number2 : number3;
    }
}
