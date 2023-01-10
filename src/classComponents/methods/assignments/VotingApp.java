package classComponents.methods.assignments;

import java.util.Scanner;

public class VotingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the age ");
        int age = scanner.nextInt();
        System.out.println("Is eligible vote "+ isEligible(age));
    }

    private static boolean isEligible(int age) {
        return age >=18?true:false;
    }
}
