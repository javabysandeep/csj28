package accpetInput;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        System.out.println("Enter three numbers ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        boolean allAreEqual = number1 == number2 && number1==number3;
        boolean onlyTwoAreEqual = (number1 == number2) || (number1==number3)|| (number2==number3);

        System.out.println("All numbers are equal= "+allAreEqual);
        System.out.println("Only two numbers are equal= "+onlyTwoAreEqual);


    }
}
