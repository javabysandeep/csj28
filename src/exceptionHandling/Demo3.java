package exceptionHandling;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        // how to handle exception with the help of try-catch
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numerator and denominator");
        try {
            // exception prone code or problematic code
            int numerator = scanner.nextInt();
            int denominator = scanner.nextInt();
            System.out.println("Division of two numbers is " +numerator/denominator);
        }
        // developer provided exception handler
        catch (InputMismatchException inputMismatchException){
            System.out.println("Invalid input type");
        }
        catch (ArithmeticException arithmeticException){
            System.out.println("Invalid input.");
        }

    }
}
