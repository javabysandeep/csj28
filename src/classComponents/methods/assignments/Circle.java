package classComponents.methods.assignments;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
       // circleCircumferenceArea();
        System.out.println(isPrime(90));
    }

    private static boolean isPrime(int number) {
        boolean isPrime = true;
        for (int index = 2; index <= number / 2; index++) {
            if (number % index == 0) {
                return false;
            }
        }
        return isPrime;
    }

    private static void circleCircumferenceArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the radius of a circle ");
        float radius = scanner.nextFloat();
        System.out.println("Circumference of a Circle " + (2 * 3.142f * radius));
        System.out.println("Area of a Circle " + (3.142f * radius * radius));
    }

}
